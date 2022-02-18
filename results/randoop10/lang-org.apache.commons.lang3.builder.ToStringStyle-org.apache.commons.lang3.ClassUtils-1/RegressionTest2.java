import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray6 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Object", byteArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass(objArray10);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass(objArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray21);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray22, false);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray15, false);
        java.lang.Object[] objArray30 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass(objArray30);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray31);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        java.lang.Class<?>[] wildcardClassArray42 = null;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray40, wildcardClassArray42);
        java.lang.Class[] classArray45 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray46, false);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray46, false);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray36, true);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray53);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray54);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray55);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray55);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray57, true);
        java.lang.Object[] objArray63 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass(objArray63);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray64);
        java.lang.Class<?> wildcardClass66 = null;
        java.lang.Class[] classArray68 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray69 = (java.lang.Class<?>[]) classArray68;
        wildcardClassArray69[0] = wildcardClass66;
        java.lang.Class[] classArray73 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray74 = (java.lang.Class<?>[]) classArray73;
        java.lang.Class<?>[] wildcardClassArray75 = null;
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray73, wildcardClassArray75);
        java.lang.Class[] classArray78 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray79 = (java.lang.Class<?>[]) classArray78;
        boolean boolean81 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray75, wildcardClassArray79, false);
        boolean boolean83 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, wildcardClassArray79, false);
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray69, true);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray64);
        java.lang.Class<?>[] wildcardClassArray88 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray87);
        boolean boolean90 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray57, wildcardClassArray88, false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertNotNull(classArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(classArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
        org.junit.Assert.assertNotNull(wildcardClassArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Itr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Itr" + "'", str1, "Itr");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray19 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.MultiLineToStringStyle", doubleArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        char[] charArray13 = new char[] { '#', 'a', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList.ArrayListSpliterator", charArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#aa ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#aa ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, a,  ]");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "ArrayList");
        java.lang.StringBuffer stringBuffer20 = null;
        long[] longArray23 = new long[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "ToStringStyle", longArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[10]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("org.apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "apache" + "'", str1, "apache");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util.stream");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray20 = new short[] { (short) -1, (byte) -1, (short) 0, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ReferencePipeline.Head", shortArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, -1, 0, 10, -1]");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ArrayList.Itr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Itr" + "'", str1, "Itr");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "java.lang");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "$");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "commons");
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.MultiLineToStringStyle", obj14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray13 = new double[] { (short) 100, 8, 1, 6, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "DefaultToStringStyle", doubleArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 8.0, 1.0, 6.0, 32.0]");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3", (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: DefaultToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "util");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "ArrayList.ListItr", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Class", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, ".", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "java.util", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java/util");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = null;
        boolean boolean4 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, wildcardClassArray3);
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        boolean boolean9 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray7, false);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray10);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray11);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        java.lang.Object[] objArray18 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass(objArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        java.lang.Class<?>[] wildcardClassArray30 = null;
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray28, wildcardClassArray30);
        java.lang.Class[] classArray33 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray34, false);
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray34, false);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray41);
        java.lang.String str44 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray42, "org.apache.commons.lang3");
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray42);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray42, true);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang" + "'", str44, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ReferencePipeline.Head");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ReferencePipeline" + "'", str1, "ReferencePipeline");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray20 = new short[] { (short) 0, (short) 1, (short) 1, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList.ListItr", shortArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 1, 1, 100, 10]");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("stream");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray8 = new char[] { '4', '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", charArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4.");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, .]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList.ArrayListSpliterator", doubleArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray22 = new long[] { (byte) 10, '.', (byte) 1, 15 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.DefaultToStringStyle", longArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[10, 46, 1, 15]");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ReferencePipeline.Head", byteArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 10, -1, 10, 1]");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ReferencePipeline");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ReferencePipeline" + "'", str1, "ReferencePipeline");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Integer");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ReferencePipeline.Head", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray14 = new long[] { 1L, 3, (short) 10, 'a', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "builder", longArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[1, 3, 10, 97, -1]");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray15 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3", charArray15, (java.lang.Boolean) true);
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray12 = new int[] { (byte) -1, 1, 12 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java", intArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 1, 12]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray11 = new int[] { (byte) 10, (short) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Boolean", intArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, 1]");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray9 = new short[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", shortArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[100]");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ReferencePipeline");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Float");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ReferencePipeline", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass(objArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "lang", (java.lang.Object) wildcardClassArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        boolean[] booleanArray3 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ToStringStyle.MultiLineToStringStyle", booleanArray3, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray19 = new char[] { '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "commons", charArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[$]");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "java.util.stream");
        java.lang.StringBuffer stringBuffer19 = null;
        float[] floatArray23 = new float[] { (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "java", floatArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0, 100.0]");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle", (java.lang.Object) 100.0f, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "Object");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Itr", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray12 = new float[] { 100.0f, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons", floatArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[100.0, 0.0, 10.0]");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "String", 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        boolean[] booleanArray18 = new boolean[] { true, false, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "hi!", booleanArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, false, true, true]");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Itr");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Itr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ClassUtils", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "util");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "java", (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.ListItr", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList.Itr", byteArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 0]");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ArrayList.ListItr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ListItr" + "'", str1, "ListItr");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(".", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ArrayList");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Object[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Object");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ReferencePipeline", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ArrayList.ListItr");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayList/ListItr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Integer");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "lang", "hi!", "", "hi!", "Integer", "Class[]", "$", ".", "NoFieldNameToStringStyle" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        java.util.List<java.lang.Class<?>> wildcardClassList26 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList24);
        java.lang.Object[] objArray30 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass(objArray30);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray31);
        java.lang.Class<?> wildcardClass33 = null;
        java.lang.Class[] classArray35 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        wildcardClassArray36[0] = wildcardClass33;
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        java.lang.Class<?>[] wildcardClassArray42 = null;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray40, wildcardClassArray42);
        java.lang.Class[] classArray45 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray46, false);
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray46, false);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray36, true);
        java.lang.Object[] objArray56 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.toClass(objArray56);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray57);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, wildcardClassArray61);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray58);
        int int64 = wildcardClassList26.indexOf((java.lang.Object) wildcardClassArray58);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer13, (java.lang.Object) wildcardClassList26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClassList26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ArrayList.ArrayListSpliterator");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArrayListSpliterator" + "'", str1, "ArrayListSpliterator");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, ".", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", intArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Class", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "String");
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "java");
        java.lang.StringBuffer stringBuffer6 = null;
        short[] shortArray12 = new short[] { (byte) 10, (byte) 10, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "builder", shortArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str5, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[10, 10, -1, 100]");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList.ListItr", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "util");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "DefaultToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util.stream");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray14 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.util", charArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ ,  ]");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "Class[]", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray7 = new long[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ArrayList", longArray7, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100]");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "java.util.stream", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray16 = new short[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", shortArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[1]");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("commons");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("org.apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org" + "'", str1, "org");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "$", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("String");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass(objArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray13);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "DefaultToStringStyle", (java.lang.Object[]) wildcardClassArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ReferencePipeline.Head", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ReferencePipeline/Head");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray10 = new char[] { '#', ' ', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Integer", charArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "# #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "# #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#,  , #, 4]");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray11 = new short[] { (byte) -1, (byte) -1, (short) -1, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "java.util", shortArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, -1, -1, 10, -1]");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        float[] floatArray16 = new float[] { (-1L), '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ArrayList.Itr", floatArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 52.0]");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.ArrayListSpliterator", byteArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, -1, 1, 0]");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ReferencePipeline.Head", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ReferencePipeline");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ReferencePipeline");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "apache" + "'", str1, "apache");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray18 = new boolean[] { false, false, true, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", booleanArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, false]");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ClassUtils");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Itr", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass(objArray9);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray10);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        java.lang.Class<?>[] wildcardClassArray21 = null;
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray19, wildcardClassArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray25, false);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray25, false);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray15, true);
        java.lang.Object[] objArray35 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass(objArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray36);
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray40);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray37);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "commons", (java.lang.Object[]) wildcardClassArray44, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ListItr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.Class<?> wildcardClass10 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("stream");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: stream");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ClassUtils");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        long[] longArray9 = new long[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Boolean", longArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[10]");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "util");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "builder", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ArrayList", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ".", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("Itr", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Itr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList.ListItr", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "java.util.stream");
        java.lang.StringBuffer stringBuffer19 = null;
        char[] charArray26 = new char[] { '#', '#', '4', '.', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "", charArray26, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "##4.a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "##4.a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, 4, ., a]");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray17 = new short[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3", shortArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 1]");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache", doubleArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "String");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendToString(stringBuffer19, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "ToStringStyle.DefaultToStringStyle", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray15 = new int[] { 14, 15, 3 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "util", intArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[14, 15, 3]");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        char[] charArray15 = new char[] { '$', '4', 'a', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ArrayListSpliterator", charArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "$4a$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "$4a$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[$, 4, a, $]");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ClassUtils");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray24 = new double[] { (short) -1, 1, (-1L), (-1L), (byte) 10, 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "java.util", doubleArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 1.0, -1.0, -1.0, 10.0, 4.0]");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ListItr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ListItr" + "'", str1, "ListItr");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object[] objArray5 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass(objArray5);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray7);
        java.lang.String str10 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray7, "ArrayList.Itr");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer1, (java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray15 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.DefaultToStringStyle", intArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, ".", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: /");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "lang", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.Itr", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray21 = new float[] { 100, 6, 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "", floatArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[100.0, 6.0, 0.0, 10.0]");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ListItr");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ListItr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray19 = new double[] { 5, '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "org.apache.commons.lang3", doubleArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[5.0, 35.0]");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ArrayList.ArrayListSpliterator");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayList.ArrayListSpliterator");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "commons", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray13 = new boolean[] { true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle", booleanArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true, true, false, false]");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "String");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ListItr", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ListItr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList.ListItr", floatArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util.stream");
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        long[] longArray7 = new long[] { (short) -1, (byte) 10, (byte) 10, '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ArrayList.Itr", longArray7, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[-1, 10, 10, 36]");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray7 = null;
        boolean boolean8 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray5, "Class");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang" + "'", str11, "java.lang");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "String");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendToString(stringBuffer19, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer22 = null;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "String", byteArray29, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 10, 1, 0, -1]");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        int[] intArray12 = new int[] { '4', '$', 14, (short) 1, 'a', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "java.util", intArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[52, 36, 14, 1, 97, 0]");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray15 = new int[] { 'a', 10, 3 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", intArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97, 10, 3]");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray8 = new boolean[] { true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "NoFieldNameToStringStyle", booleanArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false]");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "Object");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray14 = new float[] { (byte) 0, 14, 100, 6, 0L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "stream", floatArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[0.0, 14.0, 100.0, 6.0, 0.0, 0.0]");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "stream", byteArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 10, -1, 100]");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("AnnotatedElement[][]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AnnotatedElement[][]" + "'", str1, "AnnotatedElement[][]");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "ClassUtils");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClassUtils" + "'", str2, "ClassUtils");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "Object");
        java.lang.StringBuffer stringBuffer6 = null;
        boolean[] booleanArray13 = new boolean[] { false, true, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "hi!", booleanArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, true, true, false, false]");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "Object");
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.Object[] objArray11 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass(objArray11);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray12);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        java.lang.Class<?>[] wildcardClassArray23 = null;
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray21, wildcardClassArray23);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray27, false);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray27, false);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray17, true);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray36);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Float", (java.lang.Object[]) wildcardClassArray37, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Class[]", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("apache");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray24 = new char[] { '.', '$', '#', '.', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "String", charArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), ".$#.#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), ".$#.#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[., $, #, ., #, 4]");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ArrayList");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java.lang", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) stringBuffer7, "lang");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "lang" + "'", str11, "lang");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Object");
        java.lang.StringBuffer stringBuffer4 = null;
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle5 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle5.appendSuper(stringBuffer6, "lang");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle5.appendToString(stringBuffer9, "ToStringStyle");
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        long[] longArray4 = new long[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "DefaultToStringStyle", longArray4, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[100]");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray15 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList.ArrayListSpliterator", charArray15, (java.lang.Boolean) false);
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "java.lang");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "$");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "commons");
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass(objArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray22);
        java.lang.Object[] objArray27 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass(objArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "String", (java.lang.Object[]) wildcardClassArray34, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "Object");
        java.lang.StringBuffer stringBuffer18 = null;
        boolean[] booleanArray25 = new boolean[] { true, false, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "$", booleanArray25, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[true, false, true, false, true]");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "java.util.stream");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "stream");
        java.lang.StringBuffer stringBuffer22 = null;
        boolean[] booleanArray27 = new boolean[] { false, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "org.apache.commons.lang3", booleanArray27, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, true, true]");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        java.lang.Class<?>[] wildcardClassArray21 = null;
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray19, wildcardClassArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray25, false);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray29);
        java.lang.Object[] objArray34 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.toClass(objArray34);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray35);
        java.lang.Class<?> wildcardClass37 = null;
        java.lang.Class[] classArray39 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        wildcardClassArray40[0] = wildcardClass37;
        java.lang.Class[] classArray44 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        java.lang.Class<?>[] wildcardClassArray46 = null;
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray44, wildcardClassArray46);
        java.lang.Class[] classArray49 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray50 = (java.lang.Class<?>[]) classArray49;
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray50, false);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray50, false);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray40, true);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray35, false);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Object", (java.lang.Object) wildcardClassArray60, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ReferencePipeline.Head", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ReferencePipeline/Head");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "ListItr", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer1, obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?> wildcardClass6 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        wildcardClassArray9[0] = wildcardClass6;
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = null;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray13, wildcardClassArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray19, false);
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray19, false);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray9, true);
        java.lang.Object[] objArray29 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass(objArray29);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Class[] classArray33 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray34);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray38);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.util.stream", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray10 = new boolean[] { false, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons.lang3.builder", booleanArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, true]");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "DefaultToStringStyle", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Object[]", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "stream", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: stream");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "lang", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "AnnotatedElement[][]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [[LAnnotatedElement;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.util", (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ArrayList");
        java.lang.StringBuffer stringBuffer16 = null;
        short[] shortArray23 = new short[] { (byte) 100, (short) 0, (short) 1, (short) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.MultiLineToStringStyle", shortArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[100, 0, 1, -1, 10]");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("org");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org" + "'", str1, "org");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "Object");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "org.apache.commons.lang3", (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, ".", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "Object");
        java.lang.StringBuffer stringBuffer18 = null;
        boolean[] booleanArray24 = new boolean[] { true, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "ReferencePipeline", booleanArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[true, true, false, true]");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.lang.String[] strArray4 = new java.lang.String[] { ".", "NoFieldNameToStringStyle", "ToStringStyle.NoFieldNameToStringStyle", "org.apache.commons.lang3.builder" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.lang.Class<?>> wildcardClassItor9 = wildcardClassList7.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClassList7);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray17 = new long[] { 4, '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "java", longArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[4, 46]");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "Object");
        java.lang.StringBuffer stringBuffer18 = null;
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "stream", byteArray25, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 10, 0, -1, 0]");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "java.lang", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray10 = new long[] { 14, 1L, 8, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "util", longArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[14, 1, 8, 100]");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Class", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        boolean boolean9 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass(objArray13);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray15, false);
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        java.lang.Class<?>[] wildcardClassArray21 = null;
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray19, wildcardClassArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray25, false);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass(objArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray36);
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class[] classArray45 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        java.lang.Class<?>[] wildcardClassArray47 = null;
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray45, wildcardClassArray47);
        java.lang.Class[] classArray50 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray51, false);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray51, false);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray41, true);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray59);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray59, false);
        java.lang.String str64 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) boolean62, "ListItr");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang" + "'", str64, "java.lang");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "Object");
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray12 = new int[] { '#', 8, '$', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ReferencePipeline.Head", intArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 8, 36, 36]");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.NoFieldNameToStringStyle", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ClassUtils");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "String", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray10 = new float[] { 8 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "DefaultToStringStyle", floatArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[8.0]");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray10 = new double[] { 1L, (short) 1, (-1L), 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "$", doubleArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 1.0, -1.0, 100.0]");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.util.stream", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ReferencePipeline.Head", obj8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray16 = new int[] { 100, ' ', (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "stream", intArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 32, 100, 0]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray11 = new float[] { 8, (-1), (short) 1, 4, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "util", floatArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[8.0, -1.0, 1.0, 4.0, 0.0]");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray13 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", booleanArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true]");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "ToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "String", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray12 = new double[] { 8, 1.0f, 0, '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "java.util.stream", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[8.0, 1.0, 0.0, 36.0]");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName(obj0, "AnnotatedElement[][]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AnnotatedElement[][]" + "'", str2, "AnnotatedElement[][]");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ClassUtils");
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray20 = new long[] { '.', 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "apache", longArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[46, 0]");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        double[] doubleArray6 = new double[] { 1, '#', 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ArrayListSpliterator", doubleArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 35.0, 10.0]");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("Float");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "String", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray10 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Integer", byteArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100]");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendToString(stringBuffer15, "Object");
        java.lang.StringBuffer stringBuffer18 = null;
        double[] doubleArray21 = new double[] { 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "NoFieldNameToStringStyle", doubleArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[2.0]");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = null;
        boolean boolean4 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, wildcardClassArray3);
        java.lang.Class[] classArray6 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray7 = (java.lang.Class<?>[]) classArray6;
        boolean boolean9 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray7, false);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray10);
        java.lang.Class<?>[] wildcardClassArray12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = null;
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray14, wildcardClassArray16);
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray20, false);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass(objArray29);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Class<?> wildcardClass32 = null;
        java.lang.Class[] classArray34 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray35 = (java.lang.Class<?>[]) classArray34;
        wildcardClassArray35[0] = wildcardClass32;
        java.lang.Class[] classArray39 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray40 = (java.lang.Class<?>[]) classArray39;
        java.lang.Class<?>[] wildcardClassArray41 = null;
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray39, wildcardClassArray41);
        java.lang.Class[] classArray44 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray45 = (java.lang.Class<?>[]) classArray44;
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray45, false);
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray45, false);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray35, true);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray30, false);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray24);
        java.lang.Object[] objArray59 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass(objArray59);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray61);
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray62);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray11, wildcardClassArray62);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(classArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray16 = new int[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.DefaultToStringStyle", intArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1]");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ArrayList.ListItr", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayList/ListItr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Object");
        java.lang.StringBuffer stringBuffer16 = null;
        short[] shortArray23 = new short[] { (byte) -1, (short) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ArrayList.ListItr", shortArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 0, 100, 0, 100]");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        long[] longArray19 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "org", longArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.Class[] classArray10 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        java.lang.Class<?>[] wildcardClassArray12 = null;
        boolean boolean13 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray10, wildcardClassArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray16, false);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray20);
        java.lang.Object[] objArray27 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass(objArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        java.lang.Class<?> wildcardClass30 = null;
        java.lang.Class[] classArray32 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        wildcardClassArray33[0] = wildcardClass30;
        java.lang.Class[] classArray37 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        java.lang.Class<?>[] wildcardClassArray39 = null;
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray37, wildcardClassArray39);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray43, false);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray43, false);
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray33, true);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray51);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray51, false);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ListItr", (java.lang.Object[]) wildcardClassArray51, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?> wildcardClass6 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        wildcardClassArray9[0] = wildcardClass6;
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = null;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray13, wildcardClassArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray19, false);
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray19, false);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray9, true);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class[] classArray35 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        java.lang.Class<?>[] wildcardClassArray37 = null;
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray35, wildcardClassArray37);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray41, false);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray41, false);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray27, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray11 = new float[] { '$', 100.0f, 6, 15, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org", floatArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[36.0, 100.0, 6.0, 15.0, 0.0]");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("AnnotatedElement[][]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: AnnotatedElement");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "java.util.stream");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "stream");
        java.lang.StringBuffer stringBuffer22 = null;
        int[] intArray30 = new int[] { '4', (byte) 10, (short) -1, (byte) 1, 14, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "Float", intArray30, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[52, 10, -1, 1, 14, 0]");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray13 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "apache", booleanArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[true]");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ClassUtils", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ClassUtils");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray13 = new int[] { 12, 4, (byte) 100, 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "util", intArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[12, 4, 100, 4]");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?> wildcardClass7 = wildcardClassArray5.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray15 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", charArray15, (java.lang.Boolean) false);
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
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "AnnotatedElement[][]", (float) '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "util");
        java.lang.StringBuffer stringBuffer20 = null;
        boolean[] booleanArray25 = new boolean[] { false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "NoFieldNameToStringStyle", booleanArray25, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, false]");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray4, "hi!");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "AnnotatedElement[][]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [[LAnnotatedElement;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "ArrayList");
        java.lang.StringBuffer stringBuffer20 = null;
        boolean[] booleanArray28 = new boolean[] { true, false, true, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "apache", booleanArray28, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[true, false, true, false, false, false]");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName(obj0, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("Float");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList", (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Object");
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray6 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons", longArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "hi!", (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "Boolean", "ClassUtils", "lang", "hi!", "org.apache.commons.lang3.builder", "ArrayList", "ArrayList.Itr", "Float", "ClassUtils", "ToStringStyle.NoFieldNameToStringStyle", "NoFieldNameToStringStyle", "ArrayList", "Class", "Object" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.List<java.lang.Class<?>> wildcardClassList18 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList16);
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor19 = wildcardClassList18.listIterator();
        wildcardClassList18.clear();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClassList18);
        org.junit.Assert.assertNotNull(wildcardClassItor19);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray13 = new boolean[] { false, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Integer", booleanArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, false]");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray10 = new long[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "commons", longArray10, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100]");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "util");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "lang", (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "org.apache.commons.lang3.builder", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "org.apache.commons.lang3", byteArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 0, 10, 10]");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        boolean[] booleanArray11 = new boolean[] { true, false, true, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, ".", booleanArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, true, true, true, true]");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "java.util.stream");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "stream");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "Boolean", (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class[] classArray10 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        java.lang.Class<?>[] wildcardClassArray12 = null;
        boolean boolean13 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray10, wildcardClassArray12);
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray16, false);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray16);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.String str22 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray20, "lang");
        java.lang.Object[] objArray26 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass(objArray26);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass(objArray32);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        java.lang.Class<?> wildcardClass35 = null;
        java.lang.Class[] classArray37 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass35;
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        java.lang.Class<?>[] wildcardClassArray44 = null;
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray42, wildcardClassArray44);
        java.lang.Class[] classArray47 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray48, false);
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray48, false);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray38, true);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray55);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray28, wildcardClassArray56, true);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray56);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray56, false);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray20);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang" + "'", str22, "java.lang");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ClassUtils");
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray19 = new double[] { (-1.0f), 2, 14, 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Class[]", doubleArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 2.0, 14.0, 10.0]");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList.Itr", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray8 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "NoFieldNameToStringStyle", intArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray13 = new long[] { 8, (short) 100, (short) 10, '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ClassUtils", longArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[8, 100, 10, 36]");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Object[]", byteArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, -1, 1, 10, 1]");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        java.lang.Class<?>[] wildcardClassArray4 = null;
        boolean boolean5 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray2, wildcardClassArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        boolean boolean10 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray8, false);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray11);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass(objArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?> wildcardClass20 = null;
        java.lang.Class[] classArray22 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray23 = (java.lang.Class<?>[]) classArray22;
        wildcardClassArray23[0] = wildcardClass20;
        java.lang.Class[] classArray27 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray28 = (java.lang.Class<?>[]) classArray27;
        java.lang.Class<?>[] wildcardClassArray29 = null;
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray27, wildcardClassArray29);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray29, wildcardClassArray33, false);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray33, false);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray23, true);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray18);
        boolean boolean42 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray18, false);
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray12);
        java.lang.Object[] objArray47 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass(objArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray49);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        long[] longArray12 = new long[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ToStringStyle.DefaultToStringStyle", longArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[1]");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray12 = new double[] { '4', 4, 9, 100.0f, 1.0f, 12 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Class", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 4.0, 9.0, 100.0, 1.0, 12.0]");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ReferencePipeline.Head");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Head" + "'", str1, "Head");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "AnnotatedElement[][]", byteArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, 1, 0, 10, 1]");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        float[] floatArray11 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ArrayList.ArrayListSpliterator", floatArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray19 = new int[] { 12, 4, (short) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "", intArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[12, 4, 1, 100]");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "java.lang");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "$");
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray14 = new boolean[] { false, false, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "Class", booleanArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, true]");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, ".", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "String");
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray6 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", byteArray6, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Boolean");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Object[]");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LObject;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Object");
        java.lang.StringBuffer stringBuffer16 = null;
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ArrayList.ListItr", obj18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "java.lang");
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray8 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "org.apache.commons.lang3", intArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Integer");
        java.lang.StringBuffer stringBuffer16 = null;
        int[] intArray22 = new int[] { (short) 1, 5, (-1), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Float", intArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 5, -1, 100]");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray13 = new float[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle", floatArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0]");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Integer", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("java.util.stream");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.util.stream");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.lang.String[] strArray9 = new java.lang.String[] { "lang", "hi!", "", "hi!", "Integer", "Class[]", "$", ".", "NoFieldNameToStringStyle" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<java.lang.Class<?>> wildcardClassList12 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList10);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle13 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object obj15 = null;
        toStringStyle13.appendStart(stringBuffer14, obj15);
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle13.appendSuper(stringBuffer17, "Float");
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle13.appendSuper(stringBuffer20, "org.apache.commons.lang3");
        boolean boolean23 = wildcardClassList12.equals((java.lang.Object) stringBuffer20);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClassList12);
        org.junit.Assert.assertNotNull(toStringStyle13);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Class[]");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Object[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Object[]" + "'", str1, "Object[]");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray13 = new boolean[] { false, false, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Object[]", booleanArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, false, false]");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "");
        java.lang.StringBuffer stringBuffer19 = null;
        char[] charArray23 = new char[] { '#', '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "", charArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#.");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#.");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, .]");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "String", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray17 = new long[] { '4', 14, '#', (byte) -1, 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, ".", longArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[52, 14, 35, -1, 2]");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3.builder", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "ClassUtils", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Float", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "apache", floatArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray9 = new long[] { (byte) 10, 9, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ClassUtils", longArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[10, 9, 0]");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "java.lang");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "$");
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray12 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "AnnotatedElement[][]", byteArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("Float");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Float" + "'", str1, "Float");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ArrayList");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray9 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList.ListItr", longArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.Object[] objArray12 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass(objArray12);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass(objArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?> wildcardClass21 = null;
        java.lang.Class[] classArray23 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        wildcardClassArray24[0] = wildcardClass21;
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        java.lang.Class<?>[] wildcardClassArray30 = null;
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray28, wildcardClassArray30);
        java.lang.Class[] classArray33 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray34 = (java.lang.Class<?>[]) classArray33;
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray34, false);
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, wildcardClassArray34, false);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray24, true);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray41);
        boolean boolean44 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray42, true);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray42);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3.builder", (java.lang.Object[]) wildcardClassArray42, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "stream", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray16 = new int[] { '.', 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ArrayList.ListItr", intArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[46, 2]");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "Boolean", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Object[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Object[]" + "'", str1, "Object[]");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray14 = new char[] { '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "hi!", charArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4]");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray22 = new double[] { (-1), 100L, 100L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3.builder", doubleArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.Itr", doubleArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?> wildcardClass6 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        wildcardClassArray9[0] = wildcardClass6;
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = null;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray13, wildcardClassArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray19, false);
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray19, false);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray9, true);
        java.lang.String str27 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) true, "apache");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "ArrayList");
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle0.appendToString(stringBuffer20, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer23 = null;
        toStringStyle0.appendToString(stringBuffer23, "util");
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer26, "org.apache.commons.lang3", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "apache", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: apache");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        float[] floatArray4 = new float[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "util", floatArray4, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0]");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "java.util.stream", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "ArrayList");
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle0.appendToString(stringBuffer20, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer23 = null;
        toStringStyle0.appendToString(stringBuffer23, "util");
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer26, "AnnotatedElement[][]", (float) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer10, obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("util");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3.builder", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
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
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray20 = new long[] { 100L, 1L, 8, (byte) -1, (short) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Object", longArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[100, 1, 8, -1, -1, 1]");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        long[] longArray9 = new long[] { 10, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Float", longArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[10, -1, 10]");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("AnnotatedElement[][]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: AnnotatedElement");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray16 = new char[] { '$', '.', ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.ArrayListSpliterator", charArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "$.  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "$.  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[$, .,  ,  ]");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Integer", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray15 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "commons", intArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        float[] floatArray10 = new float[] { 6, ' ', 'a', 10.0f, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "DefaultToStringStyle", floatArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[6.0, 32.0, 97.0, 10.0, -1.0]");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("java.util.stream");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "stream" + "'", str1, "stream");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java.lang");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ReferencePipeline.Head", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "hi!");
        java.lang.StringBuffer stringBuffer16 = null;
        short[] shortArray23 = new short[] { (short) 100, (short) 1, (byte) 0, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "stream", shortArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[100, 1, 0, -1, 1]");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "util", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray8 = new short[] { (short) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ReferencePipeline.Head", shortArray8, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 0]");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ListItr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ListItr" + "'", str1, "ListItr");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ClassUtils");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "util");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "Class[]", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "ToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "AnnotatedElement[][]", (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "java.lang");
        java.lang.StringBuffer stringBuffer6 = null;
        int[] intArray13 = new int[] { 5, 0, (byte) -1, (short) -1, 6 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "org.apache.commons", intArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[5, 0, -1, -1, 6]");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("ClassUtils", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ClassUtils");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray12 = new double[] { 0.0f, 0, 'a', 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "org.apache.commons", doubleArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 97.0, 1.0]");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray10 = new double[] { 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "Head", doubleArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Head", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Object[]", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Object[]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [LObject;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray12 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.ListItr", charArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ToStringStyle");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ToStringStyle" + "'", str1, "ToStringStyle");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Boolean", (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Float", doubleArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        double[] doubleArray8 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "$", doubleArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "AnnotatedElement[][]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("ArrayListSpliterator");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ArrayListSpliterator" + "'", str1, "ArrayListSpliterator");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.String str17 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) stringBuffer13, "org.apache");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org.apache" + "'", str17, "org.apache");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Object");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "String");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ListItr", (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ClassUtils");
        java.lang.StringBuffer stringBuffer9 = null;
        short[] shortArray17 = new short[] { (short) 1, (short) -1, (short) 1, (short) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", shortArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[1, -1, 1, 1, -1, 0]");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray9 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ClassUtils", booleanArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[]");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortClassName(obj0, "ArrayList");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ArrayList" + "'", str2, "ArrayList");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray13 = new long[] { (short) -1, (-1), (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", longArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[-1, -1, 100, 0]");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("ArrayListSpliterator");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray18 = new double[] { 2, (short) 1, (-1), 0.0f, 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "DefaultToStringStyle", doubleArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[2.0, 1.0, -1.0, 0.0, 1.0, 100.0]");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        int[] intArray9 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", intArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ClassUtils");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "String");
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "java");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str5, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ClassUtils");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Object[]", (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { ".", "NoFieldNameToStringStyle", "ToStringStyle.NoFieldNameToStringStyle", "org.apache.commons.lang3.builder" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.List<java.lang.Class<?>> wildcardClassList12 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList10);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer4, (java.lang.Object) wildcardClassList12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClassList12);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList.ArrayListSpliterator", shortArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "java.lang");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "$");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ArrayList.Itr", (float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        long[] longArray9 = new long[] { (byte) 100, (short) 10, (byte) 100, (short) 100, 'a', 10L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "Head", longArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 10, 100, 100, 97, 10]");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Integer");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "hi!", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ArrayList");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle", (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray19 = new long[] { 0, 'a', (short) 0, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, ".", longArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[0, 97, 0, 100]");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Itr", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Object");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "NoFieldNameToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?> wildcardClass6 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        wildcardClassArray9[0] = wildcardClass6;
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = null;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray13, wildcardClassArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray19, false);
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray19, false);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray9, true);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "AnnotatedElement[][]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: [[LAnnotatedElement;");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.util", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray11 = new char[] { '4', ' ', '$', '$', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", charArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4 $$4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4 $$4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  , $, $, 4]");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons.lang3.builder", byteArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 100, 1]");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer10, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ArrayList");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ArrayListSpliterator", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        long[] longArray21 = new long[] { (-1), (byte) -1, 4, 2, 12, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Class", longArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[-1, -1, 4, 2, 12, 0]");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util.stream");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray15 = new float[] { (byte) 10, 5, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList", floatArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 5.0, -1.0]");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "stream", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java.util", (float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray13 = new float[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.ArrayListSpliterator", floatArray13, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0]");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.lang.String[] strArray4 = new java.lang.String[] { ".", "NoFieldNameToStringStyle", "ToStringStyle.NoFieldNameToStringStyle", "org.apache.commons.lang3.builder" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList5);
        boolean boolean9 = wildcardClassList7.equals((java.lang.Object) (-1.0f));
        java.util.Iterator<java.lang.Class<?>> wildcardClassItor10 = wildcardClassList7.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = wildcardClassList7.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClassList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClassItor10);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Class[]");
        java.lang.StringBuffer stringBuffer4 = null;
        int[] intArray11 = new int[] { (short) -1, (short) -1, (byte) -1, '4', 15 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "AnnotatedElement[][]", intArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1, -1, 52, 15]");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.DefaultToStringStyle", byteArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 100]");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "String");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ArrayListSpliterator", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray14 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.DefaultToStringStyle", charArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a]");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ListItr", 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList.Itr", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "NoFieldNameToStringStyle", (double) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("org.apache.commons.lang3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang3" + "'", str1, "lang3");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ListItr");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ListItr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ".");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "Integer", (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ClassUtils");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "builder", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "ArrayList");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "java.util.stream", (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "ArrayList");
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle0.appendToString(stringBuffer20, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer23 = null;
        short[] shortArray29 = new short[] { (short) 0, (short) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer23, "Class[]", shortArray29, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 10, 0, -1]");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, ".", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray14 = new float[] { 15, (-1.0f), 10L, (short) -1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "DefaultToStringStyle", floatArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[15.0, -1.0, 10.0, -1.0, 100.0]");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray15 = new char[] { 'a', '.', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ReferencePipeline.Head", charArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a.a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a.a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, ., a]");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("apache", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: apache");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "java.util.stream", 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        long[] longArray5 = new long[] { 14, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "util", longArray5, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[14, -1]");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "AnnotatedElement[][]", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "util");
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.Object[] objArray13 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass(objArray13);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        java.lang.Class<?> wildcardClass16 = null;
        java.lang.Class[] classArray18 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        wildcardClassArray19[0] = wildcardClass16;
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        java.lang.Class<?>[] wildcardClassArray25 = null;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray23, wildcardClassArray25);
        java.lang.Class[] classArray28 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray29 = (java.lang.Class<?>[]) classArray28;
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray25, wildcardClassArray29, false);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray29, false);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray19, true);
        java.lang.Object[] objArray39 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.toClass(objArray39);
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray40);
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray44);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Object[] objArray51 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.toClass(objArray51);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray52);
        java.lang.Class<?> wildcardClass54 = null;
        java.lang.Class[] classArray56 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray57 = (java.lang.Class<?>[]) classArray56;
        wildcardClassArray57[0] = wildcardClass54;
        java.lang.Class[] classArray61 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray62 = (java.lang.Class<?>[]) classArray61;
        java.lang.Class<?>[] wildcardClassArray63 = null;
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray61, wildcardClassArray63);
        java.lang.Class[] classArray66 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray67 = (java.lang.Class<?>[]) classArray66;
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray67, false);
        boolean boolean71 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray57, wildcardClassArray67, false);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray52, wildcardClassArray57, true);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray52);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray74);
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray75);
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray75, true);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer9, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(classArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "", (double) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, ".");
        java.lang.StringBuffer stringBuffer19 = null;
        double[] doubleArray22 = new double[] { 2 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "String", doubleArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[2.0]");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "java.util.stream");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "stream");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "ArrayList.Itr", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("ArrayListSpliterator");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        long[] longArray14 = new long[] { 14, 9, '$', 14, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "lang3", longArray14, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[14, 9, 36, 14, -1]");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "Integer", "java.lang", "ClassUtils", "$", "java.lang", ".", "Integer", "hi!", "java.util", "java.lang", "Integer", "ClassUtils", "org.apache.commons.lang3.builder", "hi!" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.List<java.lang.Class<?>> wildcardClassList22 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList20);
        java.util.List<java.lang.Class<?>> wildcardClassList23 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList20);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer4, (java.lang.Object) wildcardClassList23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClassList22);
        org.junit.Assert.assertNotNull(wildcardClassList23);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ArrayList.ArrayListSpliterator", (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "String");
        java.lang.StringBuffer stringBuffer19 = null;
        short[] shortArray24 = new short[] { (byte) -1, (byte) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "lang3", shortArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 10, 1]");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray15 = new double[] { (-1), (-1.0d), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java", doubleArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendEnd(stringBuffer13, (java.lang.Object) "org");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        char[] charArray17 = new char[] { '$', '#', ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "String", charArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "$#  #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "$#  #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[$, #,  ,  , #]");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object[] objArray9 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.toClass(objArray9);
        java.lang.Class<?>[] wildcardClassArray11 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray10);
        java.lang.Class<?> wildcardClass12 = null;
        java.lang.Class[] classArray14 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        wildcardClassArray15[0] = wildcardClass12;
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        java.lang.Class<?>[] wildcardClassArray21 = null;
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray19, wildcardClassArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray25, false);
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray25, false);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray15, true);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray15);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray33);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "String", (java.lang.Object[]) wildcardClassArray34, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "lang", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "Class", (float) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Class[]", byteArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 100, 10]");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ClassUtils");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ArrayListSpliterator", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ListItr", 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Boolean");
        java.lang.StringBuffer stringBuffer16 = null;
        short[] shortArray18 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "", shortArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[]");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("org.apache.commons.lang3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang3" + "'", str1, "lang3");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object[] objArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ToStringStyle.NoFieldNameToStringStyle", objArray6, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3.builder", (double) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "util");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Object", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Object", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray11 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons", booleanArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false]");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer15 = null;
        int[] intArray20 = new int[] { 2, (byte) -1, 9 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "String", intArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2, -1, 9]");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "ArrayList");
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray19 = new long[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ClassUtils", longArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10]");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Object");
        java.lang.StringBuffer stringBuffer16 = null;
        long[] longArray19 = new long[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "lang3", longArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10]");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Object");
        java.lang.StringBuffer stringBuffer4 = null;
        double[] doubleArray11 = new double[] { '$', 3, (short) 10, 0.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache.commons", doubleArray11, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[36.0, 3.0, 10.0, 0.0, 0.0]");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Integer", (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "java.lang");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "$");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "commons");
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray18 = new char[] { '.', '$', '.', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "apache", charArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), ".$. ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), ".$. ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[., $, .,  ]");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("apache");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: apache");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "ToStringStyle.MultiLineToStringStyle", "org.apache.commons.lang3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ReferencePipeline", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, ".", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        char[] charArray9 = new char[] { '$', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "hi!", charArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "$ a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "$ a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[$,  , a]");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        float[] floatArray18 = new float[] { 9, 5 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "ArrayListSpliterator", floatArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[9.0, 5.0]");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("Itr");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Itr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray15 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "String", byteArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Object[] objArray11 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray12 = org.apache.commons.lang3.ClassUtils.toClass(objArray11);
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray12);
        java.lang.Class<?> wildcardClass14 = null;
        java.lang.Class[] classArray16 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray17 = (java.lang.Class<?>[]) classArray16;
        wildcardClassArray17[0] = wildcardClass14;
        java.lang.Class[] classArray21 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        java.lang.Class<?>[] wildcardClassArray23 = null;
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray21, wildcardClassArray23);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        boolean boolean29 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray27, false);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray17, wildcardClassArray27, false);
        boolean boolean33 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray12, wildcardClassArray17, true);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray34);
        java.lang.Class<?> wildcardClass36 = null;
        java.lang.Class[] classArray38 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray39 = (java.lang.Class<?>[]) classArray38;
        wildcardClassArray39[0] = wildcardClass36;
        java.lang.Class[] classArray43 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray44 = (java.lang.Class<?>[]) classArray43;
        java.lang.Class<?>[] wildcardClassArray45 = null;
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray43, wildcardClassArray45);
        java.lang.Class[] classArray48 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray45, wildcardClassArray49, false);
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray49, false);
        boolean boolean54 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray49);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray49, false);
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray57);
        java.lang.String str60 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray57, "Float");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "java.lang" + "'", str60, "java.lang");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "ClassUtils");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "Class");
        java.lang.StringBuffer stringBuffer14 = null;
        toStringStyle0.appendToString(stringBuffer14, ".");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendSuper(stringBuffer17, "ArrayList");
        java.lang.StringBuffer stringBuffer20 = null;
        toStringStyle0.appendToString(stringBuffer20, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer23 = null;
        toStringStyle0.appendToString(stringBuffer23, "util");
        java.lang.StringBuffer stringBuffer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer26, "lang", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        boolean[] booleanArray9 = new boolean[] { false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "Object", booleanArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, false]");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "stream", byteArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 10, 100, 10, -1]");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray15 = new double[] { (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", doubleArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, 1.0]");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray22 = new float[] { (-1L), (byte) 10, 4, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ReferencePipeline.Head", floatArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, 10.0, 4.0, 100.0]");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        int[] intArray12 = new int[] { '#', (short) 0, ' ', 8, (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "lang3", intArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0, 32, 8, 1, 1]");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ToStringStyle.MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "stream", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "java", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = null;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray13, wildcardClassArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        java.lang.Class<?>[] wildcardClassArray20 = null;
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray18, wildcardClassArray20);
        java.lang.Class[] classArray23 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray24 = (java.lang.Class<?>[]) classArray23;
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray24, false);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        boolean boolean30 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray13, wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray13);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList", (java.lang.Object[]) wildcardClassArray31, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util.stream");
        java.lang.StringBuffer stringBuffer10 = null;
        short[] shortArray15 = new short[] { (short) -1, (short) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", shortArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 10, 0]");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "hi!");
        java.lang.StringBuffer stringBuffer19 = null;
        float[] floatArray27 = new float[] { 0, (-1.0f), 15, (-1L), (byte) -1, '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "java", floatArray27, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[0.0, -1.0, 15.0, -1.0, -1.0, 46.0]");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ReferencePipeline.Head", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "String");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ReferencePipeline.Head", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util.stream");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.NoFieldNameToStringStyle", byteArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 10, 100, -1, -1, -1]");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object obj5 = null;
        toStringStyle0.appendStart(stringBuffer4, obj5);
        java.lang.StringBuffer stringBuffer7 = null;
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ToStringStyle.MultiLineToStringStyle", byteArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 10, 0, -1]");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ClassUtils");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("commons");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "org.apache.commons", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Itr", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        int[] intArray18 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.NoFieldNameToStringStyle", intArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("lang3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang3" + "'", str1, "lang3");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.lang.Object obj0 = null;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName(obj0, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("lang3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        boolean boolean9 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.toClass(objArray13);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray14);
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray15, false);
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        java.lang.Class<?>[] wildcardClassArray21 = null;
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray19, wildcardClassArray21);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray21, wildcardClassArray25, false);
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass(objArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray36);
        java.lang.Class<?> wildcardClass38 = null;
        java.lang.Class[] classArray40 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        wildcardClassArray41[0] = wildcardClass38;
        java.lang.Class[] classArray45 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        java.lang.Class<?>[] wildcardClassArray47 = null;
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray45, wildcardClassArray47);
        java.lang.Class[] classArray50 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray51 = (java.lang.Class<?>[]) classArray50;
        boolean boolean53 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray51, false);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray41, wildcardClassArray51, false);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray36, wildcardClassArray41, true);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray59);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray59, false);
        java.lang.Class[] classArray64 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        java.lang.Class<?>[] wildcardClassArray66 = null;
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray64, wildcardClassArray66);
        java.lang.Class[] classArray69 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray66, wildcardClassArray70, false);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray70);
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray70, false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ClassUtils");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Class[] classArray15 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        java.lang.Class<?>[] wildcardClassArray17 = null;
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, wildcardClassArray17);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class<?>[] wildcardClassArray22 = null;
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray20, wildcardClassArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray26 = (java.lang.Class<?>[]) classArray25;
        boolean boolean28 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray26, false);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray15, wildcardClassArray31);
        java.lang.Object[] objArray36 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass(objArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray39);
        java.lang.Object[] objArray44 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass(objArray44);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray45);
        java.lang.Class[] classArray48 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray49);
        java.lang.Object[] objArray54 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.toClass(objArray54);
        java.lang.Class<?>[] wildcardClassArray56 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray55);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray56, false);
        java.lang.Class[] classArray60 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray61 = (java.lang.Class<?>[]) classArray60;
        java.lang.Class<?>[] wildcardClassArray62 = null;
        boolean boolean63 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray60, wildcardClassArray62);
        java.lang.Class[] classArray65 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray66 = (java.lang.Class<?>[]) classArray65;
        boolean boolean68 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray62, wildcardClassArray66, false);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray66);
        java.lang.Class<?>[] wildcardClassArray70 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray66);
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray70, true);
        boolean boolean73 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray70);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer13, (java.lang.Object) boolean73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(classArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(classArray65);
        org.junit.Assert.assertNotNull(wildcardClassArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass(objArray17);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Object[] objArray25 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.toClass(objArray25);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray26);
        java.lang.Class<?> wildcardClass28 = null;
        java.lang.Class[] classArray30 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray31 = (java.lang.Class<?>[]) classArray30;
        wildcardClassArray31[0] = wildcardClass28;
        java.lang.Class[] classArray35 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray36 = (java.lang.Class<?>[]) classArray35;
        java.lang.Class<?>[] wildcardClassArray37 = null;
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray35, wildcardClassArray37);
        java.lang.Class[] classArray40 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray41 = (java.lang.Class<?>[]) classArray40;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray41, false);
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray31, wildcardClassArray41, false);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray31, true);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class<?> wildcardClass50 = null;
        java.lang.Class[] classArray52 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        wildcardClassArray53[0] = wildcardClass50;
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        java.lang.Class<?>[] wildcardClassArray59 = null;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray57, wildcardClassArray59);
        java.lang.Class[] classArray62 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray59, wildcardClassArray63, false);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray63, false);
        boolean boolean68 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray63);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray63, false);
        java.lang.Class<?>[] wildcardClassArray71 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", (java.lang.Object[]) wildcardClassArray71, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray71);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache.commons.lang3.builder", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache.commons.lang3.builder");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ClassUtils");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle", (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray22 = new float[] { 9, 4, 14, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ReferencePipeline", floatArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[9.0, 4.0, 14.0, 10.0]");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer15 = null;
        double[] doubleArray23 = new double[] { 0, 10.0f, 0.0f, (-1L), '#', 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Boolean", doubleArray23, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 10.0, 0.0, -1.0, 35.0, 10.0]");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "java.util");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "org.apache", (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, ".", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        float[] floatArray9 = new float[] { '$', 0L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "java.util.stream", floatArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[36.0, 0.0, 1.0]");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "hi!");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "commons", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "ClassUtils");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "java.util");
        java.lang.StringBuffer stringBuffer19 = null;
        int[] intArray21 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "java.util.stream", intArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.MultiLineToStringStyle", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray17 = new int[] { '$', 0, 9, 5, 4 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "org.apache.commons.lang3.builder", intArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[36, 0, 9, 5, 4]");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer14 = null;
        java.lang.Object[] objArray18 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.toClass(objArray18);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray19);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray24);
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.appendStart(stringBuffer14, (java.lang.Object) wildcardClassArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.lang3.builder" + "'", str13, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Class");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache.commons");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Itr", (short) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?> wildcardClass6 = null;
        java.lang.Class[] classArray8 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        wildcardClassArray9[0] = wildcardClass6;
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        java.lang.Class<?>[] wildcardClassArray15 = null;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray13, wildcardClassArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray19 = (java.lang.Class<?>[]) classArray18;
        boolean boolean21 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray19, false);
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray19, false);
        boolean boolean25 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray9, true);
        java.lang.Class<?>[] wildcardClassArray26 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray26);
        java.lang.String str29 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray27, "org.apache.commons.lang3");
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray27);
        java.lang.Object[] objArray34 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.toClass(objArray34);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray35);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray38, true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang" + "'", str29, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "DefaultToStringStyle");
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) toStringStyle0, "");
        java.lang.StringBuffer stringBuffer14 = null;
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "NoFieldNameToStringStyle", doubleArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.lang3.builder" + "'", str13, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ReferencePipeline.Head", doubleArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        int[] intArray8 = new int[] { 100, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "stream", intArray8, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ArrayList");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3.builder", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "String");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Class[]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray11 = new boolean[] { true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "org.apache.commons.lang3", booleanArray11, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false]");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "Class[]");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "lang3", (java.lang.Object) 5, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.lang3.builder" + "'", str8, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        double[] doubleArray9 = new double[] { '.', 10.0d, 100L, 100.0f, 14, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "ArrayList", doubleArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[46.0, 10.0, 100.0, 100.0, 14.0, 10.0]");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "NoFieldNameToStringStyle", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ReferencePipeline", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "org.apache", (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class[]");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "lang");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "hi!");
        java.lang.StringBuffer stringBuffer19 = null;
        float[] floatArray27 = new float[] { 100.0f, 10.0f, '.', '$', 0.0f, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "Boolean", floatArray27, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[100.0, 10.0, 46.0, 36.0, 0.0, 100.0]");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("org.apache", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: org.apache");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "String");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "String", (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "apache");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: apache");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object obj5 = null;
        toStringStyle0.appendStart(stringBuffer4, obj5);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList.ArrayListSpliterator", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "lang");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons.lang3", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer1, "$", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Object");
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "String");
        java.lang.StringBuffer stringBuffer19 = null;
        char[] charArray27 = new char[] { '.', ' ', '4', '.', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "java", charArray27, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), ". 4.#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), ". 4.#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[.,  , 4, ., #, 4]");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "String");
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "java");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ArrayList.ArrayListSpliterator", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str5, "ToStringStyle.DefaultToStringStyle");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray12 = new float[] { (short) 1, 12, 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList.Itr", floatArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[1.0, 12.0, 100.0]");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "ArrayList", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "lang3");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: lang3");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("java.lang", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: java.lang");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "hi!");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "Float");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray19 = new char[] { ' ', '4', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", charArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4, 4,  ]");
    }
}

