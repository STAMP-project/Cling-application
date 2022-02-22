import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Float");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "MultiLineToStringStyle", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle", (java.lang.Object) 1.0f, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
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
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray63);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer16, (java.lang.Object) wildcardClassArray64);
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
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        short[] shortArray5 = new short[] { (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ArrayList", shortArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[1, -1]");
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
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
        byte[] byteArray21 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "String", byteArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
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
            toStringStyle0.append(stringBuffer12, "Byte", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons", (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray12 = new long[] { (short) 0, '$', 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", longArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[0, 36, 100]");
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray14 = new char[] { '$', ' ', '4', 'a', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class", charArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "$ 4a$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "$ 4a$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[$,  , 4, a, $]");
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray10 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", byteArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10]");
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        boolean[] booleanArray9 = new boolean[] { false, false, false, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "util", booleanArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, false, false, false]");
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("DefaultToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Long", (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "String" + "'", str1, "String");
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("String", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: String");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Byte", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
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
        char[] charArray16 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "util", charArray16, (java.lang.Boolean) true);
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
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray11 = new double[] { ' ', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons", doubleArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 100.0]");
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray14 = new long[] { 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", longArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, 1]");
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
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
            toStringStyle0.append(stringBuffer19, "ToStringStyle.DefaultToStringStyle", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle" + "'", str1, "ToStringStyle");
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "DefaultToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray12 = new char[] { '#', '4', 'a', 'a', '.', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "$", charArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4aa.a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4aa.a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a, a, ., a]");
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.Class<?> wildcardClass6 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray11 = new short[] { (short) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java.lang", shortArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, -1]");
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
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
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray66);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray91);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray92, false);
        java.lang.String str96 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) false, "Character");
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
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "java.lang" + "'", str96, "java.lang");
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray14 = new boolean[] { false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "commons", booleanArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, true]");
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.lang", 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
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
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "commons", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
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
            toStringStyle0.append(stringBuffer15, "Double", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray16 = new short[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 1, -1, 10]");
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
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
            toStringStyle0.append(stringBuffer10, "Character", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) stringBuffer4, "");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "MultiLineToStringStyle", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
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
        short[] shortArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "lang3", shortArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "java.util");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.DefaultToStringStyle", charArray9, (java.lang.Boolean) false);
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
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray18 = new int[] { (byte) 100, (short) 0, '4', 1, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "$", intArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 0, 52, 1, 1, 100]");
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray12 = new double[] { 'a', (short) 1, (byte) 0, 'a', (short) 100, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 1.0, 0.0, 97.0, 100.0, 10.0]");
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Long", doubleArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
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
        short[] shortArray32 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer30, "java.util", shortArray32, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[]");
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
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
        double[] doubleArray29 = new double[] { (short) 100, (short) 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer24, "Float", doubleArray29, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 10.0, 10.0]");
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
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
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache.commons", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray15 = new double[] { 2, 1.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", doubleArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[2.0, 1.0, -1.0]");
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray15 = new long[] { (short) 0, (short) 10, (-1L), (short) 1, '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ShortPrefixToStringStyle", longArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[0, 10, -1, 1, 35, 32]");
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle5.appendSuper(stringBuffer6, "lang");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer4, (java.lang.Object) toStringStyle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Character", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ArrayList", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        double[] doubleArray7 = new double[] { 1.0f, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "Byte", doubleArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 97.0]");
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray15 = new long[] { 4, 4, 1L, (short) -1, '.', 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Long", longArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[4, 4, 1, -1, 46, 100]");
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray16 = new long[] { 'a', (byte) -1, (byte) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ShortPrefixToStringStyle", longArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, -1, 1, 100]");
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ShortPrefixToStringStyle" + "'", str1, "ShortPrefixToStringStyle");
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
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
        short[] shortArray22 = new short[] { (short) 10, (short) 100, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3.builder", shortArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[10, 100, -1, 100]");
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
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
        float[] floatArray20 = new float[] { 1.0f, 10, 10, (short) 0, 0L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.ShortPrefixToStringStyle", floatArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[1.0, 10.0, 10.0, 0.0, 0.0, 1.0]");
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray13 = new char[] { '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", charArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), ".");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), ".");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[.]");
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Class[]", byteArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0]");
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.DefaultToStringStyle", doubleArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer8 = null;
        short[] shortArray10 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "Character", shortArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[]");
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
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
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "commons", (java.lang.Object[]) wildcardClassArray49, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
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
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray11 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", byteArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MultiLineToStringStyle" + "'", str1, "MultiLineToStringStyle");
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
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
        java.lang.Class<?> wildcardClass91 = wildcardClassArray90.getClass();
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
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, ".");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "$", intArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
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
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3.builder", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) 3, "Float");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
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
            toStringStyle0.append(stringBuffer13, "lang", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "builder", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
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
            toStringStyle0.append(stringBuffer10, "ArrayList", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "Class[]", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ToStringStyle.ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ShortPrefixToStringStyle" + "'", str1, "ShortPrefixToStringStyle");
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray17 = new short[] { (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, ".", shortArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[10, 1, 0]");
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
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
        char[] charArray15 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Character", charArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray18 = new double[] { (-1L), 'a', '4', (byte) 100, (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "commons", doubleArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 97.0, 52.0, 100.0, 10.0, 100.0]");
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle8, "Byte");
        java.lang.Class<?> wildcardClass11 = toStringStyle8.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str14 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle12, "Byte");
        java.lang.Class<?> wildcardClass15 = toStringStyle12.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str18 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle16, "Byte");
        java.lang.Class<?> wildcardClass19 = toStringStyle16.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle20, "Byte");
        java.lang.Class<?> wildcardClass23 = toStringStyle20.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        wildcardClassArray26[0] = wildcardClass11;
        wildcardClassArray26[1] = wildcardClass15;
        wildcardClassArray26[2] = wildcardClass19;
        wildcardClassArray26[3] = wildcardClass23;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle35 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str37 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle35, "Byte");
        java.lang.Class<?> wildcardClass38 = toStringStyle35.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle39 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str41 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle39, "Byte");
        java.lang.Class<?> wildcardClass42 = toStringStyle39.getClass();
        java.lang.Class[] classArray44 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        wildcardClassArray45[0] = wildcardClass38;
        wildcardClassArray45[1] = wildcardClass42;
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray51);
        java.lang.String str54 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray52, "org.apache.commons.lang3.builder");
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer7, (java.lang.Object) wildcardClassArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.lang3.builder" + "'", str10, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.lang3.builder" + "'", str14, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(toStringStyle16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.lang3.builder" + "'", str18, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(toStringStyle20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.lang3.builder" + "'", str22, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(toStringStyle35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org.apache.commons.lang3.builder" + "'", str37, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(toStringStyle39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.apache.commons.lang3.builder" + "'", str41, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.lang" + "'", str54, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "Integer", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray12 = new float[] { 100.0f, 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", floatArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[100.0, 10.0, 0.0]");
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "");
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray13 = new long[] { (byte) 100, 4, (-1L), 1L, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "lang3", longArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[100, 4, -1, 1, 1]");
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "Float", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList", (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Double");
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray8 = new float[] { (byte) -1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.NoFieldNameToStringStyle", floatArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0]");
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray11 = new double[] { 1L, 1.0f, 0.0f, ' ', 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons", doubleArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 0.0, 32.0, 1.0]");
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java", charArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Double", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "Integer", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("lang3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
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
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer30, "lang3", byteArray34, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10, 100]");
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray14 = new float[] { (byte) 100, 100.0f, '#', (byte) 100, 3, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Boolean", floatArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[100.0, 100.0, 35.0, 100.0, 3.0, 35.0]");
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3.builder", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
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
            toStringStyle0.append(stringBuffer10, "", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java.util", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Class", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
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
        float[] floatArray18 = new float[] { (short) 0, 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", floatArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 10.0, 0.0]");
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        java.lang.String[] strArray2 = new java.lang.String[] { "$", "$" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList3);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strList3, "$");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "$", "Long");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClassList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.util" + "'", str7, "java.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "String" + "'", str9, "String");
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
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
            toStringStyle0.append(stringBuffer15, "Double", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
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
        short[] shortArray16 = new short[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[100]");
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
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
        char[] charArray17 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Float", charArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a]");
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
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
            toStringStyle0.append(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
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
        boolean[] booleanArray23 = new boolean[] { false, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.ShortPrefixToStringStyle", booleanArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, false, false, true]");
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "org.apache.commons.lang3.builder", (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray14 = new double[] { '4', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", doubleArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, 0.0]");
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
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
            toStringStyle0.append(stringBuffer16, "lang3", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("lang3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
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
        java.lang.String str31 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) stringBuffer27, "java.lang");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang" + "'", str31, "java.lang");
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
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
        int[] intArray23 = new int[] { 4, (short) 0, '$', '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Boolean", intArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[4, 0, 36, 35, 0]");
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray12 = new float[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "org.apache.commons.lang3.builder", floatArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[35.0]");
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray15 = new boolean[] { true, true, false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class[]", booleanArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, true, false, true, true, true]");
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ShortPrefixToStringStyle" + "'", str1, "ShortPrefixToStringStyle");
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("DefaultToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DefaultToStringStyle" + "'", str1, "DefaultToStringStyle");
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray14 = new char[] { '#', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ShortPrefixToStringStyle", charArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, $]");
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
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
        double[] doubleArray21 = new double[] { 1.0d, ' ', '4', 10.0f, 3, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Class[]", doubleArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 32.0, 52.0, 10.0, 3.0, 1.0]");
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray7 = new float[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons", floatArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[0.0]");
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Double", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Double");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
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
            toStringStyle0.append(stringBuffer13, "Integer", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("lang3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang3" + "'", str1, "lang3");
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("org.apache.commons");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "commons" + "'", str1, "commons");
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray15 = new double[] { 10L, (short) 1, (short) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ShortPrefixToStringStyle", doubleArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "util", doubleArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "builder", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "Float", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
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
            toStringStyle0.append(stringBuffer10, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
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
            toStringStyle0.append(stringBuffer13, "java.lang", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray16 = new long[] { (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.ShortPrefixToStringStyle", longArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, 97]");
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
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
            toStringStyle0.append(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, ".", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        float[] floatArray6 = new float[] { (short) 0, '4', 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "Float", floatArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 52.0, 4.0]");
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
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
        short[] shortArray15 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "hi!", shortArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) (short) 1, "builder");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Short" + "'", str2, "Short");
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Byte", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Byte");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
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
        float[] floatArray18 = new float[] { 0L, (short) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle", floatArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0, 97.0]");
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray11 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", booleanArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true]");
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray10 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", doubleArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("commons");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "commons" + "'", str1, "commons");
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("java.util");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.util");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "builder", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
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
            toStringStyle0.append(stringBuffer15, "org.apache.commons.lang3.builder", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "commons");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: commons");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "lang", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ShortPrefixToStringStyle", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        char[] charArray6 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "ToStringStyle", charArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
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
        short[] shortArray19 = new short[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Integer", shortArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10]");
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "util", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray12 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Byte", floatArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray12 = new double[] { '#', 0L, (byte) 10, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "org.apache.commons.lang3.builder", doubleArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 0.0, 10.0, 100.0]");
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray11 = new double[] { (-1.0f), '4', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "$", doubleArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 52.0, 0.0]");
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ToStringStyle.DefaultToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle/DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
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
            toStringStyle0.append(stringBuffer10, ".", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) (byte) 10, "Integer");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Byte" + "'", str2, "Byte");
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "java.util");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray10 = new short[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java.lang", shortArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0]");
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
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
        java.lang.String str46 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) wildcardClassArray44, "java.util");
        java.lang.Class<?> wildcardClass47 = wildcardClassArray44.getClass();
        java.lang.String str49 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClass47, "Float");
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "Float", "lang3");
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Class[]" + "'", str46, "Class[]");
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang" + "'", str49, "java.lang");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang" + "'", str51, "java.lang");
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ToStringStyle.MultiLineToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle.MultiLineToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ToStringStyle.MultiLineToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle/MultiLineToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "$", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "hi!", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "java.lang", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "org.apache.commons.lang3.builder", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ShortPrefixToStringStyle", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray9 = new long[] { (short) 10, (short) -1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "java.lang", longArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[10, -1, 1]");
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
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
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "$", byteArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 10, 10, 100, -1]");
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList", doubleArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray11 = new boolean[] { false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Double", booleanArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, true, false]");
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Short", (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle6, "Byte");
        java.lang.Class<?> wildcardClass9 = toStringStyle6.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle10, "Byte");
        java.lang.Class<?> wildcardClass13 = toStringStyle10.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle14, "Byte");
        java.lang.Class<?> wildcardClass17 = toStringStyle14.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle18, "Byte");
        java.lang.Class<?> wildcardClass21 = toStringStyle18.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass9;
        wildcardClassArray24[1] = wildcardClass13;
        wildcardClassArray24[2] = wildcardClass17;
        wildcardClassArray24[3] = wildcardClass21;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle33, "Byte");
        java.lang.Class<?> wildcardClass36 = toStringStyle33.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle37 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str39 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle37, "Byte");
        java.lang.Class<?> wildcardClass40 = toStringStyle37.getClass();
        java.lang.Class[] classArray42 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass36;
        wildcardClassArray43[1] = wildcardClass40;
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Double", (java.lang.Object[]) wildcardClassArray50, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.lang3.builder" + "'", str8, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.lang3.builder" + "'", str12, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.lang3.builder" + "'", str16, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.lang3.builder" + "'", str20, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(toStringStyle33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.lang3.builder" + "'", str35, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(toStringStyle37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.lang3.builder" + "'", str39, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray13 = new double[] { '$', (-1), '.', 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "DefaultToStringStyle", doubleArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[36.0, -1.0, 46.0, 2.0]");
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NoFieldNameToStringStyle" + "'", str1, "NoFieldNameToStringStyle");
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ShortPrefixToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "$", "$" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.Class<?>> wildcardClassList30 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList28);
        java.util.List<java.lang.Class<?>> wildcardClassList31 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList28);
        java.util.List<java.lang.Class<?>> wildcardClassList32 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList28);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer24, (java.lang.Object) strList28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassList30);
        org.junit.Assert.assertNotNull(wildcardClassList31);
        org.junit.Assert.assertNotNull(wildcardClassList32);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        java.lang.String[] strArray2 = new java.lang.String[] { "$", "$" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        java.util.List<java.lang.Class<?>> wildcardClassList5 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList3);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strList3, "$");
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "$", "builder");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClassList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.util" + "'", str7, "java.util");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "String" + "'", str9, "String");
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "String", 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray14 = new double[] { 100L, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Integer", doubleArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 32.0]");
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray7 = new long[] { '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "NoFieldNameToStringStyle", longArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[36]");
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "DefaultToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "$", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray8 = new short[] { (short) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", shortArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 10]");
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer8 = null;
        int[] intArray14 = new int[] { (short) 100, 10, 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "util", intArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 10, 0, 100]");
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray11 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java.util", booleanArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, true]");
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
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
            toStringStyle0.append(stringBuffer10, "ArrayList", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java", (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray11 = new float[] { (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "lang", floatArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, -1.0]");
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        int[] intArray15 = new int[] { 1, (short) 10, 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", intArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 10, 1, 1]");
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray17 = new char[] { 'a', '4', 'a', '4', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", charArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a4a4$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a4a4$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, 4, a, 4, $]");
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray14 = new int[] { (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "hi!", intArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100]");
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, ".");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "builder", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
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
        short[] shortArray19 = new short[] { (byte) 10, (byte) -1, (short) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Boolean", shortArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10, -1, 1, 0]");
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NoFieldNameToStringStyle" + "'", str1, "NoFieldNameToStringStyle");
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
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
            toStringStyle0.append(stringBuffer13, "", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
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
            toStringStyle0.append(stringBuffer15, "MultiLineToStringStyle", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray12 = new boolean[] { true, false, true, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Short", booleanArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, false, true, true, true, true]");
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray15 = new double[] { 0L, '$', 100, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "builder", doubleArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 36.0, 100.0, 100.0]");
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
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
        boolean[] booleanArray21 = new boolean[] { false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle", booleanArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, false]");
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
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
        long[] longArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "util", longArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "$");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", longArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
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
        int[] intArray21 = new int[] { 'a', (byte) 10, (byte) -1, '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ToStringStyle.NoFieldNameToStringStyle", intArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[97, 10, -1, 36]");
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
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
            toStringStyle0.append(stringBuffer27, "ToStringStyle.NoFieldNameToStringStyle", (byte) 1);
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
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Class[]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "NoFieldNameToStringStyle", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle14.appendSuper(stringBuffer15, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle14.appendSuper(stringBuffer18, "");
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle14.appendSuper(stringBuffer21, "java.lang");
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle14.appendToString(stringBuffer24, "lang");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle14.appendToString(stringBuffer27, "builder");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer13, (java.lang.Object) "builder");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle14);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray9 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", byteArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "builder", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray11 = new short[] { (short) 1, (short) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Long", shortArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[1, -1, 10, 100, -1]");
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle2 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle2, "Byte");
        java.lang.Class<?> wildcardClass5 = toStringStyle2.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle6, "Byte");
        java.lang.Class<?> wildcardClass9 = toStringStyle6.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle10, "Byte");
        java.lang.Class<?> wildcardClass13 = toStringStyle10.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle14, "Byte");
        java.lang.Class<?> wildcardClass17 = toStringStyle14.getClass();
        java.lang.Class[] classArray19 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass5;
        wildcardClassArray20[1] = wildcardClass9;
        wildcardClassArray20[2] = wildcardClass13;
        wildcardClassArray20[3] = wildcardClass17;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle29 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str31 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle29, "Byte");
        java.lang.Class<?> wildcardClass32 = toStringStyle29.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle33, "Byte");
        java.lang.Class<?> wildcardClass36 = toStringStyle33.getClass();
        java.lang.Class[] classArray38 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass32;
        wildcardClassArray39[1] = wildcardClass36;
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray39);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle45 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str47 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle45, "Byte");
        java.lang.Class<?> wildcardClass48 = toStringStyle45.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle49 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle49, "Byte");
        java.lang.Class<?> wildcardClass52 = toStringStyle49.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle53 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str55 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle53, "Byte");
        java.lang.Class<?> wildcardClass56 = toStringStyle53.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle57 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle57, "Byte");
        java.lang.Class<?> wildcardClass60 = toStringStyle57.getClass();
        java.lang.Class[] classArray62 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        wildcardClassArray63[0] = wildcardClass48;
        wildcardClassArray63[1] = wildcardClass52;
        wildcardClassArray63[2] = wildcardClass56;
        wildcardClassArray63[3] = wildcardClass60;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle72 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str74 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle72, "Byte");
        java.lang.Class<?> wildcardClass75 = toStringStyle72.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle76 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str78 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle76, "Byte");
        java.lang.Class<?> wildcardClass79 = toStringStyle76.getClass();
        java.lang.Class[] classArray81 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray82 = (java.lang.Class<?>[]) classArray81;
        wildcardClassArray82[0] = wildcardClass75;
        wildcardClassArray82[1] = wildcardClass79;
        boolean boolean87 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray82);
        java.lang.Class<?>[] wildcardClassArray88 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray63);
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray88, false);
        java.lang.Class<?>[] wildcardClassArray91 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray88);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray88);
        java.lang.Class<?>[] wildcardClassArray93 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray92);
        java.lang.Class<?>[] wildcardClassArray94 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray93);
        boolean boolean96 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray1, wildcardClassArray93, true);
        boolean boolean98 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray93, true);
        java.lang.Class<?>[] wildcardClassArray99 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray93);
        org.junit.Assert.assertNotNull(toStringStyle2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.lang3.builder" + "'", str4, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.lang3.builder" + "'", str8, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.lang3.builder" + "'", str12, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.lang3.builder" + "'", str16, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(toStringStyle29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.lang3.builder" + "'", str31, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(toStringStyle33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.lang3.builder" + "'", str35, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(toStringStyle45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org.apache.commons.lang3.builder" + "'", str47, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(toStringStyle49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "org.apache.commons.lang3.builder" + "'", str51, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(toStringStyle53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org.apache.commons.lang3.builder" + "'", str55, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(toStringStyle57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "org.apache.commons.lang3.builder" + "'", str59, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(toStringStyle72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "org.apache.commons.lang3.builder" + "'", str74, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(toStringStyle76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "org.apache.commons.lang3.builder" + "'", str78, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(classArray81);
        org.junit.Assert.assertNotNull(wildcardClassArray82);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray91);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertNotNull(wildcardClassArray93);
        org.junit.Assert.assertNotNull(wildcardClassArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray99);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "lang3", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Class[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LClass;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("lang");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray13 = new int[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "MultiLineToStringStyle", intArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Long");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Short", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Long");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Long");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "DefaultToStringStyle", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "DefaultToStringStyle", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        short[] shortArray8 = new short[] { (byte) -1, (byte) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "Class", shortArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 10, -1]");
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons.lang3.builder", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
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
        char[] charArray20 = new char[] { '.', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "MultiLineToStringStyle", charArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), ". ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), ". ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[.,  ]");
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
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
        char[] charArray19 = new char[] { '.', 'a', '.', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "hi!", charArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), ".a.4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), ".a.4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[., a, ., 4]");
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "lang3", booleanArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
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
            toStringStyle0.append(stringBuffer13, "Character", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray19 = new char[] { '.', '$', '4', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "java.lang", charArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), ".$4#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), ".$4#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[., $, 4, #, 4]");
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
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
        char[] charArray35 = new char[] { '#', 'a', '#', '#', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer27, "ToStringStyle.ShortPrefixToStringStyle", charArray35, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "#a##aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "#a##aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, a, #, #, a, a]");
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ToStringStyle.ShortPrefixToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray19 = new boolean[] { false, true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "org.apache.commons", booleanArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, true, true, true, false]");
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Boolean", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Boolean");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
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
            toStringStyle0.append(stringBuffer24, "Boolean", (short) -1);
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
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray12 = new long[] { '#', '#', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", longArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[35, 35, 1]");
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
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
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
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
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray62);
        java.lang.Class<?>[] wildcardClassArray88 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray87);
        java.lang.Class<?>[] wildcardClassArray89 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray87);
        java.lang.Class<?>[] wildcardClassArray90 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray87);
        boolean boolean92 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray87, false);
        java.lang.Class<?> wildcardClass93 = wildcardClassArray87.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertNotNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(wildcardClassArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
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
        short[] shortArray17 = new short[] { (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "hi!", shortArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[1, 1]");
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ShortPrefixToStringStyle", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray19 = new short[] { (byte) -1, (short) 100, (short) -1, (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", shortArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 100, -1, 10, 10]");
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
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
            toStringStyle0.append(stringBuffer10, "org.apache.commons", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle10, "Byte");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle10.appendSuper(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle10.appendToString(stringBuffer16, "Double");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer9, (java.lang.Object) stringBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.lang3.builder" + "'", str12, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray12 = new float[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", floatArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[0.0]");
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
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
            toStringStyle0.append(stringBuffer13, "lang3", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ToStringStyle.ShortPrefixToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle/ShortPrefixToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "MultiLineToStringStyle", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
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
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray59);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Class", (java.lang.Object[]) wildcardClassArray60, (java.lang.Boolean) false);
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
        org.junit.Assert.assertNotNull(wildcardClassArray60);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
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
        short[] shortArray21 = new short[] { (short) 10, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3", shortArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 1, -1]");
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
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
            toStringStyle0.append(stringBuffer19, "builder", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.DefaultToStringStyle", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Short", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        short[] shortArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "commons", shortArray3, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray10 = new int[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList", intArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "org.apache.commons.lang3.builder", (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray14 = new short[] { (short) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3", shortArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[100, 1, -1, 0, 100]");
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
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
            toStringStyle0.append(stringBuffer16, "ShortPrefixToStringStyle", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Long", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Long");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ShortPrefixToStringStyle", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Long");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", doubleArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
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
        java.lang.Class<?> wildcardClass16 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
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
        short[] shortArray26 = new short[] { (byte) -1, (short) 0, (short) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "org.apache.commons", shortArray26, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[-1, 0, 100, 0, 0]");
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
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
        char[] charArray17 = new char[] { '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "builder", charArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #]");
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
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
            toStringStyle0.append(stringBuffer27, "org.apache.commons.lang3", 1.0d);
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
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "String", (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object obj5 = null;
        toStringStyle0.appendStart(stringBuffer4, obj5);
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray11 = new int[] { (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java.util", intArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100]");
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray10 = new short[] { (short) 1, (short) -1, (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Character", shortArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[1, -1, 0, 10]");
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "$", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, ".");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray16 = new long[] { (short) 1, (byte) 10, (short) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "commons", longArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[1, 10, 100, 0]");
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
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
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "MultiLineToStringStyle", obj17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
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
        boolean[] booleanArray22 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, ".", booleanArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true]");
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray13 = new int[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "lang", intArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
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
            toStringStyle0.append(stringBuffer10, "Float", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray15 = new int[] { 1, '4', (short) 1, 4, 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java.util", intArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 52, 1, 4, 10, 35]");
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        short[] shortArray11 = new short[] { (byte) -1, (short) -1, (short) 0, (byte) 1, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "util", shortArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, -1, 0, 1, 100, -1]");
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
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
        byte[] byteArray21 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "java.lang", byteArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Short", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Short", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Short");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Class");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) stringBuffer9, "Byte");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Byte" + "'", str13, "Byte");
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
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
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle.MultiLineToStringStyle", byteArray25, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, -1, 100, 100]");
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "java.lang", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
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
            toStringStyle0.append(stringBuffer18, "", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
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
            toStringStyle0.append(stringBuffer13, "DefaultToStringStyle", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        long[] longArray8 = new long[] { 10, (byte) 10, 100, 0L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "Boolean", longArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 10, 100, 0, 100]");
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
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
            toStringStyle0.append(stringBuffer19, "ArrayList", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray12 = new short[] { (byte) -1, (byte) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Short", shortArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, -1, -1]");
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
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
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Class[]", byteArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 10, 0, 1]");
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
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
            toStringStyle0.append(stringBuffer16, "MultiLineToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
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
        long[] longArray21 = new long[] { (-1L), (-1L), 0L, (short) -1, '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", longArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[-1, -1, 0, -1, 35, 0]");
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray17 = new float[] { (short) 10, 'a', 0L, (-1L), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Short", floatArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[10.0, 97.0, 0.0, -1.0, 100.0]");
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray9 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons", floatArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
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
            toStringStyle0.append(stringBuffer16, "DefaultToStringStyle", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class");
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle12 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle12.appendSuper(stringBuffer13, "java.lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle12.appendSuper(stringBuffer16, "java.lang");
        java.lang.Class<?> wildcardClass19 = toStringStyle12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java", (java.lang.Object) wildcardClass19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "NoFieldNameToStringStyle", (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "lang");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray10 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Byte", charArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a]");
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
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
            toStringStyle0.append(stringBuffer15, "hi!", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons.lang3.builder", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray10 = new short[] { (short) 0, (byte) 100, (short) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "$", shortArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[0, 100, 0, 10]");
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray15 = new int[] { ' ', '#', 100, '$', (short) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.DefaultToStringStyle", intArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 35, 100, 36, 10, -1]");
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray10 = new char[] { ' ', '.', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", charArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " .a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " .a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , ., a, #]");
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
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
        boolean[] booleanArray27 = new boolean[] { true, false, false, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle.NoFieldNameToStringStyle", booleanArray27, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, false, false, true, false, true]");
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Class", floatArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
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
        boolean[] booleanArray22 = new boolean[] { false, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ArrayList", booleanArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, false, false]");
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
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
            toStringStyle0.append(stringBuffer10, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Class", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Class");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
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
        float[] floatArray21 = new float[] { 'a', (-1), 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", floatArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[97.0, -1.0, 0.0]");
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "NoFieldNameToStringStyle" + "'", str1, "NoFieldNameToStringStyle");
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "MultiLineToStringStyle", byteArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1, -1, 0]");
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Long");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ToStringStyle.DefaultToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle.DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ToStringStyle.NoFieldNameToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle" + "'", str1, "ToStringStyle");
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray18 = new double[] { '$', (short) 0, 100.0d, '#', 0L, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "util", doubleArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[36.0, 0.0, 100.0, 35.0, 0.0, 1.0]");
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "lang3");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray19 = new long[] { 0L, 'a', (byte) -1, 'a', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ShortPrefixToStringStyle", longArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[0, 97, -1, 97, 1]");
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.MultiLineToStringStyle", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
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
            toStringStyle0.append(stringBuffer22, "ToStringStyle.DefaultToStringStyle", (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "java", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
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
            toStringStyle0.append(stringBuffer10, "", (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "$", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        long[] longArray6 = new long[] { 0, 10L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "Integer", longArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, 10, 100]");
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
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
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
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
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "ToStringStyle.MultiLineToStringStyle", byteArray27, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[100, 100, 0]");
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.Class<?> wildcardClass10 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        long[] longArray4 = new long[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "hi!", longArray4, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[52]");
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Boolean");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray14 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Boolean", booleanArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false]");
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray9 = new float[] { 10, 2, 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons.lang3.builder", floatArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0, 2.0, 4.0]");
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Long", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray10 = new short[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "commons", shortArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[100]");
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
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
        double[] doubleArray21 = new double[] { 10.0d, 10.0d, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons", doubleArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 10.0, -1.0]");
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
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
            toStringStyle0.append(stringBuffer16, "Class[]", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "commons", charArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray11 = new long[] { 4, (byte) -1, 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "lang", longArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[4, -1, 2]");
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Boolean", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Boolean");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Class[]");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray16 = new char[] { ' ', '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "$", charArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, 4,  ]");
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Class[]");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "String", (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
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
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3.builder", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
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
        long[] longArray19 = new long[] { 3, '#', (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Boolean", longArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[3, 35, -1, 100]");
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Byte");
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray19 = new char[] { ' ', '#', '.', '#', '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "java.util", charArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " #.#.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " #.#.");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , #, ., #, .]");
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Long", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
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
            toStringStyle0.append(stringBuffer15, "", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer8, "lang", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray16 = new char[] { '4', '#', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Byte", charArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4#a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4#a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, #, a, #]");
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray15 = new long[] { (byte) 1, 0L, 0, 1L, 10L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle", longArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[1, 0, 0, 1, 10, 100]");
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "NoFieldNameToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: NoFieldNameToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
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
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "lang", byteArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 10, 0, 100, -1, -1]");
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
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
            toStringStyle0.append(stringBuffer10, "Double", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Double", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "commons", (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
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
        short[] shortArray23 = new short[] { (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "DefaultToStringStyle", shortArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[100, -1]");
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Float");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Float");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
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
        short[] shortArray19 = new short[] { (short) 1, (byte) 1, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "lang", shortArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[1, 1, 1, 10]");
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
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
        char[] charArray24 = new char[] { ' ', ' ', ' ', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "lang", charArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "   $");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "   $");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ ,  ,  , $]");
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
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
        int[] intArray23 = new int[] { (short) 1, 1, (byte) -1, 3, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "NoFieldNameToStringStyle", intArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.lang3.builder" + "'", str7, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 1, -1, 3, 35, 100]");
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "MultiLineToStringStyle", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
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
            toStringStyle0.append(stringBuffer12, "Float", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
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
        java.lang.String str19 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "Class", "");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str17, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang" + "'", str19, "java.lang");
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Double", byteArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 0]");
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray9 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "util", charArray9, (java.lang.Boolean) false);
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
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3.builder", byteArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 10]");
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "$", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
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
            toStringStyle0.append(stringBuffer19, "ToStringStyle.NoFieldNameToStringStyle", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
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
            toStringStyle0.append(stringBuffer10, "Class", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "ShortPrefixToStringStyle");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ShortPrefixToStringStyle" + "'", str2, "ShortPrefixToStringStyle");
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "builder");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Float", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray14 = new double[] { (byte) 1, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3", doubleArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0]");
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle8 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle8.appendSuper(stringBuffer9, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle8.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle16 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle16.appendSuper(stringBuffer17, "lang");
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle16.appendSuper(stringBuffer20, "");
        toStringStyle8.appendStart(stringBuffer15, (java.lang.Object) stringBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer7, (java.lang.Object) toStringStyle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle16);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "hi!", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.util");
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
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
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
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray90);
        java.lang.String str97 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray95, "Byte");
        java.lang.Class<?>[] wildcardClassArray98 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray95);
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
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "java.lang" + "'", str97, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray98);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle18, "Byte");
        java.lang.Class<?> wildcardClass21 = toStringStyle18.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle22 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str24 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle22, "Byte");
        java.lang.Class<?> wildcardClass25 = toStringStyle22.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle26 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str28 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle26, "Byte");
        java.lang.Class<?> wildcardClass29 = toStringStyle26.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle30 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle30, "Byte");
        java.lang.Class<?> wildcardClass33 = toStringStyle30.getClass();
        java.lang.Class[] classArray35 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass21;
        wildcardClassArray36[1] = wildcardClass25;
        wildcardClassArray36[2] = wildcardClass29;
        wildcardClassArray36[3] = wildcardClass33;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle45 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str47 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle45, "Byte");
        java.lang.Class<?> wildcardClass48 = toStringStyle45.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle49 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle49, "Byte");
        java.lang.Class<?> wildcardClass52 = toStringStyle49.getClass();
        java.lang.Class[] classArray54 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray55 = (java.lang.Class<?>[]) classArray54;
        wildcardClassArray55[0] = wildcardClass48;
        wildcardClassArray55[1] = wildcardClass52;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray61);
        java.lang.String str64 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray62, "org.apache.commons.lang3.builder");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Integer", (java.lang.Object[]) wildcardClassArray62, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.lang3.builder" + "'", str20, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(toStringStyle22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.lang3.builder" + "'", str24, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(toStringStyle26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.lang3.builder" + "'", str28, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(toStringStyle30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.lang3.builder" + "'", str32, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(toStringStyle45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org.apache.commons.lang3.builder" + "'", str47, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(toStringStyle49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "org.apache.commons.lang3.builder" + "'", str51, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang" + "'", str64, "java.lang");
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "");
        java.lang.StringBuffer stringBuffer6 = null;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Character", byteArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, -1, 0, 1, 0]");
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class[]", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "org.apache.commons.lang3", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
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
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray56);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray57);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", (java.lang.Object[]) wildcardClassArray57, (java.lang.Boolean) false);
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
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ToStringStyle.DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle/DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
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
        short[] shortArray23 = new short[] { (byte) -1, (byte) 10, (byte) 10, (short) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", shortArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 10, 10, 100, 1]");
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray16 = new short[] { (byte) 100, (short) 0, (short) 100, (byte) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "builder", shortArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[100, 0, 100, 10, 100]");
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "builder", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "MultiLineToStringStyle", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class<?>[] wildcardClassArray1 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray0);
        org.junit.Assert.assertNull(wildcardClassArray1);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Double", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.MultiLineToStringStyle");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "ToStringStyle.MultiLineToStringStyle", "java.util");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "String" + "'", str11, "String");
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "commons", (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
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
        short[] shortArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "ToStringStyle.NoFieldNameToStringStyle", shortArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ToStringStyle.DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle.DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "commons");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray17 = new long[] { 10L, 10L, 0L, 100, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class", longArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[10, 10, 0, 100, 1]");
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray14 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Boolean", booleanArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false]");
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
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
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "hi!", byteArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 10]");
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
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
            toStringStyle0.append(stringBuffer24, "DefaultToStringStyle", (byte) 10);
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
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray13 = new char[] { '$', '4', '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", charArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "$4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "$4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[$, 4, #,  ]");
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
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
            toStringStyle0.append(stringBuffer16, "Boolean", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.util");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray12 = new float[] { 1L, '#', 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", floatArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[1.0, 35.0, 0.0]");
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ToStringStyle.DefaultToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ToStringStyle/DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray10 = new long[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "MultiLineToStringStyle", longArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100]");
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle20.appendSuper(stringBuffer21, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer24 = null;
        toStringStyle20.appendSuper(stringBuffer24, "");
        java.lang.StringBuffer stringBuffer27 = null;
        toStringStyle20.appendSuper(stringBuffer27, "Boolean");
        java.lang.StringBuffer stringBuffer30 = null;
        toStringStyle20.appendToString(stringBuffer30, "builder");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer19, (java.lang.Object) toStringStyle20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle20);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "java", doubleArray14, (java.lang.Boolean) true);
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
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle6, "Byte");
        java.lang.Class<?> wildcardClass9 = toStringStyle6.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle10, "Byte");
        java.lang.Class<?> wildcardClass13 = toStringStyle10.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle14, "Byte");
        java.lang.Class<?> wildcardClass17 = toStringStyle14.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle18, "Byte");
        java.lang.Class<?> wildcardClass21 = toStringStyle18.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass9;
        wildcardClassArray24[1] = wildcardClass13;
        wildcardClassArray24[2] = wildcardClass17;
        wildcardClassArray24[3] = wildcardClass21;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle33, "Byte");
        java.lang.Class<?> wildcardClass36 = toStringStyle33.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle37 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str39 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle37, "Byte");
        java.lang.Class<?> wildcardClass40 = toStringStyle37.getClass();
        java.lang.Class[] classArray42 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass36;
        wildcardClassArray43[1] = wildcardClass40;
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray43);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray24);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray49);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Boolean", (java.lang.Object[]) wildcardClassArray49, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.lang3.builder" + "'", str8, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.lang3.builder" + "'", str12, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.lang3.builder" + "'", str16, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.lang3.builder" + "'", str20, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(toStringStyle33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.lang3.builder" + "'", str35, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(toStringStyle37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.lang3.builder" + "'", str39, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
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
        float[] floatArray15 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ShortPrefixToStringStyle", floatArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray10 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, ".", byteArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
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
        float[] floatArray20 = new float[] { ' ', 2, (short) 0, '#', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "java.util", floatArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[32.0, 2.0, 0.0, 35.0, 36.0]");
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
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
            toStringStyle0.append(stringBuffer19, "lang", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray10 = new char[] { '.', '.', 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", charArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "..aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "..aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[., ., a, a]");
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
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
            toStringStyle0.append(stringBuffer10, "Integer", (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray18 = new float[] { 1.0f, '.', '.', '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "lang3", floatArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[1.0, 46.0, 46.0, 46.0]");
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
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
            toStringStyle0.append(stringBuffer10, "ArrayList", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Double", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ShortPrefixToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ShortPrefixToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
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
        float[] floatArray29 = new float[] { 0.0f, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "NoFieldNameToStringStyle", floatArray29, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[0.0, 1.0]");
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "Double");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Double" + "'", str2, "Double");
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle6.appendSuper(stringBuffer7, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle6.appendSuper(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle6.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle6.appendToString(stringBuffer16, "builder");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle6.appendSuper(stringBuffer19, "lang");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle6.appendSuper(stringBuffer22, "lang");
        java.lang.StringBuffer stringBuffer25 = null;
        toStringStyle6.appendSuper(stringBuffer25, "Byte");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Long", (java.lang.Object) toStringStyle6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle6);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        int[] intArray11 = new int[] { (short) -1, 10, 'a', ' ', (byte) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "ArrayList", intArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 10, 97, 32, 0, 52]");
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray16 = new float[] { (byte) 0, (byte) 0, 10.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "util", floatArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[0.0, 0.0, 10.0, 35.0]");
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
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
            toStringStyle0.append(stringBuffer16, "org.apache.commons", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray12 = new long[] { 1, 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "String", longArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1, 1, -1]");
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray16 = new double[] { '$', (byte) -1, 0L, 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", doubleArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str8, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[36.0, -1.0, 0.0, 0.0, 10.0]");
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray12 = new long[] { (short) 10, '.', 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "util", longArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 46, 100]");
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
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
            toStringStyle0.append(stringBuffer16, "Boolean", (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Double", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons.lang3", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray14 = new int[] { 'a', 100, 4, 10, 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Character", intArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 100, 4, 10, 4]");
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
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
        java.lang.String str91 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray89, "Class");
        java.lang.Class<?> wildcardClass92 = wildcardClassArray89.getClass();
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
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "java.lang" + "'", str91, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
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
        byte[] byteArray17 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ToStringStyle.ShortPrefixToStringStyle", byteArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
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
            toStringStyle0.append(stringBuffer15, "lang3", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org.apache.commons");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "DefaultToStringStyle", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray17 = new float[] { 4, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "$", floatArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[4.0, -1.0]");
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
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
        double[] doubleArray36 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer33, ".", doubleArray36, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.lang3.builder" + "'", str15, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0]");
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        double[] doubleArray12 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "$", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0]");
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Float");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Long");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "org.apache.commons.lang3.builder", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.NoFieldNameToStringStyle" + "'", str8, "ToStringStyle.NoFieldNameToStringStyle");
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
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
            toStringStyle0.append(stringBuffer10, "NoFieldNameToStringStyle", (float) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "lang3", (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "builder", byteArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0]");
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "Double", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Long", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "java.lang");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "Integer");
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray11 = new short[] { (short) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "$", shortArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, -1, 100]");
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "String");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray9 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "DefaultToStringStyle", shortArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[]");
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
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
        double[] doubleArray18 = new double[] { (byte) 1, '$', 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Byte", doubleArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 36.0, 4.0]");
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
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
            toStringStyle0.append(stringBuffer10, "", (float) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray15 = new char[] { '4', '.', '.', '$', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.DefaultToStringStyle", charArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4..$#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4..$#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, ., ., $, #, a]");
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray9 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3", floatArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "java.util");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray9 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "commons", shortArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[]");
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
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
            toStringStyle0.append(stringBuffer13, "Class", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
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
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray90);
        java.lang.String str97 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray95, "Byte");
        java.lang.Class<?> wildcardClass98 = wildcardClassArray95.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "java.lang" + "'", str97, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
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
            toStringStyle0.append(stringBuffer13, "Boolean", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
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
        long[] longArray21 = new long[] { 3, 0L, '4', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "String", longArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[3, 0, 52, 1]");
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
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
        int[] intArray21 = new int[] { (short) -1, 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Integer", intArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 100, 0]");
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Short");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Short" + "'", str1, "Short");
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Byte");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.ShortPrefixToStringStyle", (long) '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray10 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "MultiLineToStringStyle", booleanArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true]");
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
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
        byte[] byteArray19 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3", byteArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, ".", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "java.lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java.lang");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3.builder", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray16 = new boolean[] { true, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.util", booleanArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, true, false]");
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Double");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray14 = new boolean[] { true, true, false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Long", booleanArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, false, false, true]");
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
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
        java.lang.Class<?> wildcardClass47 = wildcardClassArray44.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
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
        long[] longArray24 = new long[] { 100L, (short) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "Short", longArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[100, 1, 10]");
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
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
            toStringStyle0.append(stringBuffer15, "Float", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "org.apache.commons", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
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
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle8);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("org.apache.commons");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
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
            toStringStyle0.append(stringBuffer13, "NoFieldNameToStringStyle", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
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
        double[] doubleArray29 = new double[] { 100L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "", doubleArray29, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 0.0]");
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
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
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray44);
        java.lang.Class<?> wildcardClass47 = wildcardClassArray44.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ToStringStyle", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "commons");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", byteArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1]");
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Class[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Character", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
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
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle20 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer21 = null;
        toStringStyle20.appendToString(stringBuffer21, "ToStringStyle.MultiLineToStringStyle");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer19, (java.lang.Object) "ToStringStyle.MultiLineToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle20);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle6 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle6, "Byte");
        java.lang.Class<?> wildcardClass9 = toStringStyle6.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle10 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str12 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle10, "Byte");
        java.lang.Class<?> wildcardClass13 = toStringStyle10.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle14 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle14, "Byte");
        java.lang.Class<?> wildcardClass17 = toStringStyle14.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle18 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle18, "Byte");
        java.lang.Class<?> wildcardClass21 = toStringStyle18.getClass();
        java.lang.Class[] classArray23 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass9;
        wildcardClassArray24[1] = wildcardClass13;
        wildcardClassArray24[2] = wildcardClass17;
        wildcardClassArray24[3] = wildcardClass21;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle33 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle33, "Byte");
        java.lang.Class<?> wildcardClass36 = toStringStyle33.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle37 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str39 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle37, "Byte");
        java.lang.Class<?> wildcardClass40 = toStringStyle37.getClass();
        java.lang.Class[] classArray42 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass36;
        wildcardClassArray43[1] = wildcardClass40;
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray43);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle49 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle49, "Byte");
        java.lang.Class<?> wildcardClass52 = toStringStyle49.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle53 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str55 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle53, "Byte");
        java.lang.Class<?> wildcardClass56 = toStringStyle53.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle57 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str59 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle57, "Byte");
        java.lang.Class<?> wildcardClass60 = toStringStyle57.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle61 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str63 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle61, "Byte");
        java.lang.Class<?> wildcardClass64 = toStringStyle61.getClass();
        java.lang.Class[] classArray66 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray67 = (java.lang.Class<?>[]) classArray66;
        wildcardClassArray67[0] = wildcardClass52;
        wildcardClassArray67[1] = wildcardClass56;
        wildcardClassArray67[2] = wildcardClass60;
        wildcardClassArray67[3] = wildcardClass64;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle76 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str78 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle76, "Byte");
        java.lang.Class<?> wildcardClass79 = toStringStyle76.getClass();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle80 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str82 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle80, "Byte");
        java.lang.Class<?> wildcardClass83 = toStringStyle80.getClass();
        java.lang.Class[] classArray85 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray86 = (java.lang.Class<?>[]) classArray85;
        wildcardClassArray86[0] = wildcardClass79;
        wildcardClassArray86[1] = wildcardClass83;
        boolean boolean91 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, wildcardClassArray86);
        java.lang.Class<?>[] wildcardClassArray92 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray67);
        boolean boolean94 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray92, false);
        java.lang.Class<?>[] wildcardClassArray95 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray92);
        java.lang.String str97 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray92, ".");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.ShortPrefixToStringStyle", (java.lang.Object[]) wildcardClassArray92, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(toStringStyle6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.lang3.builder" + "'", str8, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(toStringStyle10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.lang3.builder" + "'", str12, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(toStringStyle14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.lang3.builder" + "'", str16, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(toStringStyle18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.lang3.builder" + "'", str20, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(toStringStyle33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.lang3.builder" + "'", str35, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(toStringStyle37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.lang3.builder" + "'", str39, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(toStringStyle49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "org.apache.commons.lang3.builder" + "'", str51, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(toStringStyle53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org.apache.commons.lang3.builder" + "'", str55, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(toStringStyle57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "org.apache.commons.lang3.builder" + "'", str59, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(toStringStyle61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "org.apache.commons.lang3.builder" + "'", str63, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(toStringStyle76);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "org.apache.commons.lang3.builder" + "'", str78, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(toStringStyle80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "org.apache.commons.lang3.builder" + "'", str82, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(classArray85);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray95);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Class[]" + "'", str97, "Class[]");
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Double");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Double" + "'", str1, "Double");
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Long");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "NoFieldNameToStringStyle", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
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
        short[] shortArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Class[]", shortArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray12 = new char[] { '#', '4', '$', ' ', '.', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Byte", charArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4$ .$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4$ .$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, $,  , ., $]");
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
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
        float[] floatArray21 = new float[] { (short) 10, '4', 3, 100.0f, (-1), (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Character", floatArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, 52.0, 3.0, 100.0, -1.0, -1.0]");
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
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
            toStringStyle0.append(stringBuffer33, "Float", (long) 3);
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
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Byte");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "hi!");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "Double", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Byte");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.MultiLineToStringStyle", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }
}

