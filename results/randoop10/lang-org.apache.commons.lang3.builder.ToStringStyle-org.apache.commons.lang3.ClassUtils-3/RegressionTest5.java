import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray16 = new long[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Double", longArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[-1]");
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray6 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "java", floatArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "commons");
        java.lang.StringBuffer stringBuffer16 = null;
        short[] shortArray21 = new short[] { (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "String", shortArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[0, 10, 1]");
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle43, "Byte");
        java.lang.Class<?> wildcardClass46 = toStringStyle43.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle47, "Byte");
        java.lang.Class<?> wildcardClass50 = toStringStyle47.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle51, "Byte");
        java.lang.Class<?> wildcardClass54 = toStringStyle51.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle55, "Byte");
        java.lang.Class<?> wildcardClass58 = toStringStyle55.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass46;
        wildcardClassArray61[1] = wildcardClass50;
        wildcardClassArray61[2] = wildcardClass54;
        wildcardClassArray61[3] = wildcardClass58;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str72 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle70, "Byte");
        java.lang.Class<?> wildcardClass73 = toStringStyle70.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle74 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle74, "Byte");
        java.lang.Class<?> wildcardClass77 = toStringStyle74.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass73;
        wildcardClassArray80[1] = wildcardClass77;
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray86);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray89);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray90);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray91);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray91);
        java.lang.Class<?> wildcardClass94 = wildcardClassArray91.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.lang3.builder" + "'", str45, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.lang3.builder" + "'", str49, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.lang3.builder" + "'", str53, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(toStringStyle55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org.apache.commons.lang3.builder" + "'", str57, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org.apache.commons.lang3.builder" + "'", str72, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(toStringStyle74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.lang3.builder" + "'", str76, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray14 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList", booleanArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true]");
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle43, "Byte");
        java.lang.Class<?> wildcardClass46 = toStringStyle43.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle47, "Byte");
        java.lang.Class<?> wildcardClass50 = toStringStyle47.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle51, "Byte");
        java.lang.Class<?> wildcardClass54 = toStringStyle51.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle55, "Byte");
        java.lang.Class<?> wildcardClass58 = toStringStyle55.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass46;
        wildcardClassArray61[1] = wildcardClass50;
        wildcardClassArray61[2] = wildcardClass54;
        wildcardClassArray61[3] = wildcardClass58;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str72 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle70, "Byte");
        java.lang.Class<?> wildcardClass73 = toStringStyle70.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle74 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle74, "Byte");
        java.lang.Class<?> wildcardClass77 = toStringStyle74.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass73;
        wildcardClassArray80[1] = wildcardClass77;
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray86, false);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.lang3.builder" + "'", str45, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.lang3.builder" + "'", str49, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.lang3.builder" + "'", str53, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(toStringStyle55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org.apache.commons.lang3.builder" + "'", str57, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org.apache.commons.lang3.builder" + "'", str72, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(toStringStyle74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.lang3.builder" + "'", str76, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "java.lang", shortArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        float[] floatArray9 = new float[] { (short) 1, '4', (-1.0f), '#', 3, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ToStringStyle.DefaultToStringStyle", floatArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[1.0, 52.0, -1.0, 35.0, 3.0, -1.0]");
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ArrayList");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        int[] intArray27 = new int[] { 0, (-1), '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "apache", intArray27, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, -1, 36]");
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "org.apache");
        java.lang.StringBuffer stringBuffer19 = null;
        int[] intArray22 = new int[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ShortPrefixToStringStyle", intArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1]");
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray17 = new short[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ShortPrefixToStringStyle", shortArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[10, 0, -1, 10, 1, -1]");
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Long");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray17 = new double[] { (byte) 1, (short) -1, 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", doubleArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 4.0]");
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons.lang3", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "$");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "org.apache.commons", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MultiLineToStringStyle" + "'", str1, "MultiLineToStringStyle");
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", byteArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 1, 100, 10, -1, -1]");
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        long[] longArray20 = new long[] { (byte) 0, (short) 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "DefaultToStringStyle", longArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[0, 1, 0]");
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.DefaultToStringStyle", (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "org.apache.commons");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java.lang", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "Float");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "Class", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray6 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "commons", charArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "commons");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray17 = new double[] { 100L, (short) -1, '$', 10.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList", doubleArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, -1.0, 36.0, 10.0, 10.0]");
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, ".");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray18 = new short[] { (byte) -1, (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", shortArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 1, 1]");
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray21 = new float[] { 10.0f, (byte) 10, 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.NoFieldNameToStringStyle", floatArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 10.0, 4.0]");
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ShortPrefixToStringStyle", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle44 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str46 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle44, "Byte");
        java.lang.Class<?> wildcardClass47 = toStringStyle44.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle48 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str50 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle48, "Byte");
        java.lang.Class<?> wildcardClass51 = toStringStyle48.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle52 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str54 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle52, "Byte");
        java.lang.Class<?> wildcardClass55 = toStringStyle52.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle56 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str58 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle56, "Byte");
        java.lang.Class<?> wildcardClass59 = toStringStyle56.getClass();
        java.lang.Class[] classArray61 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        wildcardClassArray62[0] = wildcardClass47;
        wildcardClassArray62[1] = wildcardClass51;
        wildcardClassArray62[2] = wildcardClass55;
        wildcardClassArray62[3] = wildcardClass59;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle71 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str73 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle71, "Byte");
        java.lang.Class<?> wildcardClass74 = toStringStyle71.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle75 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str77 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle75, "Byte");
        java.lang.Class<?> wildcardClass78 = toStringStyle75.getClass();
        java.lang.Class[] classArray80 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        wildcardClassArray81[0] = wildcardClass74;
        wildcardClassArray81[1] = wildcardClass78;
        boolean boolean86 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray62, wildcardClassArray81);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray62, true);
        java.lang.Class<?>[] wildcardClassArray89 = null;
        boolean boolean91 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray89, true);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?> wildcardClass93 = wildcardClassArray92.getClass();
        java.lang.String str95 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray92, "org.apache");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(toStringStyle44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.apache.commons.lang3.builder" + "'", str46, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(toStringStyle48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.apache.commons.lang3.builder" + "'", str50, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(toStringStyle52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.apache.commons.lang3.builder" + "'", str54, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(toStringStyle56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "org.apache.commons.lang3.builder" + "'", str58, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(toStringStyle71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "org.apache.commons.lang3.builder" + "'", str73, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(toStringStyle75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "org.apache.commons.lang3.builder" + "'", str77, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Class[]" + "'", str95, "Class[]");
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray9 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org", longArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "commons", doubleArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("lang3", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang3");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Byte");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "org.apache", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ShortPrefixToStringStyle", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        int[] intArray19 = new int[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.ShortPrefixToStringStyle", intArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[97]");
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "util", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Long", byteArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 0, 1]");
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendSuper(stringBuffer9, "lang");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle8.appendSuper(stringBuffer12, "");
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "ArrayList");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "apache", 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "Long");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ShortPrefixToStringStyle", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray9 = new short[] { (short) 0, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "hi!", shortArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[0, 100, 0]");
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object obj5 = null;
        toStringStyle0.appendStart(stringBuffer4, obj5);
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray13 = new short[] { (short) 10, (short) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "lang", shortArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[10, 100, 1, 100]");
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle43, "Byte");
        java.lang.Class<?> wildcardClass46 = toStringStyle43.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle47, "Byte");
        java.lang.Class<?> wildcardClass50 = toStringStyle47.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle51, "Byte");
        java.lang.Class<?> wildcardClass54 = toStringStyle51.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle55, "Byte");
        java.lang.Class<?> wildcardClass58 = toStringStyle55.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass46;
        wildcardClassArray61[1] = wildcardClass50;
        wildcardClassArray61[2] = wildcardClass54;
        wildcardClassArray61[3] = wildcardClass58;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str72 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle70, "Byte");
        java.lang.Class<?> wildcardClass73 = toStringStyle70.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle74 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle74, "Byte");
        java.lang.Class<?> wildcardClass77 = toStringStyle74.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass73;
        wildcardClassArray80[1] = wildcardClass77;
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray86);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray89);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray90);
        java.lang.String str93 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray91, "DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.lang3.builder" + "'", str45, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.lang3.builder" + "'", str49, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.lang3.builder" + "'", str53, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(toStringStyle55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org.apache.commons.lang3.builder" + "'", str57, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org.apache.commons.lang3.builder" + "'", str72, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(toStringStyle74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.lang3.builder" + "'", str76, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Class[]" + "'", str93, "Class[]");
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = null;
        boolean boolean3 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray1, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "Double");
        java.lang.StringBuffer stringBuffer19 = null;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "java.util", byteArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1]");
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "apache", byteArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 0, 100, 100]");
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Long");
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ".", byteArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -1, -1, 10]");
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray19 = new short[] { (short) 10, (byte) -1, (byte) 100, (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Class[]", shortArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10, -1, 100, 1, 100]");
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendToString(stringBuffer22, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer25 = null;
        char[] charArray28 = new char[] { '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "util", charArray28, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), ".");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), ".");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[.]");
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) 'a', "Class");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Character" + "'", str2, "Character");
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        long[] longArray26 = new long[] { 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "org", longArray26, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[10, 10]");
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle5, "Byte");
        java.lang.Class<?> wildcardClass8 = toStringStyle5.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle9, "Byte");
        java.lang.Class<?> wildcardClass12 = toStringStyle9.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.Class<?> wildcardClass16 = toStringStyle13.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle17, "Byte");
        java.lang.Class<?> wildcardClass20 = toStringStyle17.getClass();
        java.lang.Class[] classArray22 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        wildcardClassArray23[0] = wildcardClass8;
        wildcardClassArray23[1] = wildcardClass12;
        wildcardClassArray23[2] = wildcardClass16;
        wildcardClassArray23[3] = wildcardClass20;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle32 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str34 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle32, "Byte");
        java.lang.Class<?> wildcardClass35 = toStringStyle32.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle36 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str38 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle36, "Byte");
        java.lang.Class<?> wildcardClass39 = toStringStyle36.getClass();
        java.lang.Class[] classArray41 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        wildcardClassArray42[0] = wildcardClass35;
        wildcardClassArray42[1] = wildcardClass39;
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray42);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle48 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str50 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle48, "Byte");
        java.lang.Class<?> wildcardClass51 = toStringStyle48.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle52 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str54 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle52, "Byte");
        java.lang.Class<?> wildcardClass55 = toStringStyle52.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle56 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str58 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle56, "Byte");
        java.lang.Class<?> wildcardClass59 = toStringStyle56.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle60 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str62 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle60, "Byte");
        java.lang.Class<?> wildcardClass63 = toStringStyle60.getClass();
        java.lang.Class[] classArray65 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        wildcardClassArray66[0] = wildcardClass51;
        wildcardClassArray66[1] = wildcardClass55;
        wildcardClassArray66[2] = wildcardClass59;
        wildcardClassArray66[3] = wildcardClass63;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle75 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str77 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle75, "Byte");
        java.lang.Class<?> wildcardClass78 = toStringStyle75.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle79 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str81 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle79, "Byte");
        java.lang.Class<?> wildcardClass82 = toStringStyle79.getClass();
        java.lang.Class[] classArray84 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray85 = (java.lang.Class<?>[]) classArray84;
        wildcardClassArray85[0] = wildcardClass78;
        wildcardClassArray85[1] = wildcardClass82;
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray66, wildcardClassArray85);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray66);
        boolean boolean93 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray91, false);
        java.lang.Class<?>[] wildcardClassArray94 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray91);
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray94);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer4, (java.lang.Object) wildcardClassArray94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.lang3.builder" + "'", str19, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(toStringStyle32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.apache.commons.lang3.builder" + "'", str34, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(toStringStyle36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.apache.commons.lang3.builder" + "'", str38, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(toStringStyle48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.apache.commons.lang3.builder" + "'", str50, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(toStringStyle52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.apache.commons.lang3.builder" + "'", str54, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(toStringStyle56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "org.apache.commons.lang3.builder" + "'", str58, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(toStringStyle60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "org.apache.commons.lang3.builder" + "'", str62, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(toStringStyle75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "org.apache.commons.lang3.builder" + "'", str77, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(toStringStyle79);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "org.apache.commons.lang3.builder" + "'", str81, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(classArray84);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray94);
        org.junit.Assert.assertNotNull(wildcardClassArray95);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class[]", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray20 = new double[] { 0L, (byte) -1, 3 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", doubleArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, -1.0, 3.0]");
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray43);
        java.lang.Class<?> wildcardClass45 = wildcardClassArray44.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Long");
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray24 = new char[] { '$', '4', ' ', '.', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Boolean", charArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "$4 .  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "$4 .  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[$, 4,  , .,  ,  ]");
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "org.apache");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        char[] charArray24 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "Class[]", charArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Double", shortArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ShortPrefixToStringStyle", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendToString(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "");
        toStringStyle8.appendStart(stringBuffer12, (java.lang.Object) stringBuffer19);
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle0.appendSuper(stringBuffer24, "java");
        java.lang.StringBuffer stringBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer27, "util", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Class[]");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java", (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", doubleArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray13 = new char[] { '#', 'a', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "apache", charArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a,  , a]");
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        double[] doubleArray5 = new double[] { 'a', 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "hi!", doubleArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[97.0, 100.0]");
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, ".");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray18 = new short[] { (short) 100, (byte) -1, (short) 1, (byte) 0, (short) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Long", shortArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[100, -1, 1, 0, 100, 0]");
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle43, "Byte");
        java.lang.Class<?> wildcardClass46 = toStringStyle43.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle47, "Byte");
        java.lang.Class<?> wildcardClass50 = toStringStyle47.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle51, "Byte");
        java.lang.Class<?> wildcardClass54 = toStringStyle51.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle55, "Byte");
        java.lang.Class<?> wildcardClass58 = toStringStyle55.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass46;
        wildcardClassArray61[1] = wildcardClass50;
        wildcardClassArray61[2] = wildcardClass54;
        wildcardClassArray61[3] = wildcardClass58;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str72 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle70, "Byte");
        java.lang.Class<?> wildcardClass73 = toStringStyle70.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle74 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle74, "Byte");
        java.lang.Class<?> wildcardClass77 = toStringStyle74.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass73;
        wildcardClassArray80[1] = wildcardClass77;
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray86, false);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray89);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray90);
        java.lang.String str93 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray90, "builder");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.lang3.builder" + "'", str45, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.lang3.builder" + "'", str49, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.lang3.builder" + "'", str53, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(toStringStyle55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org.apache.commons.lang3.builder" + "'", str57, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org.apache.commons.lang3.builder" + "'", str72, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(toStringStyle74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.lang3.builder" + "'", str76, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "java.lang" + "'", str93, "java.lang");
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray8 = new short[] { (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache", shortArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10, 10]");
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = null;
        boolean boolean3 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray1, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle43, "Byte");
        java.lang.Class<?> wildcardClass46 = toStringStyle43.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle47, "Byte");
        java.lang.Class<?> wildcardClass50 = toStringStyle47.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle51, "Byte");
        java.lang.Class<?> wildcardClass54 = toStringStyle51.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle55, "Byte");
        java.lang.Class<?> wildcardClass58 = toStringStyle55.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass46;
        wildcardClassArray61[1] = wildcardClass50;
        wildcardClassArray61[2] = wildcardClass54;
        wildcardClassArray61[3] = wildcardClass58;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str72 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle70, "Byte");
        java.lang.Class<?> wildcardClass73 = toStringStyle70.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle74 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle74, "Byte");
        java.lang.Class<?> wildcardClass77 = toStringStyle74.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass73;
        wildcardClassArray80[1] = wildcardClass77;
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray86, false);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray89);
        java.lang.Class<?> wildcardClass91 = wildcardClassArray89.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.lang3.builder" + "'", str45, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.lang3.builder" + "'", str49, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.lang3.builder" + "'", str53, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(toStringStyle55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org.apache.commons.lang3.builder" + "'", str57, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org.apache.commons.lang3.builder" + "'", str72, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(toStringStyle74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.lang3.builder" + "'", str76, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "builder", (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, ".", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray20 = new long[] { 1L, (short) 0, (byte) 100, (short) 1, 1L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "java.util", longArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[1, 0, 100, 1, 1, 52]");
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "builder");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray16 = new double[] { 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Long", doubleArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[2.0]");
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray17 = new int[] { ' ', (byte) 10, '.', (byte) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", intArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 10, 46, 0, 10]");
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Boolean", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendToString(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "");
        toStringStyle8.appendStart(stringBuffer12, (java.lang.Object) stringBuffer19);
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle0.appendSuper(stringBuffer24, "java");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle0.appendToString(stringBuffer27, "java.util");
        java.lang.StringBuffer stringBuffer30 = null;
        toStringStyle0.appendSuper(stringBuffer30, "Double");
        java.lang.StringBuffer stringBuffer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer33, "Integer", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray18 = new boolean[] { false, true, false, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class[]", booleanArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, true, false, false, false, true]");
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class", (double) '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray20 = new char[] { '$', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, ".", charArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "$a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "$a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[$, a]");
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ArrayList");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray20 = new double[] { (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "lang3", doubleArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 0.0]");
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ToStringStyle.NoFieldNameToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle/NoFieldNameToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray16 = new short[] { (short) 0, (byte) -1, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Character", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, -1, 1, 100]");
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendToString(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "");
        toStringStyle8.appendStart(stringBuffer12, (java.lang.Object) stringBuffer19);
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle0.appendSuper(stringBuffer24, "java");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle0.appendToString(stringBuffer27, "java.util");
        java.lang.StringBuffer stringBuffer30 = null;
        toStringStyle0.appendSuper(stringBuffer30, "Double");
        java.lang.StringBuffer stringBuffer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer33, "Long", (float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "util", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray17 = new boolean[] { true, true, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "apache", booleanArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, true, true, false, true]");
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray13 = new long[] { '.', (byte) 10, 2, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Integer", longArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[46, 10, 2, 1]");
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "lang3", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ArrayList");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Short");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray15 = new double[] { 0, (byte) -1, (byte) 100, (-1L), (byte) 1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle", doubleArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, -1.0, 100.0, -1.0, 1.0, -1.0]");
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "java.util", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object obj5 = null;
        toStringStyle0.appendStart(stringBuffer4, obj5);
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray12 = new boolean[] { true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", booleanArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true]");
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray14 = new char[] { 'a', ' ', '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "$", charArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a 4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a 4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a,  , 4, #,  ]");
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray13 = new int[] { 3 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.util", intArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3]");
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        double[] doubleArray4 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ShortPrefixToStringStyle", doubleArray4, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0]");
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendSuper(stringBuffer9, "lang");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle8.appendSuper(stringBuffer12, "");
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer16 = null;
        int[] intArray19 = new int[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3", intArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32]");
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray15 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "builder", byteArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        java.lang.String[] strArray2 = new java.lang.String[] { "$", "$" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList3);
        java.util.List<java.lang.Class<?>> wildcardClassList6 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList3);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList3);
        java.util.List<java.lang.Class<?>> wildcardClassList8 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList3);
        java.lang.Class<?> wildcardClass9 = strList3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClassList5);
        org.junit.Assert.assertNotNull(wildcardClassList6);
        org.junit.Assert.assertNotNull(wildcardClassList7);
        org.junit.Assert.assertNotNull(wildcardClassList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Short");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray17 = new char[] { '$', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", charArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "$$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "$$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[$, $]");
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray13 = new char[] { '$', '.', '.', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java", charArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "$..a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "$..a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[$, ., ., a]");
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Float");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Boolean", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "commons", (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray9 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Short", byteArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Long");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray19 = new long[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "lang3", longArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[100]");
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "org.apache.commons");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "org.apache", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "Long");
        java.lang.StringBuffer stringBuffer15 = null;
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "builder", byteArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[100, 10]");
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray12 = new float[] { 100.0f, 0L, (short) 100, (short) -1, '.', (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Byte", floatArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[100.0, 0.0, 100.0, -1.0, 46.0, -1.0]");
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "lang", (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "lang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lang" + "'", str2, "lang");
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "commons", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendToString(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "");
        toStringStyle8.appendStart(stringBuffer12, (java.lang.Object) stringBuffer19);
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle0.appendSuper(stringBuffer24, "java");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle0.appendToString(stringBuffer27, "java.util");
        java.lang.StringBuffer stringBuffer30 = null;
        toStringStyle0.appendSuper(stringBuffer30, "Double");
        java.lang.StringBuffer stringBuffer33 = null;
        float[] floatArray37 = new float[] { '$', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer33, "NoFieldNameToStringStyle", floatArray37, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[36.0, 10.0]");
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "Long");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Float", (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle5, "Byte");
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle5.appendSuper(stringBuffer8, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle5.appendSuper(stringBuffer11, "");
        toStringStyle0.appendStart(stringBuffer4, (java.lang.Object) stringBuffer11);
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray21 = new boolean[] { false, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ShortPrefixToStringStyle", booleanArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false, true]");
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "commons");
        java.lang.StringBuffer stringBuffer18 = null;
        double[] doubleArray26 = new double[] { 4, (-1), (byte) 1, '#', (short) -1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "org.apache.commons.lang3", doubleArray26, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[4.0, -1.0, 1.0, 35.0, -1.0, 1.0]");
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "org.apache.commons", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache.commons.lang3", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons/lang3");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "Float", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Short", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Byte");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "lang", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("apache", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: apache");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "Boolean");
        java.lang.StringBuffer stringBuffer18 = null;
        short[] shortArray23 = new short[] { (short) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "", shortArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[1, 0, 0]");
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "apache");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", floatArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        short[] shortArray20 = new short[] { (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ArrayList", shortArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 1]");
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DefaultToStringStyle" + "'", str1, "DefaultToStringStyle");
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle8.appendToString(stringBuffer11, ".");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle8.appendToString(stringBuffer14, "Class");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle8.appendSuper(stringBuffer17, "Class[]");
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle8.appendToString(stringBuffer20, "java.util");
        java.lang.StringBuffer stringBuffer23 = null;
        toStringStyle8.appendToString(stringBuffer23, "lang3");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer7, (java.lang.Object) "lang3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray18 = new int[] { 1, '#', '$', 2, (short) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Boolean", intArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 35, 36, 2, 100, 97]");
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray16 = new boolean[] { true, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "commons", booleanArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, true, false, true]");
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "util", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "lang");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Byte");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendToString(stringBuffer22, "java.lang");
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "Double", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray23 = new boolean[] { true, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Class", booleanArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[true, true, false, false, true]");
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "lang");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "lang", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray18 = new float[] { 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Short", floatArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[4.0]");
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "MultiLineToStringStyle", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Long", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "commons");
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray21 = new boolean[] { false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.ShortPrefixToStringStyle", booleanArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false]");
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray15 = new long[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "java.util", longArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[100]");
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "Float");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "Double", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Double");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray17 = new int[] { '#', (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Integer", intArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 10, 0]");
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray13 = new boolean[] { true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class", booleanArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, false, false]");
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "org.apache.commons");
        java.lang.StringBuffer stringBuffer19 = null;
        short[] shortArray26 = new short[] { (byte) 10, (short) -1, (short) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "Byte", shortArray26, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[10, -1, 0, -1, -1]");
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "ArrayList");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayList" + "'", str2, "ArrayList");
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray45, "lang");
        java.lang.Class<?> wildcardClass49 = wildcardClassArray45.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Class[]" + "'", str48, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "$", "$" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.Class<?>> wildcardClassList17 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList15);
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strList15, "$");
        java.util.List<java.lang.Class<?>> wildcardClassList20 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Class<?>> wildcardClassList21 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Class<?>> wildcardClassList22 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList15);
        java.util.List<java.lang.Class<?>> wildcardClassList23 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList15);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", (java.lang.Object) strList15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.util" + "'", str19, "java.util");
        org.junit.Assert.assertNotNull(wildcardClassList20);
        org.junit.Assert.assertNotNull(wildcardClassList21);
        org.junit.Assert.assertNotNull(wildcardClassList22);
        org.junit.Assert.assertNotNull(wildcardClassList23);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray14 = new int[] { (byte) 100, (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "String", intArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, -1]");
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer18 = null;
        boolean[] booleanArray21 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "org.apache", booleanArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false]");
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "ToStringStyle.MultiLineToStringStyle", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "commons", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "commons");
        java.lang.Class<?> wildcardClass10 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "MultiLineToStringStyle", (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "org", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ArrayList");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendSuper(stringBuffer22, "Integer");
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "Byte", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "commons");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Boolean", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "MultiLineToStringStyle", "Character");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "String" + "'", str16, "String");
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "java.lang");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Long", doubleArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, ".");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray14 = new float[] { 100.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", floatArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[100.0, 10.0]");
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray19 = new short[] { (byte) 1, (short) 0, (byte) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Boolean", shortArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 0, 100, 100]");
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendToString(stringBuffer19, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "Character", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        long[] longArray19 = new long[] { (byte) 0, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "java.util", longArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[0, -1]");
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "lang");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "org.apache");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ShortPrefixToStringStyle", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray17 = new float[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", floatArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[100.0, -1.0]");
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Class[]");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray15 = new float[] { (short) 10, 0L, 10, (-1.0f), 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "apache", floatArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 0.0, 10.0, -1.0, 0.0, 97.0]");
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray18 = new double[] { (short) 0, (-1L), 10, (short) 100, 1.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache", doubleArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, 10.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "java.lang", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "String");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendToString(stringBuffer18, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "java.util");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "lang3");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "Double", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("org");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org" + "'", str1, "org");
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ShortPrefixToStringStyle", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, ".");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray16 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "java.lang", charArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#]");
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "java.util");
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray21 = new boolean[] { false, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Double", booleanArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, true, false]");
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", byteArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, -1, 100, 0, 100]");
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Boolean");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle15, "Byte");
        java.lang.Class<?> wildcardClass18 = toStringStyle15.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle19, "Byte");
        java.lang.Class<?> wildcardClass22 = toStringStyle19.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle23 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle23, "Byte");
        java.lang.Class<?> wildcardClass26 = toStringStyle23.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass18;
        wildcardClassArray33[1] = wildcardClass22;
        wildcardClassArray33[2] = wildcardClass26;
        wildcardClassArray33[3] = wildcardClass30;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle42 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str44 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle42, "Byte");
        java.lang.Class<?> wildcardClass45 = toStringStyle42.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle46 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle46, "Byte");
        java.lang.Class<?> wildcardClass49 = toStringStyle46.getClass();
        java.lang.Class[] classArray51 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass45;
        wildcardClassArray52[1] = wildcardClass49;
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray58);
        java.lang.String str61 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray59, "org.apache.commons.lang3.builder");
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray59);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray62);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "builder", (java.lang.Object[]) wildcardClassArray63, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.lang3.builder" + "'", str17, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.lang3.builder" + "'", str21, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(toStringStyle23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.lang3.builder" + "'", str25, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(toStringStyle42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "org.apache.commons.lang3.builder" + "'", str44, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(toStringStyle46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.lang3.builder" + "'", str48, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.lang" + "'", str61, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        java.lang.String[] strArray2 = new java.lang.String[] { "$", "$" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList3);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassList5, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClassList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ArrayList" + "'", str7, "ArrayList");
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "apache", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ArrayList");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Character", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "Class");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Class" + "'", str2, "Class");
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "apache", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object obj5 = null;
        toStringStyle0.appendStart(stringBuffer4, obj5);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "DefaultToStringStyle", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "org.apache.commons");
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle21, "Byte");
        java.lang.Class<?> wildcardClass24 = toStringStyle21.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str27 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle25, "Byte");
        java.lang.Class<?> wildcardClass28 = toStringStyle25.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle29 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str31 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle29, "Byte");
        java.lang.Class<?> wildcardClass32 = toStringStyle29.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle33, "Byte");
        java.lang.Class<?> wildcardClass36 = toStringStyle33.getClass();
        java.lang.Class[] classArray38 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass24;
        wildcardClassArray39[1] = wildcardClass28;
        wildcardClassArray39[2] = wildcardClass32;
        wildcardClassArray39[3] = wildcardClass36;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle48 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str50 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle48, "Byte");
        java.lang.Class<?> wildcardClass51 = toStringStyle48.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle52 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str54 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle52, "Byte");
        java.lang.Class<?> wildcardClass55 = toStringStyle52.getClass();
        java.lang.Class[] classArray57 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        wildcardClassArray58[0] = wildcardClass51;
        wildcardClassArray58[1] = wildcardClass55;
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray58);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray39);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray64);
        java.lang.String str67 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray65, "org.apache.commons.lang3.builder");
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray68);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray68);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "DefaultToStringStyle", (java.lang.Object[]) wildcardClassArray70, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.lang3.builder" + "'", str23, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache.commons.lang3.builder" + "'", str27, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(toStringStyle29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.lang3.builder" + "'", str31, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(toStringStyle33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.lang3.builder" + "'", str35, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(toStringStyle48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.apache.commons.lang3.builder" + "'", str50, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(toStringStyle52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.apache.commons.lang3.builder" + "'", str54, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.lang" + "'", str67, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "ShortPrefixToStringStyle", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "lang");
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray16 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "String", booleanArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false]");
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("org");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "org.apache.commons");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Byte", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        java.lang.String[] strArray7 = new java.lang.String[] { "lang", "Class[]", "$", "ToStringStyle", "java.util", "Class", "lang" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.Class<?>> wildcardClassList10 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.Class<?>> wildcardClassList11 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassList11, "hi!");
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassList11, "Float");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClassList10);
        org.junit.Assert.assertNotNull(wildcardClassList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ArrayList" + "'", str13, "ArrayList");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.util" + "'", str15, "java.util");
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.MultiLineToStringStyle", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "lang", byteArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 1, 100, 1, 10]");
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "String", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.util");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray17 = new char[] { '.', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "$", charArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), ".#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), ".#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[., #]");
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle.DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ArrayList");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "lang3", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3.builder", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle17.appendSuper(stringBuffer18, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle17.appendSuper(stringBuffer21, "");
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle17.appendSuper(stringBuffer24, "java.lang");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle17.appendToString(stringBuffer27, "lang");
        java.lang.StringBuffer stringBuffer30 = null;
        toStringStyle17.appendSuper(stringBuffer30, "Integer");
        java.lang.StringBuffer stringBuffer33 = null;
        toStringStyle17.appendSuper(stringBuffer33, "ShortPrefixToStringStyle");
        toStringStyle0.appendStart(stringBuffer16, (java.lang.Object) stringBuffer33);
        java.lang.StringBuffer stringBuffer37 = null;
        char[] charArray43 = new char[] { '$', 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer37, "Float", charArray43, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "$a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "$a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[$, a, 4, #]");
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Integer", 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray13 = new float[] { 1.0f, 1, '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "apache", floatArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[1.0, 1.0, 35.0, 0.0]");
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray17 = new short[] { (byte) 100, (short) 100, (byte) 100, (byte) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "lang3", shortArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[100, 100, 100, 0, 1]");
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "java.lang");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray18 = new short[] { (byte) 0, (short) -1, (short) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Class[]", shortArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[0, -1, 10, 100]");
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "commons", longArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", (long) '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendToString(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "");
        toStringStyle8.appendStart(stringBuffer12, (java.lang.Object) stringBuffer19);
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer24, "Boolean", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Double");
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "hi!", doubleArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0]");
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        double[] doubleArray5 = new double[] { 1, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "util", doubleArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 0.0]");
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "lang");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray14 = new double[] { '.', 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", doubleArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[46.0, 100.0]");
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Long");
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray18 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", longArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Double");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer4, (java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        java.lang.String[] strArray7 = new java.lang.String[] { "lang", "Class[]", "$", "ToStringStyle", "java.util", "Class", "lang" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.List<java.lang.Class<?>> wildcardClassList10 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.Class<?>> wildcardClassList11 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.Class<?>> wildcardClassList12 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        java.util.List<java.lang.Class<?>> wildcardClassList13 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList8);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClassList10);
        org.junit.Assert.assertNotNull(wildcardClassList11);
        org.junit.Assert.assertNotNull(wildcardClassList12);
        org.junit.Assert.assertNotNull(wildcardClassList13);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray20 = new short[] { (short) 100, (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Class[]", shortArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[100, 10, -1, 1, 1, -1]");
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DefaultToStringStyle" + "'", str1, "DefaultToStringStyle");
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Double");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3.builder", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle19, "Byte");
        java.lang.Class<?> wildcardClass22 = toStringStyle19.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle23 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle23, "Byte");
        java.lang.Class<?> wildcardClass26 = toStringStyle23.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass22;
        wildcardClassArray37[1] = wildcardClass26;
        wildcardClassArray37[2] = wildcardClass30;
        wildcardClassArray37[3] = wildcardClass34;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle46 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle46, "Byte");
        java.lang.Class<?> wildcardClass49 = toStringStyle46.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle50 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str52 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle50, "Byte");
        java.lang.Class<?> wildcardClass53 = toStringStyle50.getClass();
        java.lang.Class[] classArray55 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray56 = (java.lang.Class<?>[]) classArray55;
        wildcardClassArray56[0] = wildcardClass49;
        wildcardClassArray56[1] = wildcardClass53;
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray62);
        java.lang.String str65 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray63, "org.apache.commons.lang3.builder");
        java.lang.Class<?>[] wildcardClassArray66 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray66);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray67);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray67);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer18, (java.lang.Object) wildcardClassArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.lang3.builder" + "'", str21, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(toStringStyle23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.lang3.builder" + "'", str25, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(toStringStyle46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.lang3.builder" + "'", str48, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(toStringStyle50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.apache.commons.lang3.builder" + "'", str52, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang" + "'", str65, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle44 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str46 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle44, "Byte");
        java.lang.Class<?> wildcardClass47 = toStringStyle44.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle48 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str50 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle48, "Byte");
        java.lang.Class<?> wildcardClass51 = toStringStyle48.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle52 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str54 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle52, "Byte");
        java.lang.Class<?> wildcardClass55 = toStringStyle52.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle56 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str58 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle56, "Byte");
        java.lang.Class<?> wildcardClass59 = toStringStyle56.getClass();
        java.lang.Class[] classArray61 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        wildcardClassArray62[0] = wildcardClass47;
        wildcardClassArray62[1] = wildcardClass51;
        wildcardClassArray62[2] = wildcardClass55;
        wildcardClassArray62[3] = wildcardClass59;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle71 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str73 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle71, "Byte");
        java.lang.Class<?> wildcardClass74 = toStringStyle71.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle75 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str77 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle75, "Byte");
        java.lang.Class<?> wildcardClass78 = toStringStyle75.getClass();
        java.lang.Class[] classArray80 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray81 = (java.lang.Class<?>[]) classArray80;
        wildcardClassArray81[0] = wildcardClass74;
        wildcardClassArray81[1] = wildcardClass78;
        boolean boolean86 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray62, wildcardClassArray81);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray62, true);
        java.lang.Class<?>[] wildcardClassArray89 = null;
        boolean boolean91 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray89, true);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray92);
        java.lang.String str95 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray93, "util");
        java.lang.Class<?>[] wildcardClassArray96 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray93);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(toStringStyle44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.apache.commons.lang3.builder" + "'", str46, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(toStringStyle48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.apache.commons.lang3.builder" + "'", str50, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(toStringStyle52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "org.apache.commons.lang3.builder" + "'", str54, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(toStringStyle56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "org.apache.commons.lang3.builder" + "'", str58, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(toStringStyle71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "org.apache.commons.lang3.builder" + "'", str73, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(toStringStyle75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "org.apache.commons.lang3.builder" + "'", str77, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Class[]" + "'", str95, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray96);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Boolean");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "java.lang", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray15 = new short[] { (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "NoFieldNameToStringStyle", shortArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 1, 100]");
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "lang3");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Class", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Byte");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "util", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "String", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Double");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "$", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Class");
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray18 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Short", floatArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray12 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Integer", floatArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons.lang3", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Boolean");
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray18 = new boolean[] { true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Class[]", booleanArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, false, false]");
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendToString(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "");
        toStringStyle8.appendStart(stringBuffer12, (java.lang.Object) stringBuffer19);
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle0.appendSuper(stringBuffer24, "java");
        java.lang.StringBuffer stringBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer27, "$", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "builder");
        java.lang.StringBuffer stringBuffer18 = null;
        int[] intArray25 = new int[] { (byte) 0, (-1), 0, 4, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "Integer", intArray25, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, -1, 0, 4, 1]");
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        char[] charArray4 = new char[] { '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "$", charArray4, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[$]");
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "commons");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendSuper(stringBuffer18, "ToStringStyle.DefaultToStringStyle");
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer23 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer26 = null;
        toStringStyle25.appendSuper(stringBuffer26, "java.lang");
        java.lang.StringBuffer stringBuffer29 = null;
        toStringStyle25.appendSuper(stringBuffer29, "java.lang");
        java.lang.Class<?> wildcardClass32 = toStringStyle25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer23, "ToStringStyle.ShortPrefixToStringStyle", (java.lang.Object) toStringStyle25, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str22, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "org.apache", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "lang");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Byte");
        java.lang.StringBuffer stringBuffer22 = null;
        float[] floatArray24 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "", floatArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "lang");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Byte");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "util", (java.lang.Object) 1.0d, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendSuper(stringBuffer9, "java.lang");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle8.appendSuper(stringBuffer12, "java.lang");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle8.appendToString(stringBuffer15, "ToStringStyle");
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer15);
        java.lang.StringBuffer stringBuffer19 = null;
        byte[] byteArray21 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ShortPrefixToStringStyle", byteArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Class", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "Boolean");
        java.lang.StringBuffer stringBuffer18 = null;
        int[] intArray22 = new int[] { 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "Boolean", intArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 52]");
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "$");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "lang3", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "commons");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "java", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        int[] intArray9 = new int[] { '#', (short) 0, 3, (byte) 10, (short) 1, '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "builder", intArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0, 3, 10, 1, 36]");
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray13 = new short[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", shortArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[100]");
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        int[] intArray10 = new int[] { 'a', (short) 10, 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", intArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97, 10, 100, -1]");
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "java.lang");
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray20 = new float[] { 4, '$', 2, 100, (byte) 0, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", floatArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[4.0, 36.0, 2.0, 100.0, 0.0, 35.0]");
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ArrayList");
        java.lang.StringBuffer stringBuffer19 = null;
        char[] charArray23 = new char[] { ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, ".", charArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , a]");
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray14 = new boolean[] { false, true, true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Class", booleanArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, true, true, true, true, false]");
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray10 = new float[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Short", floatArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[100.0]");
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "Double");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Boolean", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "org.apache");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        char[] charArray28 = new char[] { ' ', '#', '$', '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "lang", charArray28, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " #$.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " #$.");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , #, $, .]");
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "$");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray14 = new long[] { (short) 10, 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "builder", longArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[10, 4]");
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray20 = new boolean[] { true, false, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle", booleanArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, false, false, true, false]");
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "org.apache", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        long[] longArray18 = new long[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "java.util", longArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[10]");
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "java.util");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "lang3");
        java.lang.StringBuffer stringBuffer18 = null;
        long[] longArray26 = new long[] { 0, 2, 'a', (byte) 0, '.', 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "ArrayList", longArray26, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[0, 2, 97, 0, 46, 100]");
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray13 = new double[] { (-1), 10.0f, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "builder", doubleArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 1.0, 10.0]");
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "Float");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendToString(stringBuffer19, "Class");
        java.lang.StringBuffer stringBuffer22 = null;
        int[] intArray24 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "builder", intArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray14 = new boolean[] { true, false, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "commons", booleanArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false, false, false, true]");
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Long", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 0, (byte) 10, 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "$", doubleArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0, 2.0]");
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "Double");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendToString(stringBuffer18, "Integer");
        java.lang.StringBuffer stringBuffer21 = null;
        short[] shortArray29 = new short[] { (byte) 1, (short) 0, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "", shortArray29, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[1, 0, 1, -1, -1, -1]");
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "$");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "apache", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "commons");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Boolean", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Character", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray23 = new double[] { (short) -1, 0L, 10L, '#', (byte) 1, '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Character", doubleArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, 10.0, 35.0, 1.0, 46.0]");
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "Short", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Class");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle17, "Byte");
        java.lang.Class<?> wildcardClass20 = toStringStyle17.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle21, "Byte");
        java.lang.Class<?> wildcardClass24 = toStringStyle21.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle25 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str27 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle25, "Byte");
        java.lang.Class<?> wildcardClass28 = toStringStyle25.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle29 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str31 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle29, "Byte");
        java.lang.Class<?> wildcardClass32 = toStringStyle29.getClass();
        java.lang.Class[] classArray34 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass20;
        wildcardClassArray35[1] = wildcardClass24;
        wildcardClassArray35[2] = wildcardClass28;
        wildcardClassArray35[3] = wildcardClass32;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle44 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str46 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle44, "Byte");
        java.lang.Class<?> wildcardClass47 = toStringStyle44.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle48 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str50 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle48, "Byte");
        java.lang.Class<?> wildcardClass51 = toStringStyle48.getClass();
        java.lang.Class[] classArray53 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        wildcardClassArray54[0] = wildcardClass47;
        wildcardClassArray54[1] = wildcardClass51;
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray54);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray63);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer16, (java.lang.Object) wildcardClassArray63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.lang3.builder" + "'", str19, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.lang3.builder" + "'", str23, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(toStringStyle25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org.apache.commons.lang3.builder" + "'", str27, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(toStringStyle29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.lang3.builder" + "'", str31, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(toStringStyle44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.apache.commons.lang3.builder" + "'", str46, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(toStringStyle48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org.apache.commons.lang3.builder" + "'", str50, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "builder");
        java.lang.StringBuffer stringBuffer16 = null;
        int[] intArray18 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons", intArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray18 = new double[] { 100L, 1.0f, 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "commons", doubleArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, 2.0]");
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "String");
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle20, "Byte");
        java.lang.Class<?> wildcardClass23 = toStringStyle20.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str26 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle24, "Byte");
        java.lang.Class<?> wildcardClass27 = toStringStyle24.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle28 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle28, "Byte");
        java.lang.Class<?> wildcardClass31 = toStringStyle28.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle32 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str34 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle32, "Byte");
        java.lang.Class<?> wildcardClass35 = toStringStyle32.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass23;
        wildcardClassArray38[1] = wildcardClass27;
        wildcardClassArray38[2] = wildcardClass31;
        wildcardClassArray38[3] = wildcardClass35;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle47, "Byte");
        java.lang.Class<?> wildcardClass50 = toStringStyle47.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle51, "Byte");
        java.lang.Class<?> wildcardClass54 = toStringStyle51.getClass();
        java.lang.Class[] classArray56 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass50;
        wildcardClassArray57[1] = wildcardClass54;
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray57);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray64 = null;
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray64, true);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "Character", (java.lang.Object[]) wildcardClassArray67, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.lang3.builder" + "'", str22, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.lang3.builder" + "'", str26, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(toStringStyle28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.lang3.builder" + "'", str30, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(toStringStyle32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org.apache.commons.lang3.builder" + "'", str34, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.lang3.builder" + "'", str49, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.lang3.builder" + "'", str53, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray12 = new double[] { 3, 0.0d, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "NoFieldNameToStringStyle", doubleArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[3.0, 0.0, 10.0]");
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray15 = new float[] { 2, (byte) 10, '#', 10.0f, 100L, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "builder", floatArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[2.0, 10.0, 35.0, 10.0, 100.0, 100.0]");
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.Class<?> wildcardClass22 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "Float");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Class[]");
        java.lang.StringBuffer stringBuffer22 = null;
        long[] longArray29 = new long[] { 3, (byte) 100, 10, 10L, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "org", longArray29, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[3, 100, 10, 10, 1]");
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Class", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendToString(stringBuffer18, "Long");
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "Long", "apache");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang" + "'", str22, "java.lang");
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "lang");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Byte");
        java.lang.StringBuffer stringBuffer22 = null;
        short[] shortArray26 = new short[] { (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "MultiLineToStringStyle", shortArray26, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[1, 100]");
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, ".");
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", doubleArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, ".", (float) '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "java.util");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray23 = new double[] { 0.0f, 1.0d, 10.0d, 0.0f, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", doubleArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 10.0, 0.0, 1.0]");
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "lang");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "String", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendToString(stringBuffer18, "Long");
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "org.apache.commons.lang3.builder", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray14 = new float[] { (short) 1, 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class", floatArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[1.0, 4.0]");
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) stringBuffer7, "java.util");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.util" + "'", str11, "java.util");
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle43, "Byte");
        java.lang.Class<?> wildcardClass46 = toStringStyle43.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle47, "Byte");
        java.lang.Class<?> wildcardClass50 = toStringStyle47.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle51, "Byte");
        java.lang.Class<?> wildcardClass54 = toStringStyle51.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle55, "Byte");
        java.lang.Class<?> wildcardClass58 = toStringStyle55.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass46;
        wildcardClassArray61[1] = wildcardClass50;
        wildcardClassArray61[2] = wildcardClass54;
        wildcardClassArray61[3] = wildcardClass58;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str72 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle70, "Byte");
        java.lang.Class<?> wildcardClass73 = toStringStyle70.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle74 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle74, "Byte");
        java.lang.Class<?> wildcardClass77 = toStringStyle74.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass73;
        wildcardClassArray80[1] = wildcardClass77;
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray86, false);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray86);
        java.lang.String str92 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray90, "java.lang");
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray90);
        java.lang.Class<?>[] wildcardClassArray94 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray90);
        java.lang.Class<?>[] wildcardClassArray95 = null;
        boolean boolean97 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray90, wildcardClassArray95, true);
        java.lang.Class<?> wildcardClass98 = wildcardClassArray90.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.lang3.builder" + "'", str45, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.lang3.builder" + "'", str49, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.lang3.builder" + "'", str53, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(toStringStyle55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org.apache.commons.lang3.builder" + "'", str57, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org.apache.commons.lang3.builder" + "'", str72, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(toStringStyle74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.lang3.builder" + "'", str76, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Class[]" + "'", str92, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertNotNull(wildcardClassArray94);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, ".");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Float", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray9 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons", intArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.util");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray22 = new double[] { 2, 2, (short) 10, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Double", doubleArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[2.0, 2.0, 10.0, -1.0]");
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "org.apache.commons.lang3", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray6 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Float", charArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "java.util");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "hi!", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "MultiLineToStringStyle", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ArrayList");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "Short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, ".");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray14 = new long[] { 2, (byte) 10, (byte) 0, 3, 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3", longArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[2, 10, 0, 3, 2]");
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Long");
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray24 = new long[] { 0, 0L, 0, '#', (byte) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3.builder", longArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[0, 0, 0, 35, 1, 35]");
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Double");
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray14 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "MultiLineToStringStyle", floatArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "java.util");
        java.lang.StringBuffer stringBuffer15 = null;
        short[] shortArray18 = new short[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "$", shortArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[100]");
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray15 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", shortArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray18 = new char[] { '.', '#', ' ', 'a', '4', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Short", charArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), ".# a4$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), ".# a4$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[., #,  , a, 4, $]");
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "org.apache.commons");
        java.lang.StringBuffer stringBuffer19 = null;
        short[] shortArray25 = new short[] { (byte) -1, (byte) -1, (short) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "util", shortArray25, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1, -1, 10, 1]");
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray20 = new long[] { 100L, (byte) -1, 2, 0L, '$', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "org.apache.commons", longArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[100, -1, 2, 0, 36, 36]");
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray15 = new double[] { (short) 10, '#', 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org", doubleArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 35.0, 10.0]");
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "Boolean", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "org", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendSuper(stringBuffer9, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle8.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle8.appendSuper(stringBuffer15, "Boolean");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle8.appendToString(stringBuffer18, "builder");
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle8.appendToString(stringBuffer21, "hi!");
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle8.appendToString(stringBuffer24, "ToStringStyle.DefaultToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer7, (java.lang.Object) "ToStringStyle.DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle43, "Byte");
        java.lang.Class<?> wildcardClass46 = toStringStyle43.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle47, "Byte");
        java.lang.Class<?> wildcardClass50 = toStringStyle47.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle51, "Byte");
        java.lang.Class<?> wildcardClass54 = toStringStyle51.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle55, "Byte");
        java.lang.Class<?> wildcardClass58 = toStringStyle55.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass46;
        wildcardClassArray61[1] = wildcardClass50;
        wildcardClassArray61[2] = wildcardClass54;
        wildcardClassArray61[3] = wildcardClass58;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str72 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle70, "Byte");
        java.lang.Class<?> wildcardClass73 = toStringStyle70.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle74 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle74, "Byte");
        java.lang.Class<?> wildcardClass77 = toStringStyle74.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass73;
        wildcardClassArray80[1] = wildcardClass77;
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray86);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray86);
        java.lang.Class<?> wildcardClass89 = wildcardClassArray18.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.lang3.builder" + "'", str45, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.lang3.builder" + "'", str49, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.lang3.builder" + "'", str53, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(toStringStyle55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org.apache.commons.lang3.builder" + "'", str57, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org.apache.commons.lang3.builder" + "'", str72, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(toStringStyle74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.lang3.builder" + "'", str76, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "lang");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Byte");
        java.lang.StringBuffer stringBuffer22 = null;
        boolean[] booleanArray25 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "ToStringStyle.DefaultToStringStyle", booleanArray25, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true]");
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ArrayList", byteArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 100, 100, 1, -1]");
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray44);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle46 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle46, "Byte");
        java.lang.Class<?> wildcardClass49 = toStringStyle46.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle50 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str52 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle50, "Byte");
        java.lang.Class<?> wildcardClass53 = toStringStyle50.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle54 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str56 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle54, "Byte");
        java.lang.Class<?> wildcardClass57 = toStringStyle54.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle58 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str60 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle58, "Byte");
        java.lang.Class<?> wildcardClass61 = toStringStyle58.getClass();
        java.lang.Class[] classArray63 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray64 = (java.lang.Class<?>[]) classArray63;
        wildcardClassArray64[0] = wildcardClass49;
        wildcardClassArray64[1] = wildcardClass53;
        wildcardClassArray64[2] = wildcardClass57;
        wildcardClassArray64[3] = wildcardClass61;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle73 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str75 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle73, "Byte");
        java.lang.Class<?> wildcardClass76 = toStringStyle73.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle77 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str79 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle77, "Byte");
        java.lang.Class<?> wildcardClass80 = toStringStyle77.getClass();
        java.lang.Class[] classArray82 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray83 = (java.lang.Class<?>[]) classArray82;
        wildcardClassArray83[0] = wildcardClass76;
        wildcardClassArray83[1] = wildcardClass80;
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray83);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray89);
        java.lang.String str92 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray90, "org.apache.commons.lang3.builder");
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray90);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray90);
        java.lang.String str96 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray90, "commons");
        java.lang.Class<?>[] wildcardClassArray97 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray90);
        java.lang.Class<?>[] wildcardClassArray98 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray90);
        java.lang.Class<?>[] wildcardClassArray99 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray98);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(toStringStyle46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.lang3.builder" + "'", str48, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(toStringStyle50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.apache.commons.lang3.builder" + "'", str52, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(toStringStyle54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "org.apache.commons.lang3.builder" + "'", str56, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(toStringStyle58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "org.apache.commons.lang3.builder" + "'", str60, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(toStringStyle73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "org.apache.commons.lang3.builder" + "'", str75, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(toStringStyle77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "org.apache.commons.lang3.builder" + "'", str79, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(classArray82);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "java.lang" + "'", str92, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Class[]" + "'", str96, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClassArray97);
        org.junit.Assert.assertNotNull(wildcardClassArray98);
        org.junit.Assert.assertNotNull(wildcardClassArray99);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Integer", charArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Boolean", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "Boolean", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle16, "Byte");
        java.lang.Class<?> wildcardClass19 = toStringStyle16.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle20, "Byte");
        java.lang.Class<?> wildcardClass23 = toStringStyle20.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle24 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str26 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle24, "Byte");
        java.lang.Class<?> wildcardClass27 = toStringStyle24.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass15;
        wildcardClassArray30[1] = wildcardClass19;
        wildcardClassArray30[2] = wildcardClass23;
        wildcardClassArray30[3] = wildcardClass27;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle39 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str41 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle39, "Byte");
        java.lang.Class<?> wildcardClass42 = toStringStyle39.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle43, "Byte");
        java.lang.Class<?> wildcardClass46 = toStringStyle43.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        wildcardClassArray49[0] = wildcardClass42;
        wildcardClassArray49[1] = wildcardClass46;
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray55);
        java.lang.String str58 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray56, "org.apache.commons.lang3.builder");
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle", (java.lang.Object[]) wildcardClassArray61, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.lang3.builder" + "'", str18, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.lang3.builder" + "'", str22, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(toStringStyle24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.lang3.builder" + "'", str26, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(toStringStyle39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.apache.commons.lang3.builder" + "'", str41, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.lang3.builder" + "'", str45, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "java.lang" + "'", str58, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray18 = new float[] { 0.0f, (short) -1, 100.0f, (-1.0f), 1L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", floatArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, -1.0, 100.0, -1.0, 1.0, 10.0]");
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "String", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Integer");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray18 = new double[] { 2, '#', 100.0f, 2, '#', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ".", doubleArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[2.0, 35.0, 100.0, 2.0, 35.0, 10.0]");
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Character", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray15 = new double[] { (-1), (byte) 0, 1.0f, 100L, 100, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class[]", doubleArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 1.0, 100.0, 100.0, 100.0]");
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Integer");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Boolean", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle5, "Byte");
        java.lang.StringBuffer stringBuffer8 = null;
        toStringStyle5.appendSuper(stringBuffer8, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer11 = null;
        toStringStyle5.appendSuper(stringBuffer11, "");
        toStringStyle0.appendStart(stringBuffer4, (java.lang.Object) stringBuffer11);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "String", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        double[] doubleArray7 = new double[] { 1L, 0L, (-1L), '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "DefaultToStringStyle", doubleArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 0.0, -1.0, 52.0]");
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) '$', "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "org.apache.commons.lang3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3" + "'", str2, "org.apache.commons.lang3");
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray16 = new float[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "java", floatArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0]");
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "java.lang");
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.Class<?>[] wildcardClassArray14 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle15 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle15, "Byte");
        java.lang.Class<?> wildcardClass18 = toStringStyle15.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str21 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle19, "Byte");
        java.lang.Class<?> wildcardClass22 = toStringStyle19.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle23 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str25 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle23, "Byte");
        java.lang.Class<?> wildcardClass26 = toStringStyle23.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        java.lang.Class[] classArray32 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass18;
        wildcardClassArray33[1] = wildcardClass22;
        wildcardClassArray33[2] = wildcardClass26;
        wildcardClassArray33[3] = wildcardClass30;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle42 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str44 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle42, "Byte");
        java.lang.Class<?> wildcardClass45 = toStringStyle42.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle46 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str48 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle46, "Byte");
        java.lang.Class<?> wildcardClass49 = toStringStyle46.getClass();
        java.lang.Class[] classArray51 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray52 = (java.lang.Class<?>[]) classArray51;
        wildcardClassArray52[0] = wildcardClass45;
        wildcardClassArray52[1] = wildcardClass49;
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray33);
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray59);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", (java.lang.Object[]) wildcardClassArray59, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(toStringStyle15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache.commons.lang3.builder" + "'", str17, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.lang3.builder" + "'", str21, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(toStringStyle23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org.apache.commons.lang3.builder" + "'", str25, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(toStringStyle42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "org.apache.commons.lang3.builder" + "'", str44, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(toStringStyle46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.lang3.builder" + "'", str48, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Byte", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "lang3");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Double", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray16 = new int[] { '4', 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "hi!", intArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[52, 4]");
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "apache", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "lang3", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "org.apache.commons.lang3.builder", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Double");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Class[]", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Double");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "org", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        short[] shortArray3 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "commons", shortArray3, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "Boolean");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "org.apache.commons.lang3", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer18 = null;
        float[] floatArray26 = new float[] { (short) 100, (-1L), (byte) 100, (short) 100, (-1), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "NoFieldNameToStringStyle", floatArray26, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[100.0, -1.0, 100.0, 100.0, -1.0, -1.0]");
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray21 = new float[] { (byte) 10, (short) -1, 1.0f, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "commons", floatArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0, 1.0, 0.0]");
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "", byteArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray18 = new boolean[] { true, true, true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Byte", booleanArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, true, true, false, false]");
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer19, (java.lang.Object) "Float");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Class[]");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray16 = new char[] { '#', '.', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class", charArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#. a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#. a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, .,  , a]");
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "org.apache.commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org/apache/commons");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "Double");
        java.lang.StringBuffer stringBuffer19 = null;
        short[] shortArray27 = new short[] { (short) 0, (byte) 10, (short) 10, (short) 1, (short) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "NoFieldNameToStringStyle", shortArray27, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 10, 10, 1, 10, 0]");
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", byteArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 0, 100, 10]");
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "java.util");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "lang3");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "Long", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray18 = new long[] { ' ', 1, 0L, 'a', (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "$", longArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[32, 1, 0, 97, -1, 1]");
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        short[] shortArray5 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "commons", shortArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[]");
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Integer");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray16 = new double[] { (short) 10, 1.0f, '#', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", doubleArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 1.0, 35.0, 0.0]");
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class[]", (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray7 = new short[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "MultiLineToStringStyle", shortArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10]");
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Boolean");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray12 = new short[] { (short) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java", shortArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[1, 100, -1]");
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Class[]");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray16 = new short[] { (byte) 10, (byte) -1, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.lang", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[10, -1, 100, 0]");
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray18 = new char[] { '#', '4', '4', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "apache", charArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#44$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#44$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, 4, 4, $]");
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray16 = new int[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "util", intArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendSuper(stringBuffer9, "java.lang");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle8.appendSuper(stringBuffer12, "java.lang");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle8.appendToString(stringBuffer15, "ToStringStyle");
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer15);
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendToString(stringBuffer19, "");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendToString(stringBuffer22, "lang3");
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "Byte", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray15 = new long[] { (byte) 1, 2, 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ".", longArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[1, 2, 2]");
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Long", (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Double", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "builder");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "apache", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray16 = new char[] { ' ', '4', '.', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", charArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4.#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4.#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, ., #, a]");
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray15 = new short[] { (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Float", shortArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1, 10, 100]");
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray18 = new long[] { 0, 10L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "String", longArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[0, 10, 100]");
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray18 = new double[] { (-1.0f), 'a', 'a', 0, 100L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", doubleArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 97.0, 0.0, 100.0, 10.0]");
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendToString(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "");
        toStringStyle8.appendStart(stringBuffer12, (java.lang.Object) stringBuffer19);
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle0.appendSuper(stringBuffer24, "java");
        java.lang.StringBuffer stringBuffer27 = null;
        double[] doubleArray34 = new double[] { (byte) 10, '$', '#', 10.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer27, "", doubleArray34, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 36.0, 35.0, 10.0, 10.0]");
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Boolean", shortArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Double", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "");
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray11 = new short[] { (byte) 0, (byte) 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle.NoFieldNameToStringStyle", shortArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 100, 100]");
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray12 = new double[] { 4, (short) -1, (byte) -1, (-1.0d), 10.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "$", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[4.0, -1.0, -1.0, -1.0, 10.0, 100.0]");
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        int[] intArray23 = new int[] { 0, ' ', 10, (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "java.lang", intArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 32, 10, 1, 0]");
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "commons");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendSuper(stringBuffer18, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer21 = null;
        float[] floatArray27 = new float[] { (-1.0f), 10.0f, 100.0f, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "MultiLineToStringStyle", floatArray27, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0, 10.0, 100.0, 100.0]");
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray10 = new float[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Long", floatArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[-1.0]");
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.util");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray24 = new float[] { (byte) 0, (-1.0f), '4', 1L, 100L, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Byte", floatArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[0.0, -1.0, 52.0, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        char[] charArray23 = new char[] { '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle.MultiLineToStringStyle", charArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#,  ]");
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "$", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Double", (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        short[] shortArray23 = new short[] { (byte) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "builder", shortArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 100]");
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", floatArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "Integer", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "hi!", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "util", (int) '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendToString(stringBuffer18, "Long");
        java.lang.StringBuffer stringBuffer21 = null;
        boolean[] booleanArray26 = new boolean[] { false, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "ToStringStyle.ShortPrefixToStringStyle", booleanArray26, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, true, true]");
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray17 = new boolean[] { false, false, false, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.MultiLineToStringStyle", booleanArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, true, false, false]");
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "apache");
        java.lang.StringBuffer stringBuffer19 = null;
        int[] intArray23 = new int[] { 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "Boolean", intArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 97]");
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Double");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "Float");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Class[]");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendSuper(stringBuffer22, "Byte");
        java.lang.StringBuffer stringBuffer25 = null;
        char[] charArray31 = new char[] { ' ', '#', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "", charArray31, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " ##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " ##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , #, #, a]");
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Float", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "Boolean");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "lang", (float) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.util");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray22 = new double[] { 2, 100L, 10.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", doubleArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[2.0, 100.0, 10.0, -1.0]");
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        char[] charArray3 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ShortPrefixToStringStyle", charArray3, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", byteArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 10, 100, 0, 10, 0]");
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, ".");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray14 = new double[] { 10.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class[]", doubleArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 1.0]");
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "commons");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray16 = new float[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Boolean", floatArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[1.0]");
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "util");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class[]", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendToString(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "");
        toStringStyle8.appendStart(stringBuffer12, (java.lang.Object) stringBuffer19);
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle0.appendSuper(stringBuffer24, "java");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle0.appendToString(stringBuffer27, "java.util");
        java.lang.StringBuffer stringBuffer30 = null;
        java.lang.Class<?>[] wildcardClassArray32 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle33, "Byte");
        java.lang.Class<?> wildcardClass36 = toStringStyle33.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle37 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str39 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle37, "Byte");
        java.lang.Class<?> wildcardClass40 = toStringStyle37.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle41 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str43 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle41, "Byte");
        java.lang.Class<?> wildcardClass44 = toStringStyle41.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle45 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str47 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle45, "Byte");
        java.lang.Class<?> wildcardClass48 = toStringStyle45.getClass();
        java.lang.Class[] classArray50 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        wildcardClassArray51[0] = wildcardClass36;
        wildcardClassArray51[1] = wildcardClass40;
        wildcardClassArray51[2] = wildcardClass44;
        wildcardClassArray51[3] = wildcardClass48;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle60 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str62 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle60, "Byte");
        java.lang.Class<?> wildcardClass63 = toStringStyle60.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle64 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle64, "Byte");
        java.lang.Class<?> wildcardClass67 = toStringStyle64.getClass();
        java.lang.Class[] classArray69 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        wildcardClassArray70[0] = wildcardClass63;
        wildcardClassArray70[1] = wildcardClass67;
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray51, wildcardClassArray70);
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray51);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray32, wildcardClassArray51);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer30, "DefaultToStringStyle", (java.lang.Object[]) wildcardClassArray51, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(toStringStyle33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.lang3.builder" + "'", str35, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(toStringStyle37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.lang3.builder" + "'", str39, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(toStringStyle41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org.apache.commons.lang3.builder" + "'", str43, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(toStringStyle45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org.apache.commons.lang3.builder" + "'", str47, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(toStringStyle60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "org.apache.commons.lang3.builder" + "'", str62, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(toStringStyle64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "org.apache.commons.lang3.builder" + "'", str66, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendSuper(stringBuffer9, "java.lang");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle8.appendSuper(stringBuffer12, "java.lang");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle8.appendToString(stringBuffer15, "ToStringStyle");
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer15);
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendToString(stringBuffer19, "");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendToString(stringBuffer22, "lang3");
        java.lang.StringBuffer stringBuffer25 = null;
        double[] doubleArray31 = new double[] { 'a', 2, (short) 0, 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "ShortPrefixToStringStyle", doubleArray31, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 2.0, 0.0, 0.0]");
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.util");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Double", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "util");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "lang", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ShortPrefixToStringStyle", byteArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 10]");
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache.commons", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray44 = null;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray44, true);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?> wildcardClass48 = wildcardClassArray47.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        boolean[] booleanArray19 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "builder", booleanArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false]");
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.ShortPrefixToStringStyle", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        float[] floatArray11 = new float[] { (byte) -1, 1L, 1L, '$', ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "apache", floatArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, 1.0, 1.0, 36.0, 32.0, 1.0]");
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "String", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        float[] floatArray10 = new float[] { (byte) 100, 4, (byte) 1, (-1.0f), 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "MultiLineToStringStyle", floatArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[100.0, 4.0, 1.0, -1.0, 97.0]");
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "hi!", (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Integer");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "commons", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray16 = new int[] { (short) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Class[]", intArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97]");
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray43);
        java.lang.String str46 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray44, "org.apache.commons.lang3.builder");
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray44);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang" + "'", str46, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "org.apache");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "builder", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "org.apache.commons.lang3", (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class[]");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray15 = new long[] { 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Short", longArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[4]");
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ArrayList", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray20 = new boolean[] { true, true, true, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "hi!", booleanArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[true, true, true, false, false, false]");
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "Character");
        java.lang.StringBuffer stringBuffer18 = null;
        boolean[] booleanArray24 = new boolean[] { false, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "Float", booleanArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, false, false]");
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "commons");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Character", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache.commons.lang3", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons.lang3");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", byteArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 10, 100]");
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray19 = new boolean[] { true, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "java.util", booleanArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, true, true]");
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray19 = new float[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "$", floatArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[52.0]");
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "java.util", (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "commons", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "apache", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "$");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.util", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Boolean");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray18 = new int[] { (byte) 1, 4, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Integer", intArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 4, -1]");
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendSuper(stringBuffer9, "lang");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle8.appendSuper(stringBuffer12, "");
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "ArrayList");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "org.apache.commons.lang3.builder", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray11 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.NoFieldNameToStringStyle", charArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray13 = new char[] { ' ', 'a', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "$", charArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , a, a,  ]");
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "java", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "$", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.lang", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.Class<?> wildcardClass3 = toStringStyle0.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle4 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str6 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle4, "Byte");
        java.lang.Class<?> wildcardClass7 = toStringStyle4.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass3;
        wildcardClassArray18[1] = wildcardClass7;
        wildcardClassArray18[2] = wildcardClass11;
        wildcardClassArray18[3] = wildcardClass15;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle27 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle27, "Byte");
        java.lang.Class<?> wildcardClass30 = toStringStyle27.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle31 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle31, "Byte");
        java.lang.Class<?> wildcardClass34 = toStringStyle31.getClass();
        java.lang.Class[] classArray36 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray37 = (java.lang.Class<?>[]) classArray36;
        wildcardClassArray37[0] = wildcardClass30;
        wildcardClassArray37[1] = wildcardClass34;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray37);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle43 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str45 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle43, "Byte");
        java.lang.Class<?> wildcardClass46 = toStringStyle43.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle47, "Byte");
        java.lang.Class<?> wildcardClass50 = toStringStyle47.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle51 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str53 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle51, "Byte");
        java.lang.Class<?> wildcardClass54 = toStringStyle51.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle55 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle55, "Byte");
        java.lang.Class<?> wildcardClass58 = toStringStyle55.getClass();
        java.lang.Class[] classArray60 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        wildcardClassArray61[0] = wildcardClass46;
        wildcardClassArray61[1] = wildcardClass50;
        wildcardClassArray61[2] = wildcardClass54;
        wildcardClassArray61[3] = wildcardClass58;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle70 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str72 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle70, "Byte");
        java.lang.Class<?> wildcardClass73 = toStringStyle70.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle74 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str76 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle74, "Byte");
        java.lang.Class<?> wildcardClass77 = toStringStyle74.getClass();
        java.lang.Class[] classArray79 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray80 = (java.lang.Class<?>[]) classArray79;
        wildcardClassArray80[0] = wildcardClass73;
        wildcardClassArray80[1] = wildcardClass77;
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray61);
        boolean boolean88 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray86, false);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray89);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray90);
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(toStringStyle4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.lang3.builder" + "'", str6, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(toStringStyle27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.lang3.builder" + "'", str29, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(toStringStyle31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.lang3.builder" + "'", str33, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(toStringStyle43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.lang3.builder" + "'", str45, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(toStringStyle47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "org.apache.commons.lang3.builder" + "'", str49, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(toStringStyle51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "org.apache.commons.lang3.builder" + "'", str53, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(toStringStyle55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org.apache.commons.lang3.builder" + "'", str57, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(toStringStyle70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "org.apache.commons.lang3.builder" + "'", str72, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(toStringStyle74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.apache.commons.lang3.builder" + "'", str76, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(classArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ArrayList");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendToString(stringBuffer22, "lang3");
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "", (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray17 = new char[] { 'a', '4', '$', '4', '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Float", charArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a4$4.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a4$4.");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, 4, $, 4, .]");
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "Double");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendToString(stringBuffer18, "Integer");
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "org", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "hi!", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class[]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle9 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle9, "Byte");
        java.lang.Class<?> wildcardClass12 = toStringStyle9.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.Class<?> wildcardClass16 = toStringStyle13.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle17, "Byte");
        java.lang.Class<?> wildcardClass20 = toStringStyle17.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle21 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str23 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle21, "Byte");
        java.lang.Class<?> wildcardClass24 = toStringStyle21.getClass();
        java.lang.Class[] classArray26 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        wildcardClassArray27[0] = wildcardClass12;
        wildcardClassArray27[1] = wildcardClass16;
        wildcardClassArray27[2] = wildcardClass20;
        wildcardClassArray27[3] = wildcardClass24;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle36 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str38 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle36, "Byte");
        java.lang.Class<?> wildcardClass39 = toStringStyle36.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle40 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str42 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle40, "Byte");
        java.lang.Class<?> wildcardClass43 = toStringStyle40.getClass();
        java.lang.Class[] classArray45 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        wildcardClassArray46[0] = wildcardClass39;
        wildcardClassArray46[1] = wildcardClass43;
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle53 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str55 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle53, "Byte");
        java.lang.Class<?> wildcardClass56 = toStringStyle53.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle57 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle57, "Byte");
        java.lang.Class<?> wildcardClass60 = toStringStyle57.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle61 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str63 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle61, "Byte");
        java.lang.Class<?> wildcardClass64 = toStringStyle61.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle65 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str67 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle65, "Byte");
        java.lang.Class<?> wildcardClass68 = toStringStyle65.getClass();
        java.lang.Class[] classArray70 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray71 = (java.lang.Class<?>[]) classArray70;
        wildcardClassArray71[0] = wildcardClass56;
        wildcardClassArray71[1] = wildcardClass60;
        wildcardClassArray71[2] = wildcardClass64;
        wildcardClassArray71[3] = wildcardClass68;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle80 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str82 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle80, "Byte");
        java.lang.Class<?> wildcardClass83 = toStringStyle80.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle84 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str86 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle84, "Byte");
        java.lang.Class<?> wildcardClass87 = toStringStyle84.getClass();
        java.lang.Class[] classArray89 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray90 = (java.lang.Class<?>[]) classArray89;
        wildcardClassArray90[0] = wildcardClass83;
        wildcardClassArray90[1] = wildcardClass87;
        boolean boolean95 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray71, wildcardClassArray90);
        boolean boolean97 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray71, true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "$", (java.lang.Object[]) wildcardClassArray27, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.lang3.builder" + "'", str19, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(toStringStyle21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.lang3.builder" + "'", str23, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(toStringStyle36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org.apache.commons.lang3.builder" + "'", str38, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(toStringStyle40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.apache.commons.lang3.builder" + "'", str42, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(toStringStyle53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org.apache.commons.lang3.builder" + "'", str55, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(toStringStyle57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "org.apache.commons.lang3.builder" + "'", str59, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(toStringStyle61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "org.apache.commons.lang3.builder" + "'", str63, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(toStringStyle65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "org.apache.commons.lang3.builder" + "'", str67, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(classArray70);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
        org.junit.Assert.assertNotNull(toStringStyle80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "org.apache.commons.lang3.builder" + "'", str82, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(toStringStyle84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "org.apache.commons.lang3.builder" + "'", str86, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(classArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "builder");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "Byte", (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str14, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "builder");
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray24 = new float[] { '4', 1L, (byte) 0, (byte) 1, 0L, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org", floatArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[52.0, 1.0, 0.0, 1.0, 0.0, 35.0]");
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "$", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "Class[]", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Character", (int) '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        double[] doubleArray28 = new double[] { 1, (-1), 4, '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "org.apache", doubleArray28, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, 4.0, 46.0]");
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray17 = new int[] { 4, 'a', (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", intArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[4, 97, -1, -1, 0]");
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", doubleArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "java.util", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle17 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer18 = null;
        java.lang.Object obj19 = null;
        toStringStyle17.appendStart(stringBuffer18, obj19);
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle17.appendToString(stringBuffer21, "String");
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle17.appendSuper(stringBuffer24, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle17.appendToString(stringBuffer27, "java");
        java.lang.StringBuffer stringBuffer30 = null;
        toStringStyle17.appendToString(stringBuffer30, "ToStringStyle.ShortPrefixToStringStyle");
        toStringStyle0.appendStart(stringBuffer16, (java.lang.Object) stringBuffer30);
        java.lang.StringBuffer stringBuffer34 = null;
        long[] longArray41 = new long[] { (short) -1, (-1L), 100, '$', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer34, "Short", longArray41, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle17);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[-1, -1, 100, 36, 10]");
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendToString(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle13, "Byte");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle13.appendSuper(stringBuffer16, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle13.appendSuper(stringBuffer19, "");
        toStringStyle8.appendStart(stringBuffer12, (java.lang.Object) stringBuffer19);
        toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) stringBuffer12);
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle0.appendSuper(stringBuffer24, "java");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle0.appendToString(stringBuffer27, "java.util");
        java.lang.StringBuffer stringBuffer30 = null;
        toStringStyle0.appendSuper(stringBuffer30, "Double");
        java.lang.StringBuffer stringBuffer33 = null;
        short[] shortArray36 = new short[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer33, "MultiLineToStringStyle", shortArray36, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[10]");
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons", byteArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "java.lang");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.ShortPrefixToStringStyle", (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "Float");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Class[]");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendSuper(stringBuffer22, "Byte");
        java.lang.StringBuffer stringBuffer25 = null;
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "ShortPrefixToStringStyle", byteArray31, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 10, 0, 0]");
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray11 = new short[] { (byte) 100, (byte) -1, (short) -1, (short) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Float", shortArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[100, -1, -1, 10, 100]");
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "lang3", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray19 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "commons", charArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ ]");
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray11 = new char[] { '.', 'a', 'a', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Byte", charArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), ".aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), ".aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[., a, a, #, #]");
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray8 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ShortPrefixToStringStyle", floatArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Float");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "commons");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "hi!");
        java.lang.StringBuffer stringBuffer19 = null;
        boolean[] booleanArray25 = new boolean[] { false, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ArrayList", booleanArray25, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, true, false]");
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer10, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "String");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendToString(stringBuffer18, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer21 = null;
        boolean[] booleanArray28 = new boolean[] { false, true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "Float", booleanArray28, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, true, true, false, false]");
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DefaultToStringStyle" + "'", str2, "DefaultToStringStyle");
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray23 = new long[] { (byte) 1, 3, 10L, (short) 10, 3 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "lang", longArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[1, 3, 10, 10, 3]");
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Character");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "org.apache");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "org.apache.commons", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.util");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "$", (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Boolean");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray19 = new float[] { (short) 10, ' ', (-1L), '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "DefaultToStringStyle", floatArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0, 32.0, -1.0, 36.0]");
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "Float");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "Class[]");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendSuper(stringBuffer22, "Byte");
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "ToStringStyle.DefaultToStringStyle", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle11 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle11.appendSuper(stringBuffer12, "java.lang");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle11.appendSuper(stringBuffer15, "java.lang");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer10, (java.lang.Object) "java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle11);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "$");
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray15 = new char[] { '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", charArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[$]");
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray12 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "util", shortArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[]");
    }
}

