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
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.String str9 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.Object[] objArray5 = derivativeException3.getArguments();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.String str10 = iOException9.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str10, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Class<?> wildcardClass16 = derivativeException12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException9.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.Class<?> wildcardClass10 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.lang.String str20 = iOException18.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.io.IOException: " + "'", str20, "java.io.IOException: ");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Class<?> wildcardClass10 = iOException9.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str2, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.Class<?> wildcardClass6 = derivativeException5.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.Class<?> wildcardClass10 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray16 = derivativeException12.getSuppressed();
        java.lang.Class<?> wildcardClass17 = derivativeException12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.lang.Class<?> wildcardClass3 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException4);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: hi!" + "'", str8, "java.io.IOException: hi!");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str11 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str11, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = derivativeException3.getArguments();
        java.lang.Class<?> wildcardClass10 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.lang.Class<?> wildcardClass22 = iOException20.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.Throwable[] throwableArray14 = derivativeException13.getSuppressed();
        java.lang.String str15 = derivativeException13.getPattern();
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        java.lang.Throwable[] throwableArray17 = derivativeException13.getSuppressed();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.Object[] objArray5 = derivativeException3.getArguments();
        java.lang.String str6 = derivativeException3.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.io.IOException iOException1 = new java.io.IOException("");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: " + "'", str2, "java.io.IOException: ");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.Class<?> wildcardClass4 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException8);
        java.lang.String str12 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str12, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = derivativeException7.getArguments();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException(throwable0);
        java.lang.Object[] objArray2 = derivativeException1.getArguments();
        java.lang.String str3 = derivativeException1.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str3, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray21 = iOException19.getSuppressed();
        java.lang.Class<?> wildcardClass22 = throwableArray21.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException11 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException10);
        java.lang.String str12 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str12, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass11 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.lang.Class<?> wildcardClass11 = iOException9.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.String[] strArray2 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String str4 = derivativeException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str4, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        iOException3.addSuppressed((java.lang.Throwable) derivativeException10);
        java.lang.String str17 = iOException3.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str17, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str5, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Class<?> wildcardClass6 = iOException5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.Object[] objArray8 = derivativeException5.getArguments();
        java.lang.String str9 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray10 = derivativeException9.getArguments();
        java.lang.String str11 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str11, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass6 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.Class<?> wildcardClass11 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.Class<?> wildcardClass8 = derivativeException5.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Class<?> wildcardClass4 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.Class<?> wildcardClass12 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException7);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str9, "java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = derivativeException3.getArguments();
        java.lang.Throwable[] throwableArray10 = derivativeException3.getSuppressed();
        java.lang.Class<?> wildcardClass11 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.Object[] objArray7 = derivativeException5.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException8);
        java.lang.Class<?> wildcardClass11 = iOException8.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException10);
        java.lang.Class<?> wildcardClass13 = iOException12.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.String str21 = iOException19.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: " + "'", str21, "java.io.IOException: ");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str5, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.io.IOException iOException13 = new java.io.IOException("", (java.lang.Throwable) derivativeException12);
        java.lang.Class<?> wildcardClass14 = derivativeException12.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String str16 = derivativeException12.getPattern();
        java.lang.String str17 = derivativeException12.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str17, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException5.addSuppressed(throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass5 = iOException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str4 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException" + "'", str4, "java.io.IOException");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = derivativeException7.getSuppressed();
        java.lang.String str11 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str11, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.String str19 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str19, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.String str10 = derivativeException7.getPattern();
        java.lang.Throwable[] throwableArray11 = derivativeException7.getSuppressed();
        java.lang.Class<?> wildcardClass12 = throwableArray11.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.String str6 = iOException4.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str6, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) derivativeException13);
        java.lang.String str18 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str18, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException3.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = derivativeException7.getArguments();
        java.lang.String str10 = derivativeException7.getPattern();
        java.lang.Class<?> wildcardClass11 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException10);
        java.lang.String str12 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str12, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.Throwable[] throwableArray12 = derivativeException10.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.Class<?> wildcardClass14 = derivativeException13.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.String str15 = derivativeException12.getPattern();
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray17 = derivativeException12.getSuppressed();
        java.lang.Class<?> wildcardClass18 = throwableArray17.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.Class<?> wildcardClass7 = derivativeException5.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray22 = derivativeException20.getArguments();
        java.lang.String str23 = derivativeException20.getPattern();
        java.io.IOException iOException24 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException20);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        derivativeException28.addSuppressed((java.lang.Throwable) derivativeException32);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) derivativeException32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException34);
        java.lang.Throwable[] throwableArray36 = iOException34.getSuppressed();
        iOException24.addSuppressed((java.lang.Throwable) iOException34);
        derivativeException11.addSuppressed((java.lang.Throwable) iOException24);
        java.lang.Class<?> wildcardClass39 = iOException24.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String str6 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.String str21 = iOException20.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str21, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: hi!" + "'", str3, "java.io.IOException: hi!");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.Class<?> wildcardClass16 = derivativeException15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str10 = derivativeException7.getPattern();
        java.lang.Class<?> wildcardClass11 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException10);
        java.lang.Class<?> wildcardClass12 = iOException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.Class<?> wildcardClass8 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException8);
        java.lang.Class<?> wildcardClass12 = iOException11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray9);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException" + "'", str16, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.Object[] objArray5 = derivativeException3.getArguments();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        java.lang.String str7 = derivativeException3.getPattern();
        java.lang.Object[] objArray8 = derivativeException3.getArguments();
        java.lang.Class<?> wildcardClass9 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray6);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass11 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.lang.String str20 = iOException19.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.io.IOException: " + "'", str20, "java.io.IOException: ");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray8);
        java.lang.Class<?> wildcardClass14 = derivativeException13.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        java.lang.Class<?> wildcardClass10 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.lang.Class<?> wildcardClass20 = iOException6.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        java.lang.Class<?> wildcardClass14 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.lang.String str11 = iOException9.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str11, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray10 = derivativeException7.getArguments();
        java.lang.String str11 = derivativeException7.getPattern();
        java.lang.String str12 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.lang.String str9 = iOException7.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: hi!" + "'", str9, "java.io.IOException: hi!");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray8 = derivativeException4.getArguments();
        java.lang.Object[] objArray9 = derivativeException4.getArguments();
        java.lang.String str10 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.Throwable[] throwableArray15 = derivativeException14.getSuppressed();
        java.lang.String str16 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!" + "'", str16, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException13);
        java.lang.String str15 = iOException14.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str15, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.Class<?> wildcardClass14 = derivativeException13.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str9, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray16 = derivativeException12.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.lang.Class<?> wildcardClass19 = derivativeException12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.Object[] objArray7 = derivativeException5.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException8);
        java.lang.String str11 = iOException8.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: hi!" + "'", str11, "java.io.IOException: hi!");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray8);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str14, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Class<?> wildcardClass8 = derivativeException4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str11 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str11, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "org.apache.commons.math.ode.DerivativeException", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str8, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Throwable[] throwableArray6 = derivativeException3.getSuppressed();
        java.lang.Class<?> wildcardClass7 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException15.getArguments();
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.Object[] objArray23 = derivativeException15.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.Throwable throwable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException15.addSuppressed(throwable25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str11 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str11, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.String str8 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        iOException20.addSuppressed((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) derivativeException31);
        java.lang.String str34 = iOException33.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str34, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.Object[] objArray8 = derivativeException7.getArguments();
        java.lang.Class<?> wildcardClass9 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Class<?> wildcardClass7 = iOException6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String str7 = derivativeException5.getPattern();
        java.lang.String str8 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: " + "'", str7, "java.io.IOException: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException2);
        java.lang.String str5 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException" + "'", str5, "java.io.IOException");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: hi!" + "'", str3, "java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray16);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) derivativeException20);
        iOException7.addSuppressed((java.lang.Throwable) derivativeException20);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException20);
        java.lang.String str24 = derivativeException20.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str24, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.lang.Class<?> wildcardClass9 = derivativeException8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.Object[] objArray13 = derivativeException11.getArguments();
        java.lang.String str14 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str14, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.lang.String str12 = iOException9.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str12, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.lang.Object[] objArray7 = derivativeException4.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException4);
        java.lang.String str9 = derivativeException4.getPattern();
        java.lang.String str10 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray22 = derivativeException16.getArguments();
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.Object[] objArray24 = derivativeException16.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.lang.Object[] objArray26 = derivativeException16.getArguments();
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) derivativeException16);
        java.lang.String str28 = iOException27.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.io.IOException: " + "'", str28, "java.io.IOException: ");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException14 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException12);
        java.lang.String str15 = iOException14.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str15, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.Throwable throwable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException15.addSuppressed(throwable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        java.lang.Throwable[] throwableArray7 = derivativeException3.getSuppressed();
        java.lang.Class<?> wildcardClass8 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        derivativeException19.addSuppressed((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        iOException15.addSuppressed((java.lang.Throwable) derivativeException23);
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) iOException15);
        java.io.IOException iOException28 = new java.io.IOException("", (java.lang.Throwable) iOException27);
        derivativeException3.addSuppressed((java.lang.Throwable) iOException28);
        java.lang.String str30 = derivativeException3.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str30, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        java.lang.String str13 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str13, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.String str8 = derivativeException3.getPattern();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException3.addSuppressed(throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException10);
        java.lang.Class<?> wildcardClass13 = iOException12.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray10 = derivativeException9.getArguments();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass5 = iOException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.lang.String str5 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str5, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        java.lang.Class<?> wildcardClass20 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.lang.Object[] objArray7 = derivativeException4.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException4);
        java.lang.String str9 = derivativeException4.getPattern();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        java.lang.Class<?> wildcardClass12 = iOException10.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String str7 = iOException6.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str7, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray5);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        java.lang.Class<?> wildcardClass14 = derivativeException13.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.Object[] objArray10 = derivativeException7.getArguments();
        java.lang.Class<?> wildcardClass11 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        iOException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        iOException21.addSuppressed((java.lang.Throwable) derivativeException32);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) derivativeException32);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) derivativeException40);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("", strArray44);
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("", strArray48);
        derivativeException45.addSuppressed((java.lang.Throwable) derivativeException49);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException49);
        iOException41.addSuppressed((java.lang.Throwable) derivativeException49);
        java.io.IOException iOException53 = new java.io.IOException("", (java.lang.Throwable) iOException41);
        java.io.IOException iOException54 = new java.io.IOException("", (java.lang.Throwable) iOException41);
        java.lang.String[] strArray61 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray61);
        iOException41.addSuppressed((java.lang.Throwable) derivativeException62);
        derivativeException32.addSuppressed((java.lang.Throwable) derivativeException62);
        java.io.IOException iOException65 = new java.io.IOException("", (java.lang.Throwable) derivativeException62);
        java.lang.Object[] objArray66 = derivativeException62.getArguments();
        java.lang.Class<?> wildcardClass67 = derivativeException62.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        iOException20.addSuppressed((java.lang.Throwable) derivativeException31);
        java.lang.Object[] objArray33 = derivativeException31.getArguments();
        java.lang.Class<?> wildcardClass34 = derivativeException31.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException17.addSuppressed(throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray5);
        java.lang.String str8 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException" + "'", str8, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.String str10 = derivativeException7.getPattern();
        java.lang.String str11 = derivativeException7.getPattern();
        java.lang.String str12 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException14);
        java.lang.Class<?> wildcardClass17 = derivativeException14.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException10);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException10);
        java.lang.Throwable[] throwableArray14 = derivativeException10.getSuppressed();
        java.lang.String str15 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.Throwable[] throwableArray15 = derivativeException14.getSuppressed();
        java.lang.Class<?> wildcardClass16 = derivativeException14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.Class<?> wildcardClass11 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Object[] objArray8 = derivativeException7.getArguments();
        java.lang.Object[] objArray9 = derivativeException7.getArguments();
        java.lang.String str10 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str10, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray5);
        java.lang.Class<?> wildcardClass10 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException27);
        java.lang.Class<?> wildcardClass29 = iOException6.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray7 = iOException3.getSuppressed();
        java.lang.Class<?> wildcardClass8 = throwableArray7.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.Throwable[] throwableArray12 = derivativeException10.getSuppressed();
        java.lang.Object[] objArray13 = derivativeException10.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException10);
        java.lang.String str16 = iOException15.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str16, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException14);
        java.lang.String str16 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException9);
        java.lang.Object[] objArray11 = derivativeException9.getArguments();
        java.lang.String str12 = derivativeException9.getPattern();
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        derivativeException17.addSuppressed((java.lang.Throwable) derivativeException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException23);
        java.lang.Throwable[] throwableArray25 = iOException23.getSuppressed();
        iOException13.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException23);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) derivativeException32);
        iOException23.addSuppressed((java.lang.Throwable) derivativeException32);
        java.lang.Throwable[] throwableArray35 = iOException23.getSuppressed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException4);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.Object[] objArray5 = derivativeException3.getArguments();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        java.lang.Object[] objArray7 = derivativeException3.getArguments();
        java.lang.String str8 = derivativeException3.getPattern();
        java.lang.Class<?> wildcardClass9 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.lang.String str12 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str12, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Object[] objArray8 = derivativeException7.getArguments();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray22 = derivativeException16.getArguments();
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.Object[] objArray24 = derivativeException16.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) derivativeException31);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        derivativeException36.addSuppressed((java.lang.Throwable) derivativeException40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException40);
        iOException32.addSuppressed((java.lang.Throwable) derivativeException40);
        java.io.IOException iOException44 = new java.io.IOException("", (java.lang.Throwable) iOException32);
        java.io.IOException iOException45 = new java.io.IOException("", (java.lang.Throwable) iOException44);
        java.io.IOException iOException46 = new java.io.IOException((java.lang.Throwable) iOException45);
        java.lang.Throwable[] throwableArray47 = iOException45.getSuppressed();
        derivativeException16.addSuppressed((java.lang.Throwable) iOException45);
        java.io.IOException iOException49 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException45);
        java.lang.Class<?> wildcardClass50 = iOException45.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray11 = derivativeException10.getArguments();
        java.io.IOException iOException12 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.Object[] objArray14 = derivativeException13.getArguments();
        java.lang.String str15 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.Object[] objArray16 = derivativeException14.getArguments();
        java.lang.Class<?> wildcardClass17 = derivativeException14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray21 = iOException18.getSuppressed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str10 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException27);
        java.lang.String str29 = iOException6.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str29, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String str4 = derivativeException3.getPattern();
        java.lang.Class<?> wildcardClass5 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        java.lang.Throwable[] throwableArray7 = derivativeException3.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.String str9 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException10);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray22 = derivativeException16.getArguments();
        java.lang.Throwable[] throwableArray23 = derivativeException16.getSuppressed();
        java.lang.String str24 = derivativeException16.getPattern();
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        java.lang.Throwable[] throwableArray30 = derivativeException29.getSuppressed();
        java.lang.Object[] objArray31 = derivativeException29.getArguments();
        java.io.IOException iOException32 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException29);
        java.lang.Object[] objArray33 = derivativeException29.getArguments();
        java.lang.Object[] objArray34 = derivativeException29.getArguments();
        java.lang.Object[] objArray35 = derivativeException29.getArguments();
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException29);
        iOException12.addSuppressed((java.lang.Throwable) derivativeException29);
        java.lang.String str38 = derivativeException29.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str38, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException10);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) derivativeException25);
        iOException10.addSuppressed((java.lang.Throwable) derivativeException25);
        java.lang.String str28 = derivativeException25.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str28, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException10);
        java.lang.String str13 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str13, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.lang.Throwable[] throwableArray7 = derivativeException4.getSuppressed();
        java.lang.String str8 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str8, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray8 = iOException5.getSuppressed();
        java.lang.Class<?> wildcardClass9 = iOException5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        derivativeException17.addSuppressed((java.lang.Throwable) derivativeException21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        iOException13.addSuppressed((java.lang.Throwable) derivativeException21);
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException13);
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException27);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        iOException27.addSuppressed((java.lang.Throwable) derivativeException38);
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) derivativeException38);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("", strArray45);
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) derivativeException46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("", strArray50);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        derivativeException51.addSuppressed((java.lang.Throwable) derivativeException55);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException55);
        iOException47.addSuppressed((java.lang.Throwable) derivativeException55);
        java.io.IOException iOException59 = new java.io.IOException("", (java.lang.Throwable) iOException47);
        java.io.IOException iOException60 = new java.io.IOException("", (java.lang.Throwable) iOException47);
        java.lang.String[] strArray67 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray67);
        iOException47.addSuppressed((java.lang.Throwable) derivativeException68);
        derivativeException38.addSuppressed((java.lang.Throwable) derivativeException68);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException68);
        java.lang.Class<?> wildcardClass72 = derivativeException4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.lang.String str6 = iOException5.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str6, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        java.lang.Class<?> wildcardClass7 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        iOException20.addSuppressed((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) derivativeException31);
        java.lang.Throwable[] throwableArray34 = derivativeException31.getSuppressed();
        java.lang.String str35 = derivativeException31.getPattern();
        java.lang.String str36 = derivativeException31.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str36, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.io.IOException iOException12 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray14 = iOException11.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray16 = iOException15.getSuppressed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = iOException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.Object[] objArray11 = derivativeException3.getArguments();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException19);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException29);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) derivativeException25);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        derivativeException37.addSuppressed((java.lang.Throwable) derivativeException41);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException41);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException43);
        java.io.IOException iOException45 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException43);
        iOException32.addSuppressed((java.lang.Throwable) iOException45);
        derivativeException19.addSuppressed((java.lang.Throwable) iOException45);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Class<?> wildcardClass49 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException31);
        iOException20.addSuppressed((java.lang.Throwable) iOException33);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.String str36 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str36, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray10 = derivativeException7.getArguments();
        java.lang.Object[] objArray11 = derivativeException7.getArguments();
        java.lang.String str12 = derivativeException7.getPattern();
        java.lang.String str13 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str13, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Throwable[] throwableArray6 = derivativeException3.getSuppressed();
        java.lang.String str7 = derivativeException3.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.String str9 = derivativeException3.getPattern();
        java.lang.String str10 = derivativeException3.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.Throwable[] throwableArray12 = derivativeException11.getSuppressed();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray20);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) derivativeException24);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException24);
        java.lang.String str27 = derivativeException11.getPattern();
        java.lang.Class<?> wildcardClass28 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException31);
        iOException20.addSuppressed((java.lang.Throwable) iOException33);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.Class<?> wildcardClass36 = iOException33.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException2);
        java.lang.Class<?> wildcardClass5 = iOException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.lang.Object[] objArray12 = derivativeException11.getArguments();
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        derivativeException17.addSuppressed((java.lang.Throwable) derivativeException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException17);
        java.lang.Throwable[] throwableArray24 = iOException23.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException23);
        derivativeException11.addSuppressed((java.lang.Throwable) iOException25);
        java.lang.Class<?> wildcardClass27 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.lang.Throwable[] throwableArray7 = derivativeException6.getSuppressed();
        java.lang.Object[] objArray8 = derivativeException6.getArguments();
        java.io.IOException iOException9 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException22);
        iOException11.addSuppressed((java.lang.Throwable) iOException24);
        java.io.IOException iOException26 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) iOException11);
        java.lang.Class<?> wildcardClass27 = iOException11.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray10);
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException16);
        java.lang.Class<?> wildcardClass18 = iOException17.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Class<?> wildcardClass6 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        java.lang.Object[] objArray8 = derivativeException7.getArguments();
        java.lang.String str9 = derivativeException7.getPattern();
        java.lang.String str10 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str10, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray11 = derivativeException7.getArguments();
        java.lang.Object[] objArray12 = derivativeException7.getArguments();
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray8 = derivativeException4.getArguments();
        java.lang.Object[] objArray9 = derivativeException4.getArguments();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        java.lang.String str11 = derivativeException8.getPattern();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray13 = derivativeException8.getArguments();
        java.lang.Throwable[] throwableArray14 = derivativeException8.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.lang.String str16 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        java.lang.Object[] objArray21 = derivativeException20.getArguments();
        java.io.IOException iOException22 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException20);
        derivativeException9.addSuppressed((java.lang.Throwable) iOException22);
        java.lang.Class<?> wildcardClass24 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Class<?> wildcardClass10 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        java.lang.Throwable[] throwableArray16 = derivativeException14.getSuppressed();
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException14);
        java.lang.Object[] objArray18 = derivativeException14.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.String str20 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str20, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.lang.Object[] objArray7 = derivativeException5.getArguments();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        derivativeException18.addSuppressed((java.lang.Throwable) derivativeException22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException22);
        iOException14.addSuppressed((java.lang.Throwable) derivativeException22);
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException14);
        java.io.IOException iOException27 = new java.io.IOException("", (java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException27);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException28);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        iOException28.addSuppressed((java.lang.Throwable) derivativeException39);
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) derivativeException39);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        java.io.IOException iOException48 = new java.io.IOException((java.lang.Throwable) derivativeException47);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("", strArray51);
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("", strArray55);
        derivativeException52.addSuppressed((java.lang.Throwable) derivativeException56);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException56);
        iOException48.addSuppressed((java.lang.Throwable) derivativeException56);
        java.io.IOException iOException60 = new java.io.IOException("", (java.lang.Throwable) iOException48);
        java.io.IOException iOException61 = new java.io.IOException("", (java.lang.Throwable) iOException48);
        java.lang.String[] strArray68 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray68);
        iOException48.addSuppressed((java.lang.Throwable) derivativeException69);
        derivativeException39.addSuppressed((java.lang.Throwable) derivativeException69);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException69);
        java.lang.String str73 = derivativeException5.getPattern();
        java.lang.Object[] objArray74 = derivativeException5.getArguments();
        java.io.IOException iOException75 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.lang.String str76 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str76, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray6);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        java.lang.Class<?> wildcardClass13 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String str3 = derivativeException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str3, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException10);
        java.lang.Class<?> wildcardClass13 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray22 = derivativeException20.getArguments();
        java.lang.String str23 = derivativeException20.getPattern();
        java.io.IOException iOException24 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException20);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        derivativeException28.addSuppressed((java.lang.Throwable) derivativeException32);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) derivativeException32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException34);
        java.lang.Throwable[] throwableArray36 = iOException34.getSuppressed();
        iOException24.addSuppressed((java.lang.Throwable) iOException34);
        derivativeException11.addSuppressed((java.lang.Throwable) iOException24);
        java.lang.Throwable[] throwableArray39 = iOException24.getSuppressed();
        java.lang.Class<?> wildcardClass40 = throwableArray39.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException16 = new java.io.IOException("", (java.lang.Throwable) derivativeException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        java.lang.String str18 = iOException17.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str18, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String str6 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = derivativeException3.getArguments();
        java.lang.Throwable[] throwableArray10 = derivativeException3.getSuppressed();
        java.lang.String str11 = derivativeException3.getPattern();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.Throwable[] throwableArray17 = derivativeException16.getSuppressed();
        java.lang.Object[] objArray18 = derivativeException16.getArguments();
        java.io.IOException iOException19 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException16);
        java.lang.Object[] objArray20 = derivativeException16.getArguments();
        java.lang.Object[] objArray21 = derivativeException16.getArguments();
        java.lang.Object[] objArray22 = derivativeException16.getArguments();
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.String str24 = derivativeException16.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str24, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray8);
        java.lang.Class<?> wildcardClass14 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.Object[] objArray12 = derivativeException11.getArguments();
        java.lang.Throwable[] throwableArray13 = derivativeException11.getSuppressed();
        java.lang.Class<?> wildcardClass14 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException9 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException8);
        java.lang.Class<?> wildcardClass10 = derivativeException8.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass11 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        iOException3.addSuppressed((java.lang.Throwable) derivativeException10);
        java.lang.Class<?> wildcardClass17 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.String str6 = derivativeException5.getPattern();
        java.lang.String str7 = derivativeException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str7, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException10);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException10);
        java.lang.String str14 = iOException13.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str14, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: ");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.lang.Throwable[] throwableArray7 = derivativeException6.getSuppressed();
        java.lang.Object[] objArray8 = derivativeException6.getArguments();
        java.io.IOException iOException9 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException6);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray18);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException22);
        iOException9.addSuppressed((java.lang.Throwable) derivativeException22);
        iOException1.addSuppressed((java.lang.Throwable) derivativeException22);
        java.lang.String str26 = iOException1.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str26, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass11 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.lang.String str13 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str13, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.Throwable[] throwableArray12 = derivativeException11.getSuppressed();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray20);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) derivativeException24);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException24);
        java.lang.Object[] objArray27 = derivativeException24.getArguments();
        java.lang.Class<?> wildcardClass28 = derivativeException24.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String str7 = derivativeException5.getPattern();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.Class<?> wildcardClass9 = derivativeException5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: " + "'", str7, "java.io.IOException: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.Class<?> wildcardClass13 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Class<?> wildcardClass13 = iOException9.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass6 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray7);
        java.lang.Class<?> wildcardClass12 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException11 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException10);
        java.lang.Class<?> wildcardClass12 = iOException10.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException11);
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException13);
        java.lang.Class<?> wildcardClass15 = iOException14.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        java.lang.String str11 = derivativeException8.getPattern();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException8);
        java.lang.String str13 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str13, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.lang.Object[] objArray14 = derivativeException13.getArguments();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Class<?> wildcardClass9 = iOException7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException14);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        derivativeException20.addSuppressed((java.lang.Throwable) derivativeException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException24);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        java.lang.String str28 = derivativeException27.getPattern();
        java.lang.Throwable[] throwableArray29 = derivativeException27.getSuppressed();
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException27);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) derivativeException27);
        java.lang.String str32 = iOException31.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str32, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        iOException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        java.lang.String[] strArray27 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray27);
        iOException7.addSuppressed((java.lang.Throwable) derivativeException28);
        java.io.IOException iOException30 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.lang.Class<?> wildcardClass32 = iOException30.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.Object[] objArray7 = derivativeException5.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException8);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.io.IOException iOException23 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException21);
        iOException10.addSuppressed((java.lang.Throwable) iOException23);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) iOException10);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        java.lang.String str27 = iOException25.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str27, "java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Class<?> wildcardClass7 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray4 = iOException1.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        iOException8.addSuppressed((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException8);
        java.io.IOException iOException21 = new java.io.IOException("", (java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) iOException22);
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException22);
        java.lang.Class<?> wildcardClass26 = iOException22.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray8);
        java.lang.Class<?> wildcardClass14 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.lang.String str10 = iOException7.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str10, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = derivativeException7.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.String str12 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException16);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.String str20 = derivativeException16.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException22 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException21);
        java.lang.String str23 = iOException22.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!" + "'", str23, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.lang.String str7 = derivativeException5.getPattern();
        java.lang.Object[] objArray8 = derivativeException5.getArguments();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str7, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = derivativeException7.getSuppressed();
        java.lang.Object[] objArray11 = derivativeException7.getArguments();
        java.lang.Class<?> wildcardClass12 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.lang.String str7 = derivativeException5.getPattern();
        java.lang.String str8 = derivativeException5.getPattern();
        java.lang.String str9 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str7, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException5);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.Class<?> wildcardClass12 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str11, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        java.lang.String str11 = derivativeException8.getPattern();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray13 = derivativeException8.getArguments();
        java.lang.Throwable[] throwableArray14 = derivativeException8.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.lang.String str16 = iOException15.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str16, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        java.lang.Class<?> wildcardClass10 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray6);
        java.lang.Object[] objArray10 = derivativeException9.getArguments();
        java.lang.String str11 = derivativeException9.getPattern();
        java.lang.Class<?> wildcardClass12 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str11, "java.io.IOException: org.apache.commons.math.ode.DerivativeException");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        java.lang.String str15 = iOException14.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str15, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray9);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException" + "'", str16, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "org.apache.commons.math.ode.DerivativeException", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.Throwable[] throwableArray8 = derivativeException6.getSuppressed();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Throwable[] throwableArray6 = derivativeException3.getSuppressed();
        java.lang.String str7 = derivativeException3.getPattern();
        java.lang.String str8 = derivativeException3.getPattern();
        java.lang.Throwable[] throwableArray9 = derivativeException3.getSuppressed();
        java.lang.Class<?> wildcardClass10 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.lang.Class<?> wildcardClass12 = iOException11.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException6);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        iOException10.addSuppressed((java.lang.Throwable) derivativeException18);
        java.io.IOException iOException22 = new java.io.IOException("", (java.lang.Throwable) iOException10);
        java.io.IOException iOException23 = new java.io.IOException("", (java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) iOException23);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) iOException24);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray32);
        iOException24.addSuppressed((java.lang.Throwable) derivativeException35);
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) derivativeException35);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray42);
        java.io.IOException iOException44 = new java.io.IOException((java.lang.Throwable) derivativeException43);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("", strArray47);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("", strArray51);
        derivativeException48.addSuppressed((java.lang.Throwable) derivativeException52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException52);
        iOException44.addSuppressed((java.lang.Throwable) derivativeException52);
        java.io.IOException iOException56 = new java.io.IOException("", (java.lang.Throwable) iOException44);
        java.io.IOException iOException57 = new java.io.IOException("", (java.lang.Throwable) iOException44);
        java.lang.String[] strArray64 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray64);
        iOException44.addSuppressed((java.lang.Throwable) derivativeException65);
        derivativeException35.addSuppressed((java.lang.Throwable) derivativeException65);
        java.lang.String str68 = derivativeException65.getPattern();
        iOException3.addSuppressed((java.lang.Throwable) derivativeException65);
        java.lang.Throwable[] throwableArray70 = derivativeException65.getSuppressed();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(throwableArray70);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.lang.String str12 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str12, "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Class<?> wildcardClass13 = iOException12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.lang.Throwable[] throwableArray7 = derivativeException4.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException4);
        java.lang.Class<?> wildcardClass9 = iOException8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        java.lang.String str10 = iOException7.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str10, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        java.lang.String str14 = iOException12.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: java.io.IOException: hi!" + "'", str14, "java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray8);
        java.lang.Class<?> wildcardClass14 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException7);
        java.lang.Class<?> wildcardClass9 = iOException8.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray4 = iOException1.getSuppressed();
        java.lang.String str5 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException" + "'", str5, "java.io.IOException");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.io.IOException iOException1 = new java.io.IOException("hi!");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str10 = derivativeException9.getPattern();
        iOException2.addSuppressed((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass12 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray5);
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException8);
        java.lang.String str10 = iOException8.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str10, "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        derivativeException17.addSuppressed((java.lang.Throwable) derivativeException21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        iOException13.addSuppressed((java.lang.Throwable) derivativeException21);
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException13);
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException27);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        iOException27.addSuppressed((java.lang.Throwable) derivativeException38);
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) derivativeException38);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("", strArray45);
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) derivativeException46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("", strArray50);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        derivativeException51.addSuppressed((java.lang.Throwable) derivativeException55);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException55);
        iOException47.addSuppressed((java.lang.Throwable) derivativeException55);
        java.io.IOException iOException59 = new java.io.IOException("", (java.lang.Throwable) iOException47);
        java.io.IOException iOException60 = new java.io.IOException("", (java.lang.Throwable) iOException47);
        java.lang.String[] strArray67 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray67);
        iOException47.addSuppressed((java.lang.Throwable) derivativeException68);
        derivativeException38.addSuppressed((java.lang.Throwable) derivativeException68);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException68);
        java.lang.String str72 = derivativeException4.getPattern();
        java.lang.Throwable throwable73 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException4.addSuppressed(throwable73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray5);
        java.lang.String str7 = derivativeException6.getPattern();
        java.lang.String str8 = derivativeException6.getPattern();
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) derivativeException6);
        java.lang.Class<?> wildcardClass10 = iOException9.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str7, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.lang.Object[] objArray7 = derivativeException4.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException4);
        java.lang.String str9 = derivativeException4.getPattern();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.String str11 = iOException10.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str11, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        iOException11.addSuppressed((java.lang.Throwable) derivativeException26);
        java.io.IOException iOException28 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException26);
        java.lang.Class<?> wildcardClass29 = iOException28.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        derivativeException6.addSuppressed((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.lang.String str18 = derivativeException17.getPattern();
        java.io.IOException iOException19 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException17);
        java.io.IOException iOException20 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException17);
        java.lang.Class<?> wildcardClass21 = iOException20.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.io.IOException: hi!" + "'", str18, "java.io.IOException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.Class<?> wildcardClass8 = derivativeException6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.lang.String[] strArray2 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray2);
        java.lang.String str4 = derivativeException3.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str4, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray10 = derivativeException9.getArguments();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass12 = iOException11.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.Object[] objArray11 = derivativeException3.getArguments();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.lang.Throwable[] throwableArray7 = derivativeException6.getSuppressed();
        java.lang.Object[] objArray8 = derivativeException6.getArguments();
        java.io.IOException iOException9 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException9);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException22);
        iOException11.addSuppressed((java.lang.Throwable) iOException24);
        java.io.IOException iOException26 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) iOException11);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", strArray37);
        iOException11.addSuppressed((java.lang.Throwable) derivativeException44);
        java.lang.String str46 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.io.IOException: java.io.IOException: " + "'", str46, "java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray8 = derivativeException4.getArguments();
        java.lang.Object[] objArray9 = derivativeException4.getArguments();
        java.lang.Object[] objArray10 = derivativeException4.getArguments();
        java.io.IOException iOException13 = new java.io.IOException();
        java.io.IOException iOException14 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        java.lang.String str17 = derivativeException16.getPattern();
        java.io.IOException iOException19 = new java.io.IOException("java.io.IOException: ");
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        java.lang.Throwable[] throwableArray25 = derivativeException24.getSuppressed();
        java.lang.Object[] objArray26 = derivativeException24.getArguments();
        java.io.IOException iOException27 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException24);
        java.lang.Throwable[] throwableArray28 = iOException27.getSuppressed();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray36);
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) derivativeException40);
        iOException27.addSuppressed((java.lang.Throwable) derivativeException40);
        iOException19.addSuppressed((java.lang.Throwable) derivativeException40);
        derivativeException16.addSuppressed((java.lang.Throwable) iOException19);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.Class<?> wildcardClass47 = derivativeException4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str17, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException4);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str8, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.Class<?> wildcardClass11 = derivativeException9.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray8);
        java.io.IOException iOException13 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException12);
        java.lang.String str14 = iOException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str14, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.String str5 = iOException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str5, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = iOException8.getSuppressed();
        java.lang.Class<?> wildcardClass11 = iOException8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray8);
        java.lang.String str14 = derivativeException13.getPattern();
        java.lang.Class<?> wildcardClass15 = derivativeException13.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.String str7 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str7, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray5);
        java.lang.Throwable[] throwableArray10 = derivativeException9.getSuppressed();
        java.lang.Class<?> wildcardClass11 = throwableArray10.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.lang.Throwable[] throwableArray7 = derivativeException4.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray9 = derivativeException4.getSuppressed();
        java.lang.String str10 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray13);
        java.lang.Class<?> wildcardClass24 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Class<?> wildcardClass10 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.Object[] objArray7 = derivativeException5.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException5);
        java.lang.Throwable[] throwableArray9 = iOException8.getSuppressed();
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) iOException8);
        java.lang.Class<?> wildcardClass11 = iOException10.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray16 = derivativeException12.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.lang.String str19 = derivativeException12.getPattern();
        java.lang.String str20 = derivativeException12.getPattern();
        java.lang.String str21 = derivativeException12.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str21, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        java.lang.Class<?> wildcardClass14 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.String str6 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str6, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.String str12 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException11);
        java.io.IOException iOException18 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray20 = iOException18.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException18);
        iOException11.addSuppressed((java.lang.Throwable) iOException21);
        java.lang.Class<?> wildcardClass23 = iOException21.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "org.apache.commons.math.ode.DerivativeException", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException", strArray7);
        java.lang.Class<?> wildcardClass11 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        derivativeException19.addSuppressed((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException25);
        derivativeException14.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        java.lang.Class<?> wildcardClass30 = iOException29.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        iOException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.io.IOException iOException23 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException22);
        java.lang.String str24 = iOException22.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str24, "java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray5);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        derivativeException20.addSuppressed((java.lang.Throwable) derivativeException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException24);
        iOException16.addSuppressed((java.lang.Throwable) derivativeException24);
        java.io.IOException iOException28 = new java.io.IOException("", (java.lang.Throwable) iOException16);
        java.io.IOException iOException29 = new java.io.IOException("", (java.lang.Throwable) iOException28);
        java.io.IOException iOException30 = new java.io.IOException((java.lang.Throwable) iOException29);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException30);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        iOException30.addSuppressed((java.lang.Throwable) derivativeException41);
        java.io.IOException iOException43 = new java.io.IOException((java.lang.Throwable) derivativeException41);
        derivativeException9.addSuppressed((java.lang.Throwable) iOException43);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray53);
        java.io.IOException iOException59 = new java.io.IOException((java.lang.Throwable) derivativeException58);
        iOException43.addSuppressed((java.lang.Throwable) derivativeException58);
        java.lang.String str61 = iOException43.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str61, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException11);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        iOException11.addSuppressed((java.lang.Throwable) derivativeException26);
        java.io.IOException iOException28 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException26);
        java.lang.Class<?> wildcardClass29 = derivativeException26.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        java.lang.String str11 = derivativeException8.getPattern();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray14 = derivativeException8.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.String str16 = derivativeException15.getPattern();
        java.lang.String str17 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str17, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.Object[] objArray15 = derivativeException14.getArguments();
        java.lang.Class<?> wildcardClass16 = derivativeException14.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.lang.Object[] objArray7 = derivativeException4.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException4);
        java.lang.String str9 = derivativeException4.getPattern();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.lang.String str13 = iOException12.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str13, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.Class<?> wildcardClass16 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.String str10 = derivativeException7.getPattern();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.String str12 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.lang.String str7 = derivativeException6.getPattern();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.String str9 = iOException8.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str9, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.Object[] objArray13 = derivativeException11.getArguments();
        java.lang.Class<?> wildcardClass14 = objArray13.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray18 = iOException5.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.lang.Class<?> wildcardClass20 = iOException5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.String str17 = iOException5.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str17, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.Object[] objArray12 = derivativeException10.getArguments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.Class<?> wildcardClass21 = iOException19.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        iOException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray20 = iOException7.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.io.IOException iOException22 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException7);
        java.io.IOException iOException23 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) iOException7);
        java.lang.String str24 = iOException7.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str24, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) derivativeException13);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        java.lang.String str19 = iOException17.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.io.IOException: " + "'", str19, "java.io.IOException: ");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException11 = new java.io.IOException();
        java.io.IOException iOException12 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        java.lang.String str15 = derivativeException14.getPattern();
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: ");
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        java.lang.Throwable[] throwableArray23 = derivativeException22.getSuppressed();
        java.lang.Object[] objArray24 = derivativeException22.getArguments();
        java.io.IOException iOException25 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException22);
        java.lang.Throwable[] throwableArray26 = iOException25.getSuppressed();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray34);
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) derivativeException38);
        iOException25.addSuppressed((java.lang.Throwable) derivativeException38);
        iOException17.addSuppressed((java.lang.Throwable) derivativeException38);
        derivativeException14.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Class<?> wildcardClass44 = iOException8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str2, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.Object[] objArray8 = derivativeException7.getArguments();
        java.lang.String str9 = derivativeException7.getPattern();
        java.lang.Object[] objArray10 = derivativeException7.getArguments();
        java.lang.Class<?> wildcardClass11 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String str12 = derivativeException11.getPattern();
        java.lang.Throwable[] throwableArray13 = derivativeException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException11);
        java.lang.Object[] objArray15 = derivativeException11.getArguments();
        java.lang.Class<?> wildcardClass16 = objArray15.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: java.io.IOException", throwable1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException" + "'", str3, "java.io.IOException: java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException13);
        java.lang.String str18 = iOException17.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.io.IOException: java.io.IOException" + "'", str18, "java.io.IOException: java.io.IOException");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) iOException5);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) derivativeException23);
        java.lang.Throwable[] throwableArray25 = iOException24.getSuppressed();
        java.io.IOException iOException26 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException24);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException24);
        java.io.IOException iOException28 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException24);
        iOException17.addSuppressed((java.lang.Throwable) iOException24);
        java.lang.String str30 = iOException24.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str30, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: hi!", strArray8);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray23);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException29);
        java.lang.String str31 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: hi!" + "'", str31, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        java.lang.String str11 = derivativeException8.getPattern();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException8);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException22);
        java.lang.Throwable[] throwableArray24 = iOException22.getSuppressed();
        iOException12.addSuppressed((java.lang.Throwable) iOException22);
        java.lang.Class<?> wildcardClass26 = iOException12.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.Object[] objArray10 = derivativeException7.getArguments();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException21);
        java.lang.Throwable[] throwableArray24 = derivativeException7.getSuppressed();
        java.lang.Throwable[] throwableArray25 = derivativeException7.getSuppressed();
        java.lang.String str26 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str26, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException11 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException10.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.lang.String str14 = iOException13.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str14, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException15.getArguments();
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.Object[] objArray23 = derivativeException15.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.Object[] objArray25 = derivativeException15.getArguments();
        java.lang.String str26 = derivativeException15.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.String str28 = derivativeException27.getPattern();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.lang.String[] strArray5 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray5);
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException9.addSuppressed(throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.Class<?> wildcardClass5 = iOException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray9);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        java.lang.Class<?> wildcardClass17 = iOException16.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Object[] objArray10 = derivativeException3.getArguments();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", strArray10);
        java.lang.Throwable throwable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException17.addSuppressed(throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException15.getArguments();
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.Object[] objArray23 = derivativeException15.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.Class<?> wildcardClass25 = derivativeException24.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String str8 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str8, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException15.getArguments();
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.Object[] objArray23 = derivativeException15.getArguments();
        java.lang.String str24 = derivativeException15.getPattern();
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        java.lang.String str26 = iOException25.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str26, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray10 = derivativeException7.getArguments();
        java.lang.Object[] objArray11 = derivativeException7.getArguments();
        java.lang.Class<?> wildcardClass12 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str4, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.String str17 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str17, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.Class<?> wildcardClass11 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str14, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException19);
        java.lang.String str21 = derivativeException19.toString();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str21, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.String str15 = derivativeException14.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.lang.String[] strArray2 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.Throwable[] throwableArray12 = derivativeException10.getSuppressed();
        java.lang.Object[] objArray13 = derivativeException10.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException10);
        java.lang.Throwable[] throwableArray16 = iOException15.getSuppressed();
        java.lang.Class<?> wildcardClass17 = iOException15.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "org.apache.commons.math.ode.DerivativeException", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String str20 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str20, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String str7 = derivativeException5.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str7, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray10 = iOException5.getSuppressed();
        java.lang.Class<?> wildcardClass11 = throwableArray10.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.Object[] objArray6 = derivativeException5.getArguments();
        java.lang.String str7 = derivativeException5.getPattern();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray15);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        derivativeException24.addSuppressed((java.lang.Throwable) derivativeException28);
        java.lang.Object[] objArray30 = derivativeException28.getArguments();
        java.lang.String str31 = derivativeException28.getPattern();
        java.io.IOException iOException32 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException28);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        derivativeException36.addSuppressed((java.lang.Throwable) derivativeException40);
        java.io.IOException iOException42 = new java.io.IOException((java.lang.Throwable) derivativeException40);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException42);
        java.lang.Throwable[] throwableArray44 = iOException42.getSuppressed();
        iOException32.addSuppressed((java.lang.Throwable) iOException42);
        derivativeException19.addSuppressed((java.lang.Throwable) iOException32);
        java.lang.Throwable[] throwableArray47 = iOException32.getSuppressed();
        derivativeException5.addSuppressed((java.lang.Throwable) iOException32);
        java.lang.Throwable[] throwableArray49 = iOException32.getSuppressed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        java.lang.String str10 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String str5 = derivativeException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str5, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray8);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        derivativeException22.addSuppressed((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        iOException18.addSuppressed((java.lang.Throwable) derivativeException26);
        java.lang.Throwable[] throwableArray30 = derivativeException26.getSuppressed();
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) derivativeException26);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) derivativeException26);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException26);
        java.lang.String str34 = derivativeException13.getPattern();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str34, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.Class<?> wildcardClass12 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException15.getArguments();
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.Object[] objArray23 = derivativeException15.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.String str25 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str25, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        iOException20.addSuppressed((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) derivativeException31);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) derivativeException39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("", strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("", strArray47);
        derivativeException44.addSuppressed((java.lang.Throwable) derivativeException48);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException48);
        iOException40.addSuppressed((java.lang.Throwable) derivativeException48);
        java.io.IOException iOException52 = new java.io.IOException("", (java.lang.Throwable) iOException40);
        java.io.IOException iOException53 = new java.io.IOException("", (java.lang.Throwable) iOException40);
        java.lang.String[] strArray60 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray60);
        iOException40.addSuppressed((java.lang.Throwable) derivativeException61);
        derivativeException31.addSuppressed((java.lang.Throwable) derivativeException61);
        java.lang.String str64 = derivativeException61.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException61);
        java.lang.Throwable throwable66 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException65.addSuppressed(throwable66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.String str19 = iOException5.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.io.IOException: " + "'", str19, "java.io.IOException: ");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        java.lang.Throwable[] throwableArray25 = derivativeException24.getSuppressed();
        java.lang.String str26 = derivativeException24.getPattern();
        derivativeException20.addSuppressed((java.lang.Throwable) derivativeException24);
        java.lang.String str28 = derivativeException20.getPattern();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray40);
        java.io.IOException iOException47 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException46);
        java.io.IOException iOException48 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) iOException47);
        derivativeException20.addSuppressed((java.lang.Throwable) iOException48);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Class<?> wildcardClass51 = derivativeException20.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray8);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str16, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        derivativeException2.addSuppressed((java.lang.Throwable) derivativeException6);
        java.lang.String str9 = derivativeException2.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.String str8 = derivativeException3.getPattern();
        java.lang.Class<?> wildcardClass9 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.Throwable[] throwableArray12 = derivativeException10.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        java.lang.String str15 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: hi!", "java.io.IOException: ", "org.apache.commons.math.ode.DerivativeException: hi!", "org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.ode.DerivativeException: hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        java.lang.String str8 = derivativeException7.getPattern();
        java.lang.Class<?> wildcardClass9 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        derivativeException17.addSuppressed((java.lang.Throwable) derivativeException21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        iOException13.addSuppressed((java.lang.Throwable) derivativeException21);
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException13);
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException27);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        iOException27.addSuppressed((java.lang.Throwable) derivativeException38);
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) derivativeException38);
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("", strArray45);
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) derivativeException46);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("", strArray50);
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        derivativeException51.addSuppressed((java.lang.Throwable) derivativeException55);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException55);
        iOException47.addSuppressed((java.lang.Throwable) derivativeException55);
        java.io.IOException iOException59 = new java.io.IOException("", (java.lang.Throwable) iOException47);
        java.io.IOException iOException60 = new java.io.IOException("", (java.lang.Throwable) iOException47);
        java.lang.String[] strArray67 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray67);
        iOException47.addSuppressed((java.lang.Throwable) derivativeException68);
        derivativeException38.addSuppressed((java.lang.Throwable) derivativeException68);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException68);
        java.lang.String str72 = derivativeException4.getPattern();
        java.lang.Object[] objArray73 = derivativeException4.getArguments();
        java.lang.Class<?> wildcardClass74 = derivativeException4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        java.io.IOException iOException20 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) derivativeException19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        java.lang.Class<?> wildcardClass22 = derivativeException21.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray10);
        java.lang.String str18 = derivativeException17.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str18, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String str12 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray6);
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException11.addSuppressed(throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray9);
        java.lang.Class<?> wildcardClass16 = derivativeException15.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException15.getArguments();
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.String str23 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str23, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException10.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray8);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        java.lang.String str15 = iOException14.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str15, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Object[] objArray9 = derivativeException3.getArguments();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException10);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException10);
        java.lang.Throwable[] throwableArray14 = derivativeException10.getSuppressed();
        java.lang.Object[] objArray15 = derivativeException10.getArguments();
        java.lang.Object[] objArray16 = derivativeException10.getArguments();
        java.lang.String str17 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str17, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: ");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.lang.Throwable[] throwableArray7 = derivativeException6.getSuppressed();
        java.lang.Object[] objArray8 = derivativeException6.getArguments();
        java.io.IOException iOException9 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException6);
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray18);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException22);
        iOException9.addSuppressed((java.lang.Throwable) derivativeException22);
        iOException1.addSuppressed((java.lang.Throwable) derivativeException22);
        java.lang.String str26 = derivativeException22.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str26, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.Object[] objArray7 = derivativeException5.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.lang.String str12 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: java.io.IOException: hi!" + "'", str12, "java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.String str13 = derivativeException12.getPattern();
        java.lang.Throwable[] throwableArray14 = derivativeException12.getSuppressed();
        java.lang.Object[] objArray15 = derivativeException12.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException1.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Class<?> wildcardClass18 = derivativeException12.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.String str15 = derivativeException12.getPattern();
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray17 = derivativeException12.getSuppressed();
        java.lang.String str18 = derivativeException12.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str18, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray9 = derivativeException3.getArguments();
        java.lang.String str10 = derivativeException3.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        java.lang.Throwable[] throwableArray21 = derivativeException20.getSuppressed();
        java.lang.Object[] objArray22 = derivativeException20.getArguments();
        java.io.IOException iOException23 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException23);
        iOException4.addSuppressed((java.lang.Throwable) iOException23);
        java.lang.String str26 = iOException4.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str26, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.String str10 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str10, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException10);
        java.lang.Throwable[] throwableArray13 = derivativeException10.getSuppressed();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException18);
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException19);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException19);
        derivativeException10.addSuppressed((java.lang.Throwable) iOException22);
        java.lang.String str24 = iOException22.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str24, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        java.lang.String str11 = derivativeException8.getPattern();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray14 = derivativeException8.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.Throwable[] throwableArray16 = derivativeException8.getSuppressed();
        java.lang.Class<?> wildcardClass17 = derivativeException8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String str12 = derivativeException11.getPattern();
        java.lang.Throwable[] throwableArray13 = derivativeException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException11);
        java.lang.Class<?> wildcardClass15 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException10);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException20);
        java.lang.String str23 = derivativeException20.getPattern();
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) derivativeException20);
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException20);
        derivativeException10.addSuppressed((java.lang.Throwable) iOException25);
        java.lang.String str27 = iOException25.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str27, "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass5 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException17);
        derivativeException3.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.Class<?> wildcardClass20 = derivativeException3.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.Object[] objArray7 = derivativeException5.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException8);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.io.IOException iOException23 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException21);
        iOException10.addSuppressed((java.lang.Throwable) iOException23);
        java.lang.String str25 = iOException23.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.io.IOException: java.io.IOException: hi!" + "'", str25, "java.io.IOException: java.io.IOException: hi!");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.Class<?> wildcardClass6 = iOException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException16);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.String str20 = derivativeException16.getPattern();
        java.lang.Object[] objArray21 = derivativeException16.getArguments();
        java.io.IOException iOException22 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException16);
        java.lang.Throwable throwable24 = null;
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: java.io.IOException", throwable24);
        // The following exception was thrown during execution in test generation
        try {
            iOException22.addSuppressed(throwable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "org.apache.commons.math.ode.DerivativeException", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.Class<?> wildcardClass11 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str14, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        java.lang.Class<?> wildcardClass14 = derivativeException13.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.Object[] objArray11 = derivativeException10.getArguments();
        java.lang.String str12 = derivativeException10.getPattern();
        java.lang.String str13 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str13, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException31);
        iOException20.addSuppressed((java.lang.Throwable) iOException33);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.String str36 = derivativeException7.getPattern();
        java.lang.Class<?> wildcardClass37 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        derivativeException18.addSuppressed((java.lang.Throwable) derivativeException22);
        java.lang.Object[] objArray24 = derivativeException22.getArguments();
        java.lang.String str25 = derivativeException22.getPattern();
        java.io.IOException iOException26 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException22);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("", strArray33);
        derivativeException30.addSuppressed((java.lang.Throwable) derivativeException34);
        java.io.IOException iOException36 = new java.io.IOException((java.lang.Throwable) derivativeException34);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException36);
        java.lang.Throwable[] throwableArray38 = iOException36.getSuppressed();
        iOException26.addSuppressed((java.lang.Throwable) iOException36);
        derivativeException13.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException41 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException13);
        java.io.IOException iOException42 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException41);
        java.lang.String str43 = iOException41.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str43, "java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException17);
        derivativeException3.addSuppressed((java.lang.Throwable) iOException18);
        java.lang.String str20 = derivativeException3.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str20, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Class<?> wildcardClass8 = iOException6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray22 = derivativeException21.getArguments();
        java.io.IOException iOException23 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException21);
        derivativeException10.addSuppressed((java.lang.Throwable) iOException23);
        java.lang.String str25 = derivativeException10.getPattern();
        java.io.IOException iOException26 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException10);
        java.lang.String str27 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str25, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str27, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.Object[] objArray6 = derivativeException5.getArguments();
        java.lang.Class<?> wildcardClass7 = derivativeException5.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.String str7 = derivativeException6.getPattern();
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException: ");
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.lang.Throwable[] throwableArray15 = derivativeException14.getSuppressed();
        java.lang.Object[] objArray16 = derivativeException14.getArguments();
        java.io.IOException iOException17 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException14);
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray26);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) derivativeException30);
        iOException17.addSuppressed((java.lang.Throwable) derivativeException30);
        iOException9.addSuppressed((java.lang.Throwable) derivativeException30);
        derivativeException6.addSuppressed((java.lang.Throwable) iOException9);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.io.IOException iOException36 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException35);
        java.lang.Throwable[] throwableArray37 = derivativeException35.getSuppressed();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str7, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException31);
        iOException20.addSuppressed((java.lang.Throwable) iOException33);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.String str36 = derivativeException7.getPattern();
        java.lang.String str37 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str37, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Class<?> wildcardClass14 = iOException13.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        java.lang.Class<?> wildcardClass7 = derivativeException6.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "org.apache.commons.math.ode.DerivativeException", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = iOException7.getSuppressed();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String str12 = derivativeException11.getPattern();
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException11);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) derivativeException28);
        derivativeException23.addSuppressed((java.lang.Throwable) derivativeException28);
        java.lang.Object[] objArray31 = derivativeException23.getArguments();
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) derivativeException23);
        java.lang.Throwable[] throwableArray33 = iOException32.getSuppressed();
        derivativeException11.addSuppressed((java.lang.Throwable) iOException32);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("", strArray43);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray43);
        java.lang.String[] strArray52 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray52);
        java.io.IOException iOException54 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException53);
        java.lang.Object[] objArray55 = derivativeException53.getArguments();
        java.io.IOException iOException56 = new java.io.IOException((java.lang.Throwable) derivativeException53);
        java.io.IOException iOException57 = new java.io.IOException((java.lang.Throwable) iOException56);
        java.lang.Throwable[] throwableArray58 = iOException56.getSuppressed();
        derivativeException48.addSuppressed((java.lang.Throwable) iOException56);
        iOException32.addSuppressed((java.lang.Throwable) iOException56);
        java.lang.String str61 = iOException56.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str61, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray10 = derivativeException7.getArguments();
        java.lang.Object[] objArray11 = derivativeException7.getArguments();
        java.lang.Object[] objArray12 = derivativeException7.getArguments();
        java.lang.String str13 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str13, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.lang.Throwable[] throwableArray7 = derivativeException4.getSuppressed();
        java.lang.String str8 = derivativeException4.getPattern();
        java.lang.String str9 = derivativeException4.getPattern();
        java.lang.Throwable[] throwableArray10 = derivativeException4.getSuppressed();
        java.io.IOException iOException11 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.String str12 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str12, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.io.IOException", "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray8);
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException9);
        java.lang.String str11 = iOException10.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str11, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.String str13 = derivativeException12.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str13, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray6);
        java.lang.Throwable[] throwableArray11 = derivativeException10.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("", (java.lang.Throwable) derivativeException10);
        java.lang.Class<?> wildcardClass13 = iOException12.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.String str8 = derivativeException7.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        java.lang.Class<?> wildcardClass18 = derivativeException17.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.Object[] objArray5 = derivativeException3.getArguments();
        java.lang.Object[] objArray6 = derivativeException3.getArguments();
        java.lang.Object[] objArray7 = derivativeException3.getArguments();
        java.lang.Throwable[] throwableArray8 = derivativeException3.getSuppressed();
        java.lang.String str9 = derivativeException3.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str9, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) derivativeException19);
        java.lang.Class<?> wildcardClass21 = derivativeException19.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray16 = derivativeException12.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray23);
        java.lang.String str25 = derivativeException24.getPattern();
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) derivativeException24);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        derivativeException18.addSuppressed((java.lang.Throwable) iOException26);
        java.lang.Object[] objArray29 = derivativeException18.getArguments();
        java.lang.Class<?> wildcardClass30 = derivativeException18.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str25, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        iOException20.addSuppressed((java.lang.Throwable) derivativeException31);
        java.lang.Class<?> wildcardClass33 = derivativeException31.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = derivativeException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        java.lang.String str21 = derivativeException18.getPattern();
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException22);
        iOException8.addSuppressed((java.lang.Throwable) derivativeException23);
        java.lang.Class<?> wildcardClass25 = derivativeException23.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        iOException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        iOException21.addSuppressed((java.lang.Throwable) derivativeException32);
        java.lang.Object[] objArray34 = derivativeException32.getArguments();
        java.io.IOException iOException35 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException32);
        java.lang.String str36 = iOException35.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str36, "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String str16 = derivativeException12.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.Object[] objArray18 = derivativeException12.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.Class<?> wildcardClass20 = derivativeException12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        iOException5.addSuppressed((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) iOException5);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        java.lang.Class<?> wildcardClass19 = iOException17.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        derivativeException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.String str19 = derivativeException15.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.Class<?> wildcardClass21 = derivativeException20.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.lang.Class<?> wildcardClass16 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray7);
        java.lang.String str12 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str12, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray10);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException17);
        java.lang.String str19 = iOException18.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException" + "'", str19, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.lang.Throwable[] throwableArray7 = derivativeException4.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray9 = derivativeException4.getSuppressed();
        java.lang.Object[] objArray10 = derivativeException4.getArguments();
        java.lang.String str11 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str11, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray22 = derivativeException20.getArguments();
        java.lang.String str23 = derivativeException20.getPattern();
        java.io.IOException iOException24 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException20);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        derivativeException28.addSuppressed((java.lang.Throwable) derivativeException32);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) derivativeException32);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException34);
        java.lang.Throwable[] throwableArray36 = iOException34.getSuppressed();
        iOException24.addSuppressed((java.lang.Throwable) iOException34);
        derivativeException11.addSuppressed((java.lang.Throwable) iOException24);
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException24);
        java.lang.Class<?> wildcardClass40 = iOException39.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.lang.String str10 = derivativeException7.getPattern();
        java.lang.Class<?> wildcardClass11 = derivativeException7.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        iOException7.addSuppressed((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        java.io.IOException iOException20 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException20);
        java.lang.String str23 = derivativeException22.getPattern();
        java.io.IOException iOException24 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException22);
        java.lang.Class<?> wildcardClass25 = derivativeException22.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray16 = derivativeException12.getSuppressed();
        java.lang.String str17 = derivativeException12.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str17, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray7);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray12);
        java.lang.String str22 = derivativeException21.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str22, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.String str10 = derivativeException7.getPattern();
        java.lang.String str11 = derivativeException7.getPattern();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray17);
        java.lang.String str19 = derivativeException18.getPattern();
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) derivativeException18);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) iOException21);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException21);
        java.lang.String str25 = iOException21.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str19, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str25, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: hi!", strArray8);
        java.lang.Throwable[] throwableArray14 = derivativeException13.getSuppressed();
        java.lang.Class<?> wildcardClass15 = throwableArray14.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        java.lang.String str13 = iOException12.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str13, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) iOException10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        java.lang.Class<?> wildcardClass17 = iOException16.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException10);
        java.lang.Throwable[] throwableArray13 = derivativeException10.getSuppressed();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException18);
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException19);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException19);
        derivativeException10.addSuppressed((java.lang.Throwable) iOException22);
        java.lang.Class<?> wildcardClass24 = derivativeException10.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray8);
        java.lang.String str14 = derivativeException13.getPattern();
        java.lang.String str15 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException" + "'", str14, "java.io.IOException");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException" + "'", str15, "org.apache.commons.math.ode.DerivativeException: java.io.IOException");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray17 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException21);
        java.lang.String str24 = derivativeException21.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException25);
        java.lang.String str27 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str24, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str27, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException15.getArguments();
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.Object[] objArray23 = derivativeException15.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) derivativeException30);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        derivativeException35.addSuppressed((java.lang.Throwable) derivativeException39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException39);
        iOException31.addSuppressed((java.lang.Throwable) derivativeException39);
        java.io.IOException iOException43 = new java.io.IOException("", (java.lang.Throwable) iOException31);
        java.io.IOException iOException44 = new java.io.IOException("", (java.lang.Throwable) iOException43);
        java.io.IOException iOException45 = new java.io.IOException((java.lang.Throwable) iOException44);
        java.lang.Throwable[] throwableArray46 = iOException44.getSuppressed();
        derivativeException15.addSuppressed((java.lang.Throwable) iOException44);
        java.lang.Throwable[] throwableArray48 = iOException44.getSuppressed();
        java.lang.Class<?> wildcardClass49 = iOException44.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray7);
        java.io.IOException iOException14 = new java.io.IOException();
        java.io.IOException iOException15 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException15);
        derivativeException11.addSuppressed((java.lang.Throwable) iOException15);
        java.lang.String[] strArray26 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        java.lang.Object[] objArray28 = derivativeException27.getArguments();
        java.lang.String str29 = derivativeException27.getPattern();
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException27);
        java.lang.String str31 = derivativeException11.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[java.io.IOException: org.apache.commons.math.ode.DerivativeException: , , , java.io.IOException: , hi!]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!" + "'", str31, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray22 = derivativeException16.getArguments();
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.Object[] objArray24 = derivativeException16.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.lang.String str26 = derivativeException16.getPattern();
        java.lang.String str27 = derivativeException16.getPattern();
        java.io.IOException iOException28 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException16);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.io.IOException iOException11 = new java.io.IOException();
        java.io.IOException iOException12 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException12);
        java.lang.String str15 = derivativeException14.getPattern();
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: ");
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        java.lang.Throwable[] throwableArray23 = derivativeException22.getSuppressed();
        java.lang.Object[] objArray24 = derivativeException22.getArguments();
        java.io.IOException iOException25 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException22);
        java.lang.Throwable[] throwableArray26 = iOException25.getSuppressed();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray34);
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) derivativeException38);
        iOException25.addSuppressed((java.lang.Throwable) derivativeException38);
        iOException17.addSuppressed((java.lang.Throwable) derivativeException38);
        derivativeException14.addSuppressed((java.lang.Throwable) iOException17);
        iOException8.addSuppressed((java.lang.Throwable) iOException17);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        java.lang.String str45 = derivativeException44.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str45, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ");
        java.lang.Class<?> wildcardClass2 = iOException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "org.apache.commons.math.ode.DerivativeException", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        java.io.IOException iOException8 = new java.io.IOException("", (java.lang.Throwable) derivativeException7);
        java.lang.Throwable[] throwableArray9 = derivativeException7.getSuppressed();
        java.lang.Throwable[] throwableArray10 = derivativeException7.getSuppressed();
        java.lang.Class<?> wildcardClass11 = throwableArray10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        java.lang.String str10 = derivativeException9.getPattern();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException11.addSuppressed(throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str10, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        derivativeException23.addSuppressed((java.lang.Throwable) derivativeException27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException27);
        iOException19.addSuppressed((java.lang.Throwable) derivativeException27);
        java.io.IOException iOException31 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException32 = new java.io.IOException("", (java.lang.Throwable) iOException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException32);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException33);
        java.io.IOException iOException35 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) iOException33);
        derivativeException11.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.Class<?> wildcardClass37 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException10);
        java.lang.String str13 = iOException10.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str13, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.lang.String[] strArray7 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.Class<?> wildcardClass14 = derivativeException13.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.Throwable[] throwableArray6 = derivativeException5.getSuppressed();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        java.lang.Throwable[] throwableArray16 = derivativeException14.getSuppressed();
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException14);
        java.lang.Object[] objArray18 = derivativeException14.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.Object[] objArray20 = derivativeException19.getArguments();
        java.lang.Class<?> wildcardClass21 = derivativeException19.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        java.lang.String str11 = derivativeException8.getPattern();
        java.io.IOException iOException12 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.Class<?> wildcardClass14 = derivativeException8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray11 = iOException6.getSuppressed();
        java.lang.Class<?> wildcardClass12 = throwableArray11.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.lang.String str5 = derivativeException3.getPattern();
        java.lang.Throwable[] throwableArray6 = derivativeException3.getSuppressed();
        java.lang.String str7 = derivativeException3.getPattern();
        java.lang.String str8 = derivativeException3.getPattern();
        java.lang.Object[] objArray9 = derivativeException3.getArguments();
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String str11 = iOException10.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str11, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.String[] strArray3 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.io.IOException iOException5 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray9 = derivativeException8.getArguments();
        java.lang.String str10 = derivativeException8.getPattern();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.io.IOException iOException2 = new java.io.IOException();
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.lang.String str15 = derivativeException12.getPattern();
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        java.lang.Throwable[] throwableArray21 = derivativeException20.getSuppressed();
        java.lang.String str22 = derivativeException20.getPattern();
        java.lang.Throwable[] throwableArray23 = derivativeException20.getSuppressed();
        java.lang.String str24 = derivativeException20.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException20);
        java.lang.String str26 = derivativeException20.getPattern();
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray28 = derivativeException20.getArguments();
        java.lang.String str29 = derivativeException20.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str29, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.Throwable[] throwableArray14 = derivativeException13.getSuppressed();
        java.lang.String str15 = derivativeException13.getPattern();
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException13);
        java.lang.String str17 = derivativeException9.getPattern();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray29);
        java.io.IOException iOException36 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException35);
        java.io.IOException iOException37 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) iOException36);
        derivativeException9.addSuppressed((java.lang.Throwable) iOException37);
        java.lang.String str39 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str39, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        derivativeException17.addSuppressed((java.lang.Throwable) derivativeException21);
        java.lang.Object[] objArray23 = derivativeException21.getArguments();
        java.lang.String str24 = derivativeException21.getPattern();
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException21);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray32);
        derivativeException29.addSuppressed((java.lang.Throwable) derivativeException33);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) derivativeException33);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException35);
        java.lang.Throwable[] throwableArray37 = iOException35.getSuppressed();
        iOException25.addSuppressed((java.lang.Throwable) iOException35);
        derivativeException12.addSuppressed((java.lang.Throwable) iOException25);
        java.io.IOException iOException40 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("", strArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("", strArray47);
        derivativeException44.addSuppressed((java.lang.Throwable) derivativeException48);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException48);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException50);
        java.lang.String str52 = derivativeException51.getPattern();
        java.lang.Throwable[] throwableArray53 = derivativeException51.getSuppressed();
        java.lang.Object[] objArray54 = derivativeException51.getArguments();
        iOException40.addSuppressed((java.lang.Throwable) derivativeException51);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray60);
        java.lang.String str62 = derivativeException61.getPattern();
        java.io.IOException iOException63 = new java.io.IOException((java.lang.Throwable) derivativeException61);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray71);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray71);
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray71);
        java.io.IOException iOException75 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException74);
        java.lang.String[] strArray79 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException80 = new org.apache.commons.math.ode.DerivativeException("", strArray79);
        java.lang.String[] strArray83 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("", strArray83);
        derivativeException80.addSuppressed((java.lang.Throwable) derivativeException84);
        org.apache.commons.math.ode.DerivativeException derivativeException86 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException84);
        java.lang.String str87 = derivativeException84.getPattern();
        java.io.IOException iOException88 = new java.io.IOException((java.lang.Throwable) derivativeException84);
        java.io.IOException iOException89 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException84);
        derivativeException74.addSuppressed((java.lang.Throwable) iOException89);
        java.lang.Object[] objArray91 = derivativeException74.getArguments();
        java.lang.String str92 = derivativeException74.getPattern();
        iOException63.addSuppressed((java.lang.Throwable) derivativeException74);
        org.apache.commons.math.ode.DerivativeException derivativeException94 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException63);
        derivativeException51.addSuppressed((java.lang.Throwable) iOException63);
        java.io.IOException iOException96 = new java.io.IOException((java.lang.Throwable) derivativeException51);
        java.lang.String str97 = iOException96.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str62, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str97, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", "", "", "java.io.IOException: ", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException9 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException8);
        java.lang.String str10 = derivativeException8.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str10, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.lang.Object[] objArray7 = derivativeException4.getArguments();
        java.io.IOException iOException8 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException4);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str14, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str4, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: " + "'", str4, "java.io.IOException: ");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray22 = derivativeException16.getArguments();
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.Object[] objArray24 = derivativeException16.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.io.IOException iOException26 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException26);
        java.lang.String str28 = derivativeException27.getPattern();
        java.lang.String str29 = derivativeException27.getPattern();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException" + "'", str28, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException" + "'", str29, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException15.getArguments();
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.Object[] objArray23 = derivativeException15.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) derivativeException30);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        derivativeException35.addSuppressed((java.lang.Throwable) derivativeException39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException39);
        iOException31.addSuppressed((java.lang.Throwable) derivativeException39);
        java.io.IOException iOException43 = new java.io.IOException("", (java.lang.Throwable) iOException31);
        java.io.IOException iOException44 = new java.io.IOException("", (java.lang.Throwable) iOException43);
        java.io.IOException iOException45 = new java.io.IOException((java.lang.Throwable) iOException44);
        java.lang.Throwable[] throwableArray46 = iOException44.getSuppressed();
        derivativeException15.addSuppressed((java.lang.Throwable) iOException44);
        java.lang.Object[] objArray48 = derivativeException15.getArguments();
        java.lang.Class<?> wildcardClass49 = derivativeException15.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException31);
        iOException20.addSuppressed((java.lang.Throwable) iOException33);
        derivativeException7.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.String str36 = derivativeException7.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.Object[] objArray38 = derivativeException7.getArguments();
        java.lang.Class<?> wildcardClass39 = objArray38.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray4);
        java.lang.String str6 = derivativeException5.getPattern();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        derivativeException5.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Class<?> wildcardClass20 = iOException17.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str6, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        java.lang.Object[] objArray10 = derivativeException4.getArguments();
        java.lang.Throwable[] throwableArray11 = derivativeException4.getSuppressed();
        java.lang.String str12 = derivativeException4.getPattern();
        java.io.IOException iOException13 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException4);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.lang.String str15 = iOException13.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str15, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException17 = new java.io.IOException("", (java.lang.Throwable) derivativeException16);
        java.io.IOException iOException18 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException17);
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            iOException18.addSuppressed(throwable19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", strArray8);
        java.lang.String str14 = derivativeException13.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str14, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.io.IOException iOException1 = new java.io.IOException();
        java.io.IOException iOException2 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException17);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        derivativeException23.addSuppressed((java.lang.Throwable) derivativeException27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException27);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        java.io.IOException iOException31 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException29);
        derivativeException18.addSuppressed((java.lang.Throwable) iOException31);
        java.lang.Throwable[] throwableArray33 = derivativeException18.getSuppressed();
        iOException1.addSuppressed((java.lang.Throwable) derivativeException18);
        java.lang.String str35 = derivativeException18.toString();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str35, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.String str11 = derivativeException8.getPattern();
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) derivativeException8);
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException12);
        java.lang.Class<?> wildcardClass14 = iOException12.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        java.lang.String str21 = derivativeException18.getPattern();
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException22);
        iOException8.addSuppressed((java.lang.Throwable) derivativeException23);
        java.lang.String str25 = iOException8.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str25, "java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String str12 = derivativeException11.getPattern();
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException11);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) derivativeException28);
        derivativeException23.addSuppressed((java.lang.Throwable) derivativeException28);
        java.lang.Object[] objArray31 = derivativeException23.getArguments();
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) derivativeException23);
        java.lang.Throwable[] throwableArray33 = iOException32.getSuppressed();
        derivativeException11.addSuppressed((java.lang.Throwable) iOException32);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        java.lang.Class<?> wildcardClass36 = derivativeException11.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray9);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.lang.String[] strArray4 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        java.io.IOException iOException6 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) derivativeException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException8 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.lang.String str10 = derivativeException9.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException" + "'", str10, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        iOException20.addSuppressed((java.lang.Throwable) derivativeException31);
        java.lang.Object[] objArray33 = derivativeException31.getArguments();
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) derivativeException31);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        java.lang.Class<?> wildcardClass36 = derivativeException35.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        java.io.IOException iOException7 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) derivativeException4);
        java.lang.String str8 = derivativeException4.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str8, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        derivativeException6.addSuppressed((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String str13 = derivativeException10.getPattern();
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) derivativeException10);
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException14);
        java.lang.String str18 = iOException17.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str18, "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.lang.Object[] objArray12 = derivativeException11.getArguments();
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        derivativeException17.addSuppressed((java.lang.Throwable) derivativeException21);
        java.io.IOException iOException23 = new java.io.IOException((java.lang.Throwable) derivativeException17);
        java.lang.Throwable[] throwableArray24 = iOException23.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException23);
        derivativeException11.addSuppressed((java.lang.Throwable) iOException25);
        java.lang.String str27 = derivativeException11.getPattern();
        java.lang.Object[] objArray28 = derivativeException11.getArguments();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.lang.String[] strArray8 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray8);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str16, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray10);
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException16);
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        java.lang.Class<?> wildcardClass19 = throwableArray18.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str10 = derivativeException7.getPattern();
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.lang.String str14 = iOException11.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str14, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException14);
        java.lang.Object[] objArray17 = derivativeException9.getArguments();
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray26);
        iOException18.addSuppressed((java.lang.Throwable) derivativeException30);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) derivativeException30);
        java.lang.Class<?> wildcardClass33 = derivativeException30.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!, , java.io.IOException: org.apache.commons.math.ode.DerivativeException: ]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException18 = new java.io.IOException("", (java.lang.Throwable) iOException6);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        iOException20.addSuppressed((java.lang.Throwable) derivativeException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) derivativeException31);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray37);
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) derivativeException38);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray42);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        derivativeException43.addSuppressed((java.lang.Throwable) derivativeException47);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException47);
        iOException39.addSuppressed((java.lang.Throwable) derivativeException47);
        java.io.IOException iOException51 = new java.io.IOException("", (java.lang.Throwable) iOException39);
        java.lang.Throwable[] throwableArray52 = iOException39.getSuppressed();
        derivativeException31.addSuppressed((java.lang.Throwable) iOException39);
        java.io.IOException iOException54 = new java.io.IOException((java.lang.Throwable) iOException39);
        java.lang.String str55 = iOException39.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str55, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray8);
        java.io.IOException iOException16 = new java.io.IOException();
        java.io.IOException iOException17 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException16);
        java.io.IOException iOException18 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException17);
        derivativeException13.addSuppressed((java.lang.Throwable) iOException19);
        java.lang.String str21 = iOException19.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str21, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.io.IOException iOException3 = new java.io.IOException();
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException4);
        java.lang.Class<?> wildcardClass8 = iOException7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.lang.String[] strArray6 = new java.lang.String[] { "org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) derivativeException18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        derivativeException23.addSuppressed((java.lang.Throwable) derivativeException27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException27);
        iOException19.addSuppressed((java.lang.Throwable) derivativeException27);
        java.io.IOException iOException31 = new java.io.IOException("", (java.lang.Throwable) iOException19);
        java.io.IOException iOException32 = new java.io.IOException("", (java.lang.Throwable) iOException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException32);
        java.io.IOException iOException34 = new java.io.IOException((java.lang.Throwable) iOException33);
        java.io.IOException iOException35 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) iOException33);
        derivativeException11.addSuppressed((java.lang.Throwable) iOException33);
        java.lang.String str37 = derivativeException11.getPattern();
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        java.lang.Class<?> wildcardClass39 = iOException38.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str37, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        java.lang.String str14 = iOException13.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: " + "'", str14, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("", strArray2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.String str16 = derivativeException12.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.lang.Class<?> wildcardClass20 = iOException19.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "java.io.IOException: org.apache.commons.math.ode.DerivativeException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray9);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str16, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ");
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray7 = iOException3.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray9 = iOException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
    }
}

