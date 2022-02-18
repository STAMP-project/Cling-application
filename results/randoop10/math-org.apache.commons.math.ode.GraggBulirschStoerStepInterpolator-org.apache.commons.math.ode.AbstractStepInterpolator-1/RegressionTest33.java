import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        java.lang.String[] strArray4 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.String str6 = derivativeException5.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException("java.io.IOException: hi!", (java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException", (java.lang.Throwable) derivativeException10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.lang.String[] strArray22 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray22);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) derivativeException31);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        java.io.IOException iOException37 = new java.io.IOException((java.lang.Throwable) derivativeException36);
        java.io.IOException iOException41 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException41);
        java.lang.Throwable[] throwableArray43 = derivativeException42.getSuppressed();
        java.lang.String str44 = derivativeException42.getPattern();
        java.io.IOException iOException45 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException42);
        java.io.IOException iOException46 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException42);
        derivativeException36.addSuppressed((java.lang.Throwable) iOException46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException36);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException36);
        java.io.IOException iOException52 = new java.io.IOException("");
        java.io.IOException iOException53 = new java.io.IOException("", (java.lang.Throwable) iOException52);
        java.lang.Throwable[] throwableArray54 = iOException52.getSuppressed();
        java.io.IOException iOException57 = new java.io.IOException("");
        java.io.IOException iOException58 = new java.io.IOException("", (java.lang.Throwable) iOException57);
        java.io.IOException iOException59 = new java.io.IOException((java.lang.Throwable) iOException58);
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) iOException59);
        iOException52.addSuppressed((java.lang.Throwable) iOException59);
        java.io.IOException iOException62 = new java.io.IOException((java.lang.Throwable) iOException59);
        java.io.IOException iOException66 = new java.io.IOException("");
        java.io.IOException iOException67 = new java.io.IOException("", (java.lang.Throwable) iOException66);
        java.io.IOException iOException68 = new java.io.IOException((java.lang.Throwable) iOException67);
        java.io.IOException iOException69 = new java.io.IOException((java.lang.Throwable) iOException68);
        java.io.IOException iOException70 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException69);
        iOException62.addSuppressed((java.lang.Throwable) iOException70);
        derivativeException36.addSuppressed((java.lang.Throwable) iOException62);
        iOException32.addSuppressed((java.lang.Throwable) iOException62);
        java.io.IOException iOException74 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", (java.lang.Throwable) iOException62);
        derivativeException10.addSuppressed((java.lang.Throwable) iOException62);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray8);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) derivativeException15);
        java.io.IOException iOException19 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        java.io.IOException iOException22 = new java.io.IOException("java.io.IOException");
        java.io.IOException iOException25 = new java.io.IOException("");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        java.lang.Throwable[] throwableArray27 = iOException25.getSuppressed();
        java.io.IOException iOException30 = new java.io.IOException("");
        java.io.IOException iOException31 = new java.io.IOException("", (java.lang.Throwable) iOException30);
        java.io.IOException iOException32 = new java.io.IOException((java.lang.Throwable) iOException31);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) iOException32);
        iOException25.addSuppressed((java.lang.Throwable) iOException32);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException32);
        java.io.IOException iOException39 = new java.io.IOException("");
        java.io.IOException iOException40 = new java.io.IOException("", (java.lang.Throwable) iOException39);
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) iOException40);
        java.io.IOException iOException42 = new java.io.IOException((java.lang.Throwable) iOException41);
        java.io.IOException iOException43 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException42);
        iOException35.addSuppressed((java.lang.Throwable) iOException43);
        java.io.IOException iOException45 = new java.io.IOException((java.lang.Throwable) iOException43);
        iOException22.addSuppressed((java.lang.Throwable) iOException43);
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) iOException43);
        iOException19.addSuppressed((java.lang.Throwable) iOException47);
        derivativeException15.addSuppressed((java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray50 = iOException19.getSuppressed();
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray60);
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray60);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("", strArray60);
        org.apache.commons.math.ode.DerivativeException derivativeException64 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray60);
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException", strArray60);
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("", strArray60);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray60);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException", strArray60);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray60);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException69);
        iOException19.addSuppressed((java.lang.Throwable) derivativeException70);
        java.io.IOException iOException72 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray73 = iOException19.getSuppressed();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(throwableArray73);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray1);
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.lang.String str19 = derivativeException18.getPattern();
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException18);
        java.lang.String[] strArray28 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray28);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException34);
        java.io.IOException iOException38 = new java.io.IOException("");
        java.io.IOException iOException39 = new java.io.IOException("", (java.lang.Throwable) iOException38);
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) iOException39);
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) iOException40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException40);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException42);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        derivativeException2.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException46 = new java.io.IOException((java.lang.Throwable) derivativeException2);
        java.lang.Throwable[] throwableArray47 = derivativeException2.getSuppressed();
        java.lang.Throwable[] throwableArray48 = derivativeException2.getSuppressed();
        java.lang.Object[] objArray49 = derivativeException2.getArguments();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray2);
        java.io.IOException iOException8 = new java.io.IOException("hi!");
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException("", (java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray12 = iOException8.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        derivativeException4.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray16 = derivativeException4.getSuppressed();
        java.lang.Object[] objArray17 = derivativeException4.getArguments();
        java.lang.Class<?> wildcardClass18 = derivativeException4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        java.lang.String str18 = derivativeException17.getPattern();
        java.lang.String[] strArray34 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException48);
        derivativeException17.addSuppressed((java.lang.Throwable) derivativeException48);
        java.lang.String str51 = derivativeException48.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str18, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!" + "'", str51, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray1);
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException2);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.lang.String str6 = derivativeException4.getPattern();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray10);
        java.lang.Throwable[] throwableArray20 = derivativeException19.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException19);
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        java.io.IOException iOException27 = new java.io.IOException("hi!");
        iOException25.addSuppressed((java.lang.Throwable) iOException27);
        java.io.IOException iOException29 = new java.io.IOException("hi!", (java.lang.Throwable) iOException27);
        java.io.IOException iOException30 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Throwable) iOException29);
        derivativeException19.addSuppressed((java.lang.Throwable) iOException30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException30);
        java.lang.String[] strArray40 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray40);
        java.lang.String str46 = derivativeException45.getPattern();
        java.lang.Throwable[] throwableArray47 = derivativeException45.getSuppressed();
        java.lang.Object[] objArray48 = derivativeException45.getArguments();
        java.lang.String[] strArray53 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("", strArray53);
        java.lang.String str57 = derivativeException56.getPattern();
        java.lang.Object[] objArray58 = derivativeException56.getArguments();
        derivativeException45.addSuppressed((java.lang.Throwable) derivativeException56);
        java.io.IOException iOException60 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException45);
        java.lang.Object[] objArray61 = derivativeException45.getArguments();
        java.io.IOException iOException62 = new java.io.IOException((java.lang.Throwable) derivativeException45);
        derivativeException32.addSuppressed((java.lang.Throwable) iOException62);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str46, "org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[java.io.IOException: ]");
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        iOException3.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("hi!", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.lang.String str10 = derivativeException9.getPattern();
        java.lang.String str11 = derivativeException9.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str13 = derivativeException12.getPattern();
        java.lang.String[] strArray21 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray29);
        java.lang.String str31 = derivativeException30.getPattern();
        derivativeException26.addSuppressed((java.lang.Throwable) derivativeException30);
        java.lang.String[] strArray40 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray40);
        derivativeException26.addSuppressed((java.lang.Throwable) derivativeException46);
        java.lang.Object[] objArray48 = derivativeException26.getArguments();
        java.io.IOException iOException51 = new java.io.IOException("hi!");
        java.io.IOException iOException53 = new java.io.IOException("hi!");
        iOException51.addSuppressed((java.lang.Throwable) iOException53);
        java.io.IOException iOException55 = new java.io.IOException("hi!", (java.lang.Throwable) iOException53);
        java.lang.Throwable[] throwableArray56 = iOException55.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException55);
        java.lang.String[] strArray60 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException("", strArray60);
        java.lang.String str62 = derivativeException61.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException61);
        iOException55.addSuppressed((java.lang.Throwable) derivativeException63);
        java.lang.String str65 = derivativeException63.getPattern();
        derivativeException26.addSuppressed((java.lang.Throwable) derivativeException63);
        java.lang.Throwable[] throwableArray67 = derivativeException26.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException68);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException69);
        java.io.IOException iOException71 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException70);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException70);
        java.lang.String str73 = derivativeException12.getPattern();
        java.io.IOException iOException74 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException75 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException76 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException75);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        java.lang.String[] strArray8 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray8);
        java.io.IOException iOException15 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException14);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        java.io.IOException iOException0 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException1 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException0);
        java.lang.String str2 = derivativeException1.getPattern();
        java.lang.Throwable[] throwableArray3 = derivativeException1.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException1);
        java.lang.String str5 = derivativeException4.getPattern();
        java.lang.String str6 = derivativeException4.getPattern();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.lang.String str19 = derivativeException18.getPattern();
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException18);
        java.lang.String[] strArray28 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray28);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException34);
        java.io.IOException iOException38 = new java.io.IOException("");
        java.io.IOException iOException39 = new java.io.IOException("", (java.lang.Throwable) iOException38);
        java.io.IOException iOException40 = new java.io.IOException((java.lang.Throwable) iOException39);
        java.io.IOException iOException41 = new java.io.IOException((java.lang.Throwable) iOException40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException40);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException42);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.Object[] objArray45 = derivativeException14.getArguments();
        java.io.IOException iOException46 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException14);
        java.io.IOException iOException47 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException49 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException48);
        java.lang.String str50 = derivativeException48.getPattern();
        java.lang.String[] strArray61 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException64 = new org.apache.commons.math.ode.DerivativeException("", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray61);
        org.apache.commons.math.ode.DerivativeException derivativeException71 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException70);
        java.lang.Object[] objArray72 = derivativeException71.getArguments();
        java.io.IOException iOException73 = new java.io.IOException((java.lang.Throwable) derivativeException71);
        derivativeException48.addSuppressed((java.lang.Throwable) derivativeException71);
        java.lang.String str75 = derivativeException71.toString();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str75, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        java.io.IOException iOException1 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        java.lang.Object[] objArray12 = derivativeException11.getArguments();
        iOException1.addSuppressed((java.lang.Throwable) derivativeException11);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[java.io.IOException: ]");
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray5);
        java.lang.String[] strArray16 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        java.lang.String str26 = derivativeException25.getPattern();
        derivativeException21.addSuppressed((java.lang.Throwable) derivativeException25);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray35);
        derivativeException21.addSuppressed((java.lang.Throwable) derivativeException41);
        java.io.IOException iOException45 = new java.io.IOException("");
        java.io.IOException iOException46 = new java.io.IOException("", (java.lang.Throwable) iOException45);
        java.io.IOException iOException47 = new java.io.IOException((java.lang.Throwable) iOException46);
        java.io.IOException iOException48 = new java.io.IOException((java.lang.Throwable) iOException47);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException47);
        derivativeException21.addSuppressed((java.lang.Throwable) derivativeException49);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException21);
        java.lang.Object[] objArray52 = derivativeException21.getArguments();
        java.lang.Throwable[] throwableArray53 = derivativeException21.getSuppressed();
        java.lang.Throwable[] throwableArray54 = derivativeException21.getSuppressed();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException2);
        java.lang.String[] strArray15 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        iOException4.addSuppressed((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray29 = iOException4.getSuppressed();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        java.lang.String[] strArray15 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: hi!", strArray15);
        java.lang.Throwable throwable30 = null;
        // The following exception was thrown during execution in test generation
        try {
            derivativeException29.addSuppressed(throwable30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        java.lang.String[] strArray9 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException19);
        java.lang.Object[] objArray21 = derivativeException19.getArguments();
        java.lang.String str22 = derivativeException19.getPattern();
        java.lang.Object[] objArray23 = derivativeException19.getArguments();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str22, "java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[java.io.IOException: ]");
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray6);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException10);
        java.lang.String str12 = derivativeException10.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray20);
        java.io.IOException iOException27 = new java.io.IOException("");
        java.io.IOException iOException28 = new java.io.IOException("", (java.lang.Throwable) iOException27);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) iOException28);
        java.io.IOException iOException30 = new java.io.IOException((java.lang.Throwable) iOException29);
        derivativeException24.addSuppressed((java.lang.Throwable) iOException30);
        java.io.IOException iOException32 = new java.io.IOException("", (java.lang.Throwable) derivativeException24);
        java.io.IOException iOException33 = new java.io.IOException((java.lang.Throwable) derivativeException24);
        derivativeException13.addSuppressed((java.lang.Throwable) iOException33);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException33);
        java.io.IOException iOException37 = new java.io.IOException("hi!");
        java.io.IOException iOException39 = new java.io.IOException("hi!");
        iOException37.addSuppressed((java.lang.Throwable) iOException39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException37);
        iOException35.addSuppressed((java.lang.Throwable) derivativeException41);
        java.io.IOException iOException43 = new java.io.IOException((java.lang.Throwable) derivativeException41);
        java.lang.String str44 = derivativeException41.toString();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: " + "'", str12, "java.io.IOException: ");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str44, "org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        java.io.IOException iOException3 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = derivativeException4.getSuppressed();
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException8 = new java.io.IOException("", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.lang.String str10 = derivativeException4.getPattern();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        java.lang.String[] strArray28 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        java.lang.String str30 = derivativeException29.getPattern();
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException29);
        java.lang.String[] strArray39 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray39);
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException45);
        java.io.IOException iOException49 = new java.io.IOException("");
        java.io.IOException iOException50 = new java.io.IOException("", (java.lang.Throwable) iOException49);
        java.io.IOException iOException51 = new java.io.IOException((java.lang.Throwable) iOException50);
        java.io.IOException iOException52 = new java.io.IOException((java.lang.Throwable) iOException51);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException51);
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException53);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException25);
        java.io.IOException iOException57 = new java.io.IOException((java.lang.Throwable) derivativeException13);
        java.io.IOException iOException60 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException60);
        java.lang.Throwable[] throwableArray62 = derivativeException61.getSuppressed();
        java.lang.String str63 = derivativeException61.getPattern();
        java.io.IOException iOException64 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException61);
        java.io.IOException iOException67 = new java.io.IOException("hi!");
        java.io.IOException iOException69 = new java.io.IOException("hi!");
        iOException67.addSuppressed((java.lang.Throwable) iOException69);
        java.io.IOException iOException71 = new java.io.IOException("hi!", (java.lang.Throwable) iOException69);
        java.lang.Throwable[] throwableArray72 = iOException71.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException71);
        java.lang.String[] strArray76 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException77 = new org.apache.commons.math.ode.DerivativeException("", strArray76);
        java.lang.String str78 = derivativeException77.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException77);
        iOException71.addSuppressed((java.lang.Throwable) derivativeException79);
        derivativeException61.addSuppressed((java.lang.Throwable) iOException71);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException61);
        derivativeException4.addSuppressed((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.io.IOException iOException85 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException84);
        java.io.IOException iOException86 = new java.io.IOException((java.lang.Throwable) derivativeException84);
        java.io.IOException iOException90 = new java.io.IOException("hi!");
        java.io.IOException iOException92 = new java.io.IOException("hi!");
        iOException90.addSuppressed((java.lang.Throwable) iOException92);
        java.io.IOException iOException94 = new java.io.IOException("hi!", (java.lang.Throwable) iOException92);
        java.lang.Throwable[] throwableArray95 = iOException92.getSuppressed();
        java.io.IOException iOException96 = new java.io.IOException("java.io.IOException: ", (java.lang.Throwable) iOException92);
        java.io.IOException iOException97 = new java.io.IOException((java.lang.Throwable) iOException92);
        derivativeException84.addSuppressed((java.lang.Throwable) iOException97);
        java.lang.String str99 = derivativeException84.getPattern();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(throwableArray95);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "hi!" + "'", str99, "hi!");
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        java.lang.String[] strArray5 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray5);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray19 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray19);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) derivativeException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException27);
        iOException10.addSuppressed((java.lang.Throwable) iOException27);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException10);
        java.lang.String str31 = derivativeException30.getPattern();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str31, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException(throwable1);
        java.io.IOException iOException3 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException2);
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = derivativeException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) derivativeException9);
        java.io.IOException iOException14 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException14);
        java.lang.Throwable[] throwableArray16 = derivativeException15.getSuppressed();
        java.lang.String str17 = derivativeException15.getPattern();
        java.io.IOException iOException18 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException15);
        derivativeException9.addSuppressed((java.lang.Throwable) iOException18);
        derivativeException2.addSuppressed((java.lang.Throwable) derivativeException9);
        java.lang.Throwable[] throwableArray21 = derivativeException2.getSuppressed();
        java.lang.Object[] objArray22 = derivativeException2.getArguments();
        java.lang.String str23 = derivativeException2.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str23, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray11);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) derivativeException21);
        java.lang.Object[] objArray23 = derivativeException21.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        java.lang.Object[] objArray25 = derivativeException21.getArguments();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[java.io.IOException: ]");
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException6);
        java.io.IOException iOException10 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException6);
        java.lang.Object[] objArray11 = derivativeException6.getArguments();
        java.lang.String str12 = derivativeException6.getPattern();
        java.lang.String str13 = derivativeException6.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str12, "java.io.IOException: java.io.IOException: java.io.IOException: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: " + "'", str13, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.io.IOException iOException13 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException12);
        java.lang.Object[] objArray14 = derivativeException12.getArguments();
        java.lang.Object[] objArray15 = derivativeException12.getArguments();
        java.lang.Class<?> wildcardClass16 = objArray15.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        java.lang.String[] strArray14 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray14);
        java.lang.String[] strArray38 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray38);
        derivativeException27.addSuppressed((java.lang.Throwable) derivativeException47);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", throwable1);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        java.io.IOException iOException4 = new java.io.IOException("hi!");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("hi!", (java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String str13 = derivativeException12.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        iOException6.addSuppressed((java.lang.Throwable) derivativeException14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) derivativeException14);
        java.lang.Throwable[] throwableArray17 = derivativeException14.getSuppressed();
        java.io.IOException iOException20 = new java.io.IOException("");
        java.io.IOException iOException21 = new java.io.IOException("", (java.lang.Throwable) iOException20);
        java.lang.Throwable[] throwableArray22 = iOException20.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException("");
        java.io.IOException iOException26 = new java.io.IOException("", (java.lang.Throwable) iOException25);
        java.io.IOException iOException27 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException27);
        iOException20.addSuppressed((java.lang.Throwable) iOException27);
        derivativeException14.addSuppressed((java.lang.Throwable) iOException27);
        java.lang.String[] strArray38 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        java.lang.String[] strArray46 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        java.lang.String str48 = derivativeException47.getPattern();
        derivativeException43.addSuppressed((java.lang.Throwable) derivativeException47);
        java.lang.String[] strArray57 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray57);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray57);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("", strArray57);
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray57);
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("", strArray57);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray57);
        derivativeException43.addSuppressed((java.lang.Throwable) derivativeException63);
        java.lang.String str65 = derivativeException63.getPattern();
        java.io.IOException iOException66 = new java.io.IOException((java.lang.Throwable) derivativeException63);
        java.lang.String str67 = derivativeException63.getPattern();
        java.io.IOException iOException68 = new java.io.IOException((java.lang.Throwable) derivativeException63);
        java.io.IOException iOException69 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException68);
        java.io.IOException iOException70 = new java.io.IOException((java.lang.Throwable) iOException69);
        derivativeException14.addSuppressed((java.lang.Throwable) iOException70);
        java.io.IOException iOException72 = new java.io.IOException((java.lang.Throwable) iOException70);
        java.lang.String str73 = iOException70.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.io.IOException: " + "'", str65, "java.io.IOException: ");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.io.IOException: " + "'", str67, "java.io.IOException: ");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException" + "'", str73, "java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray10);
        java.lang.Object[] objArray19 = derivativeException18.getArguments();
        java.lang.Object[] objArray20 = derivativeException18.getArguments();
        java.lang.String str21 = derivativeException18.getPattern();
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) derivativeException18);
        java.io.IOException iOException23 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException22);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException22);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: " + "'", str21, "org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ");
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        java.lang.String[] strArray6 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        java.lang.String[] strArray14 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        java.io.IOException iOException2 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException2);
        java.lang.Throwable[] throwableArray4 = derivativeException3.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) derivativeException3);
        java.io.IOException iOException7 = new java.io.IOException("", (java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.String str9 = derivativeException3.getPattern();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        java.lang.String str29 = derivativeException28.getPattern();
        derivativeException24.addSuppressed((java.lang.Throwable) derivativeException28);
        java.lang.String[] strArray38 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray38);
        derivativeException24.addSuppressed((java.lang.Throwable) derivativeException44);
        java.io.IOException iOException48 = new java.io.IOException("");
        java.io.IOException iOException49 = new java.io.IOException("", (java.lang.Throwable) iOException48);
        java.io.IOException iOException50 = new java.io.IOException((java.lang.Throwable) iOException49);
        java.io.IOException iOException51 = new java.io.IOException((java.lang.Throwable) iOException50);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException50);
        derivativeException24.addSuppressed((java.lang.Throwable) derivativeException52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException24);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException24);
        java.io.IOException iOException56 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException59 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException59);
        java.lang.Throwable[] throwableArray61 = derivativeException60.getSuppressed();
        java.lang.String str62 = derivativeException60.getPattern();
        java.io.IOException iOException63 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) derivativeException60);
        java.io.IOException iOException66 = new java.io.IOException("hi!");
        java.io.IOException iOException68 = new java.io.IOException("hi!");
        iOException66.addSuppressed((java.lang.Throwable) iOException68);
        java.io.IOException iOException70 = new java.io.IOException("hi!", (java.lang.Throwable) iOException68);
        java.lang.Throwable[] throwableArray71 = iOException70.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException70);
        java.lang.String[] strArray75 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException("", strArray75);
        java.lang.String str77 = derivativeException76.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException76);
        iOException70.addSuppressed((java.lang.Throwable) derivativeException78);
        derivativeException60.addSuppressed((java.lang.Throwable) iOException70);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException60);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException12);
        java.lang.Throwable[] throwableArray83 = derivativeException12.getSuppressed();
        java.lang.Object[] objArray84 = derivativeException12.getArguments();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        java.io.IOException iOException13 = new java.io.IOException();
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException13);
        derivativeException12.addSuppressed((java.lang.Throwable) iOException13);
        java.lang.Object[] objArray17 = derivativeException12.getArguments();
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray31);
        java.lang.String[] strArray53 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray53);
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray53);
        java.lang.Throwable[] throwableArray63 = derivativeException62.getSuppressed();
        derivativeException42.addSuppressed((java.lang.Throwable) derivativeException62);
        java.lang.String str65 = derivativeException42.getPattern();
        iOException18.addSuppressed((java.lang.Throwable) derivativeException42);
        java.io.IOException iOException67 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException42);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException67);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: " + "'", str65, "java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ");
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException3.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("");
        iOException3.addSuppressed((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException7);
        java.lang.String str11 = derivativeException10.getPattern();
        java.lang.String str12 = derivativeException10.getPattern();
        java.lang.Object[] objArray13 = derivativeException10.getArguments();
        java.io.IOException iOException14 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException10);
        java.lang.String str15 = derivativeException10.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str15, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        java.lang.Object[] objArray6 = derivativeException5.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) derivativeException5);
        java.lang.String[] strArray17 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        java.lang.String str23 = derivativeException22.getPattern();
        java.lang.String[] strArray30 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray30);
        java.lang.String[] strArray38 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        java.lang.String str40 = derivativeException39.getPattern();
        derivativeException35.addSuppressed((java.lang.Throwable) derivativeException39);
        java.lang.String[] strArray49 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("", strArray49);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray49);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("", strArray49);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray49);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("", strArray49);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray49);
        derivativeException35.addSuppressed((java.lang.Throwable) derivativeException55);
        java.lang.Object[] objArray57 = derivativeException35.getArguments();
        java.io.IOException iOException60 = new java.io.IOException("hi!");
        java.io.IOException iOException62 = new java.io.IOException("hi!");
        iOException60.addSuppressed((java.lang.Throwable) iOException62);
        java.io.IOException iOException64 = new java.io.IOException("hi!", (java.lang.Throwable) iOException62);
        java.lang.Throwable[] throwableArray65 = iOException64.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException64);
        java.lang.String[] strArray69 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("", strArray69);
        java.lang.String str71 = derivativeException70.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException70);
        iOException64.addSuppressed((java.lang.Throwable) derivativeException72);
        java.lang.String str74 = derivativeException72.getPattern();
        derivativeException35.addSuppressed((java.lang.Throwable) derivativeException72);
        java.lang.Object[] objArray76 = derivativeException35.getArguments();
        derivativeException22.addSuppressed((java.lang.Throwable) derivativeException35);
        java.io.IOException iOException78 = new java.io.IOException("hi!", (java.lang.Throwable) derivativeException35);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException35);
        java.lang.String str80 = derivativeException35.getPattern();
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException35);
        java.lang.Throwable[] throwableArray82 = derivativeException5.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        java.io.IOException iOException84 = new java.io.IOException((java.lang.Throwable) derivativeException83);
        java.lang.String str85 = iOException84.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[java.io.IOException: ]");
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str85, "java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        java.lang.String[] strArray19 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray19);
        java.lang.Object[] objArray38 = derivativeException37.getArguments();
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[java.io.IOException: ]");
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.Object[] objArray6 = derivativeException5.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        java.lang.Throwable throwable9 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException(throwable9);
        java.io.IOException iOException11 = new java.io.IOException("java.io.IOException", (java.lang.Throwable) derivativeException10);
        java.io.IOException iOException13 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!");
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException13);
        iOException11.addSuppressed((java.lang.Throwable) iOException14);
        derivativeException5.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException18 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", (java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        java.lang.String[] strArray7 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray7);
        java.io.IOException iOException14 = new java.io.IOException("");
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        derivativeException11.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException("", (java.lang.Throwable) derivativeException11);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        java.lang.Throwable[] throwableArray21 = derivativeException11.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.Throwable[] throwableArray23 = derivativeException11.getSuppressed();
        java.io.IOException iOException24 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) derivativeException11);
        java.io.IOException iOException26 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException11);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray10);
        java.lang.Object[] objArray20 = derivativeException19.getArguments();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[java.io.IOException: ]");
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        java.lang.String[] strArray13 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        java.io.IOException iOException26 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException23);
        java.io.IOException iOException27 = new java.io.IOException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException27);
        java.io.IOException iOException29 = new java.io.IOException((java.lang.Throwable) derivativeException28);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        java.lang.String[] strArray13 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray13);
        java.lang.Throwable[] throwableArray25 = derivativeException24.getSuppressed();
        java.lang.String[] strArray35 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray35);
        java.lang.String[] strArray46 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        java.lang.String[] strArray54 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        java.lang.String str56 = derivativeException55.getPattern();
        derivativeException51.addSuppressed((java.lang.Throwable) derivativeException55);
        java.lang.String[] strArray65 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException71 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray65);
        derivativeException51.addSuppressed((java.lang.Throwable) derivativeException71);
        java.io.IOException iOException75 = new java.io.IOException("");
        java.io.IOException iOException76 = new java.io.IOException("", (java.lang.Throwable) iOException75);
        java.io.IOException iOException77 = new java.io.IOException((java.lang.Throwable) iOException76);
        java.io.IOException iOException78 = new java.io.IOException((java.lang.Throwable) iOException77);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException77);
        derivativeException51.addSuppressed((java.lang.Throwable) derivativeException79);
        derivativeException39.addSuppressed((java.lang.Throwable) derivativeException51);
        java.lang.String str82 = derivativeException51.getPattern();
        java.io.IOException iOException83 = new java.io.IOException((java.lang.Throwable) derivativeException51);
        java.lang.Throwable[] throwableArray84 = derivativeException51.getSuppressed();
        java.io.IOException iOException85 = new java.io.IOException((java.lang.Throwable) derivativeException51);
        java.io.IOException iOException86 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException51);
        java.io.IOException iOException87 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: hi!", (java.lang.Throwable) iOException86);
        java.io.IOException iOException88 = new java.io.IOException("", (java.lang.Throwable) iOException86);
        java.io.IOException iOException89 = new java.io.IOException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) iOException86);
        derivativeException24.addSuppressed((java.lang.Throwable) iOException89);
        java.lang.Object[] objArray91 = derivativeException24.getArguments();
        java.io.IOException iOException92 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: hi!", (java.lang.Throwable) derivativeException24);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[java.io.IOException: ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[java.io.IOException: ]");
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException("", (java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) derivativeException7);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        java.lang.String str13 = derivativeException12.getPattern();
        java.lang.Object[] objArray14 = derivativeException12.getArguments();
        iOException8.addSuppressed((java.lang.Throwable) derivativeException12);
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException12);
        java.lang.String[] strArray27 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: ", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", strArray27);
        derivativeException12.addSuppressed((java.lang.Throwable) derivativeException36);
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) derivativeException12);
        java.lang.Class<?> wildcardClass39 = iOException38.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        java.lang.String[] strArray10 = new java.lang.String[] { "java.io.IOException: " };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: java.io.IOException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: ", strArray10);
        java.io.IOException iOException19 = new java.io.IOException("java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: java.io.IOException: ", (java.lang.Throwable) derivativeException18);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) derivativeException18);
        org.junit.Assert.assertNotNull(strArray10);
    }
}

