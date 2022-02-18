import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ".");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Boolean");
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "String", byteArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, 1, 10, 100, 100, 10]");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ".");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "String");
        java.lang.StringBuffer stringBuffer12 = null;
        int[] intArray15 = new int[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ReferencePipeline.Head", intArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[97]");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        toStringStyle0.appendToString(stringBuffer13, "List");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "lang");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendToString(stringBuffer19, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer22 = null;
        boolean[] booleanArray25 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "java", booleanArray25, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false]");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "java.lang");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer15 = null;
        char[] charArray20 = new char[] { '4', '$', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "DefaultToStringStyle", charArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4$ ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4$ ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, $,  ]");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, ".", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "util");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "MultiLineToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        float[] floatArray22 = new float[] { (short) -1, (-1.0f), 1L, 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Short", floatArray22, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0, 10.0, 100.0]");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        toStringStyle0.appendSuper(stringBuffer13, "ListIterator[]");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "util");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ArrayList[]", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "org");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "lang");
        java.lang.StringBuffer stringBuffer10 = null;
        float[] floatArray12 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "java.util", floatArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "commons");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ArrayList.ArrayListSpliterator", (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = null;
        boolean boolean10 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray7, wildcardClassArray9);
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        boolean boolean15 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray13, false);
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray13, false);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
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
        java.lang.Object[] objArray41 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass(objArray41);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray42);
        boolean boolean46 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray23, wildcardClassArray45);
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray19, wildcardClassArray23);
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray23);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ArrayList.ListItr");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "apache");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer15 = null;
        int[] intArray23 = new int[] { 8, 12, (byte) 10, (byte) 100, '4', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "commons", intArray23, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[8, 12, 10, 100, 52, 10]");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "AnnotatedElement[][]");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "java");
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "MultiLineToStringStyle", byteArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100, 100, -1, 0]");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Class[]");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "builder");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "stream");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle.ShortPrefixToStringStyle", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        toStringStyle0.appendToString(stringBuffer19, "Class[]");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendToString(stringBuffer22, "Float");
        java.lang.StringBuffer stringBuffer25 = null;
        char[] charArray28 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, "NoFieldNameToStringStyle", charArray28, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4]");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        boolean[] booleanArray10 = new boolean[] { true, false, false, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "", booleanArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, false, false, true, false]");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        toStringStyle0.appendToString(stringBuffer13, ".");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "Object");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "ToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendSuper(stringBuffer22, "org.apache.commons");
        java.lang.StringBuffer stringBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer25, ".", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
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
            toStringStyle0.append(stringBuffer15, "Boolean", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray30, false);
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
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "java");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        double[] doubleArray16 = new double[] { 1.0f, 2, 6, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "List", doubleArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 2.0, 6.0, 10.0]");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ReferencePipeline.Head");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ReferencePipeline.Head");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.lang.String[] strArray14 = new java.lang.String[] { "Integer", "java.lang", "ClassUtils", "$", "java.lang", ".", "Integer", "hi!", "java.util", "java.lang", "Integer", "ClassUtils", "org.apache.commons.lang3.builder", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.Class<?>> wildcardClassList17 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList15);
        java.lang.Object obj18 = null;
        boolean boolean19 = strList15.equals(obj18);
        int int20 = strList15.size();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 14 + "'", int20 == 14);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        toStringStyle0.appendSuper(stringBuffer13, "ListIterator[]");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "util");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "ToStringStyle.ShortPrefixToStringStyle", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "apache");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray20 = new float[] { 6, '.', 3, 0L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3.builder", floatArray20, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[6.0, 46.0, 3.0, 0.0, -1.0]");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = null;
        boolean boolean10 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray7, wildcardClassArray9);
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        boolean boolean15 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray13, false);
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray13, false);
        java.lang.Object[] objArray21 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass(objArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray22);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Head");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "List");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "util");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ToStringStyle.NoFieldNameToStringStyle", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
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
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray24 = new char[] { '$', '4', '$', '$', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ArrayList.Itr", charArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "$4$$ a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "$4$$ a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[$, 4, $, $,  , a]");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        toStringStyle0.appendSuper(stringBuffer16, "Boolean");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "ListIterator[]");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.lang");
        java.lang.StringBuffer stringBuffer10 = null;
        int[] intArray12 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "String", intArray12, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ".");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Boolean");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendToString(stringBuffer12, "ShortPrefixToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "", (long) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        toStringStyle0.appendToString(stringBuffer14, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer17 = null;
        toStringStyle0.appendToString(stringBuffer17, "Double");
        java.lang.StringBuffer stringBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "ToStringStyle.MultiLineToStringStyle", (double) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("ShortPrefixToStringStyle");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ShortPrefixToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ".");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "String");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ClassUtils", (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        java.lang.Class<?>[] wildcardClassArray10 = null;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray10);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray17);
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray18, "lang");
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray18);
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        java.lang.Class<?>[] wildcardClassArray26 = null;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray24, wildcardClassArray26);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray30, false);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray18, wildcardClassArray30, true);
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray18, false);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray6);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        toStringStyle0.appendToString(stringBuffer20, "Long");
        java.lang.StringBuffer stringBuffer23 = null;
        toStringStyle0.appendToString(stringBuffer23, ".");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ClassUtils", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass(objArray35);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray36);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray37);
        java.lang.Object[] objArray42 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass(objArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray43);
        java.lang.Class[] classArray46 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        boolean boolean48 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray47);
        java.lang.Object[] objArray52 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass(objArray52);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray53);
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray54, false);
        boolean boolean58 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray47, false);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray47);
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray59, true);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
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
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        char[] charArray26 = new char[] { '$', '#', ' ', '.' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "ArrayListSpliterator", charArray26, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "$# .");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "$# .");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[$, #,  , .]");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray9);
        java.lang.Object[] objArray41 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.toClass(objArray41);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray42);
        java.lang.Class[] classArray45 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray46 = (java.lang.Class<?>[]) classArray45;
        boolean boolean47 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray46);
        java.lang.Object[] objArray51 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.toClass(objArray51);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray52);
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray53, false);
        java.lang.Class[] classArray57 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray58 = (java.lang.Class<?>[]) classArray57;
        java.lang.Class<?>[] wildcardClassArray59 = null;
        boolean boolean60 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray57, wildcardClassArray59);
        java.lang.Class[] classArray62 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        boolean boolean65 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray59, wildcardClassArray63, false);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray46, wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray68 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray46);
        java.lang.Class<?>[] wildcardClassArray69 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray68);
        java.lang.String str71 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray68, "hi!");
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray68);
        boolean boolean74 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray37, wildcardClassArray68, false);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray68);
        java.lang.Class<?>[] wildcardClassArray76 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray75);
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
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(classArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertNotNull(wildcardClassArray69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.lang" + "'", str71, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertNotNull(wildcardClassArray76);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer3, "ToStringStyle.NoFieldNameToStringStyle", '$');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Double");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ReferencePipeline.Head", (float) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Class");
        java.lang.Class<?> wildcardClass12 = toStringStyle0.getClass();
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Long");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray17 = new float[] { (-1), 6 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "apache", floatArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 6.0]");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Long");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "Double");
        java.lang.StringBuffer stringBuffer16 = null;
        float[] floatArray21 = new float[] { 0.0f, 14, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ToStringStyle.DefaultToStringStyle", floatArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[0.0, 14.0, 10.0]");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Head", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        toStringStyle0.appendToString(stringBuffer22, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer25 = null;
        toStringStyle0.appendSuper(stringBuffer25, "Long");
        java.lang.StringBuffer stringBuffer28 = null;
        boolean[] booleanArray36 = new boolean[] { true, false, true, true, true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer28, "java", booleanArray36, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[true, false, true, true, true, true]");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "java.util");
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, "java.util.stream");
        java.lang.StringBuffer stringBuffer12 = null;
        char[] charArray17 = new char[] { '#', 'a', '$' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "org.apache.commons.lang3", charArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a$");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a$");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a, $]");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
            toStringStyle0.append(stringBuffer18, "Double", (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        toStringStyle0.appendToString(stringBuffer13, "commons");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "apache");
        java.lang.StringBuffer stringBuffer19 = null;
        long[] longArray25 = new long[] { 100, 'a', '$', 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "org.apache.commons.lang3.builder", longArray25, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[100, 97, 36, 10]");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ArrayList.Itr", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ArrayList/Itr");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ToStringStyle");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        float[] floatArray18 = new float[] { 10L, 4, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Itr", floatArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0, 4.0, -1.0]");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
            toStringStyle0.append(stringBuffer15, "Class[]", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.lang.String[] strArray14 = new java.lang.String[] { "Integer", "java.lang", "ClassUtils", "$", "java.lang", ".", "Integer", "hi!", "java.util", "java.lang", "Integer", "ClassUtils", "org.apache.commons.lang3.builder", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.List<java.lang.Class<?>> wildcardClassList17 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList15);
        boolean boolean18 = strList15.isEmpty();
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle19 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer20 = null;
        java.lang.Object obj21 = null;
        toStringStyle19.appendStart(stringBuffer20, obj21);
        java.lang.StringBuffer stringBuffer23 = null;
        toStringStyle19.appendSuper(stringBuffer23, "hi!");
        java.lang.StringBuffer stringBuffer26 = null;
        toStringStyle19.appendToString(stringBuffer26, "ClassUtils");
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle19, "ClassUtils");
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle19, "Class");
        java.lang.StringBuffer stringBuffer33 = null;
        toStringStyle19.appendToString(stringBuffer33, ".");
        java.lang.StringBuffer stringBuffer36 = null;
        toStringStyle19.appendSuper(stringBuffer36, "ArrayList");
        java.lang.StringBuffer stringBuffer39 = null;
        toStringStyle19.appendSuper(stringBuffer39, "ArrayList");
        boolean boolean42 = strList15.contains((java.lang.Object) toStringStyle19);
        java.lang.StringBuffer stringBuffer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle19.append(stringBuffer43, "lang3", (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(toStringStyle19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.lang3.builder" + "'", str30, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str32, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Object[] objArray37 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass(objArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray38);
        java.lang.Class<?> wildcardClass40 = null;
        java.lang.Class[] classArray42 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass40;
        java.lang.Class[] classArray47 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        java.lang.Class<?>[] wildcardClassArray49 = null;
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray47, wildcardClassArray49);
        java.lang.Class[] classArray52 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray53 = (java.lang.Class<?>[]) classArray52;
        boolean boolean55 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray53, false);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray43, wildcardClassArray53, false);
        boolean boolean59 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray38, wildcardClassArray43, true);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        java.lang.Class<?> wildcardClass62 = null;
        java.lang.Class[] classArray64 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray65 = (java.lang.Class<?>[]) classArray64;
        wildcardClassArray65[0] = wildcardClass62;
        java.lang.Class[] classArray69 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray70 = (java.lang.Class<?>[]) classArray69;
        java.lang.Class<?>[] wildcardClassArray71 = null;
        boolean boolean72 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray69, wildcardClassArray71);
        java.lang.Class[] classArray74 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray75 = (java.lang.Class<?>[]) classArray74;
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray71, wildcardClassArray75, false);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray65, wildcardClassArray75, false);
        boolean boolean80 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray61, wildcardClassArray75);
        boolean boolean82 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray75, false);
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray75);
        boolean boolean85 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray75, false);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray75);
        java.lang.Class<?>[] wildcardClassArray87 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray86);
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
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertNotNull(wildcardClassArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(classArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "commons");
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
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
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
        org.junit.Assert.assertNotNull(wildcardClassArray40);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ".");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Boolean");
        java.lang.StringBuffer stringBuffer12 = null;
        long[] longArray16 = new long[] { '#', 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Object[]", longArray16, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[35, 1]");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        java.lang.Object[] objArray33 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.toClass(objArray33);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray34);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray35);
        java.lang.Class<?>[] wildcardClassArray37 = null;
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray35, wildcardClassArray37);
        boolean boolean39 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray37);
        java.lang.Class<?>[] wildcardClassArray40 = null;
        java.lang.Object[] objArray44 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.toClass(objArray44);
        java.lang.Class<?>[] wildcardClassArray46 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray45);
        java.lang.Class<?>[] wildcardClassArray47 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray46);
        boolean boolean49 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray47, true);
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
        java.lang.Object[] objArray71 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray72 = org.apache.commons.lang3.ClassUtils.toClass(objArray71);
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray72);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray72);
        java.lang.Class<?>[] wildcardClassArray75 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray72);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray75);
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray47, wildcardClassArray75, true);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray8, wildcardClassArray47);
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
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(wildcardClassArray46);
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(classArray57);
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertNotNull(wildcardClassArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
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
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        toStringStyle0.appendToString(stringBuffer13, ".");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendToString(stringBuffer16, "Object");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendSuper(stringBuffer19, "ToStringStyle");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendSuper(stringBuffer22, "org.apache.commons");
        java.lang.StringBuffer stringBuffer25 = null;
        toStringStyle0.appendToString(stringBuffer25, "Head");
        java.lang.StringBuffer stringBuffer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer28, "java.util.stream", (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        java.lang.Object obj14 = null;
        toStringStyle0.appendStart(stringBuffer13, obj14);
        java.lang.StringBuffer stringBuffer16 = null;
        int[] intArray24 = new int[] { '.', 1, 6, 7, (byte) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Class", intArray24, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[46, 1, 6, 7, 1, 32]");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        double[] doubleArray18 = new double[] { ' ', (-1L), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache", doubleArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, -1.0, 10.0]");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "org.apache.commons.lang3");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.NoFieldNameToStringStyle", 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ClassUtils");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "ArrayList");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "AnnotatedElement[][]");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "org");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Class");
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) toStringStyle0, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "List", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str8, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        toStringStyle0.appendSuper(stringBuffer13, "java.util");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "Class", (double) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        char[] charArray21 = new char[] { ' ', '.', ' ', '#', '.', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org.apache.commons.lang3.builder", charArray21, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " . #.4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " . #.4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , .,  , #, ., 4]");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class");
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class<?>[] wildcardClassArray3 = null;
        boolean boolean4 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray1, wildcardClassArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray1);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class[] classArray8 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray9 = (java.lang.Class<?>[]) classArray8;
        java.lang.Class<?>[] wildcardClassArray10 = null;
        boolean boolean11 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray8, wildcardClassArray10);
        java.lang.Class[] classArray13 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray14 = (java.lang.Class<?>[]) classArray13;
        boolean boolean16 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray14, false);
        java.lang.Class<?>[] wildcardClassArray17 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray14);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray17);
        java.lang.String str20 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray18, "lang");
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        boolean boolean23 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray21, false);
        java.lang.Object[] objArray27 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass(objArray27);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray28);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray29);
        java.lang.String str32 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray29, "ArrayList.Itr");
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray29);
        boolean boolean35 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray29, false);
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
        java.lang.Object[] objArray57 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass(objArray57);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray58);
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray58);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray58);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray61);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray6, wildcardClassArray64, true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang" + "'", str20, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang" + "'", str32, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ListItr", doubleArray15, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        toStringStyle0.appendToString(stringBuffer13, "List");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "ArrayListSpliterator", (float) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
            toStringStyle0.append(stringBuffer13, "Integer", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        long[] longArray19 = new long[] { (-1), '$', (short) 100, 1L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.DefaultToStringStyle", longArray19, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, 36, 100, 1]");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        toStringStyle0.appendToString(stringBuffer14, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer17, "Head", 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Class[]");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "org.apache");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "java.util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "Long");
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray17 = new boolean[] { true, true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Class", booleanArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, true]");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        toStringStyle0.appendToString(stringBuffer14, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer17 = null;
        java.lang.Object obj18 = null;
        toStringStyle0.appendStart(stringBuffer17, obj18);
        java.lang.StringBuffer stringBuffer20 = null;
        boolean[] booleanArray24 = new boolean[] { false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer20, "", booleanArray24, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false]");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        java.lang.Class<?>[] wildcardClassArray57 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray49);
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray49);
        java.lang.Object[] objArray62 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.toClass(objArray62);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray63);
        java.lang.Class[] classArray66 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray67 = (java.lang.Class<?>[]) classArray66;
        boolean boolean68 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray64, wildcardClassArray67);
        java.lang.Object[] objArray72 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray73 = org.apache.commons.lang3.ClassUtils.toClass(objArray72);
        java.lang.Class<?>[] wildcardClassArray74 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray73);
        boolean boolean76 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray67, wildcardClassArray74, false);
        java.lang.Class<?>[] wildcardClassArray77 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray74);
        boolean boolean78 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray49, wildcardClassArray74);
        java.lang.Class<?>[] wildcardClassArray79 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray74);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray74);
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray80);
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
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertNotNull(wildcardClassArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray79);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
            toStringStyle0.append(stringBuffer13, "Long", (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        float[] floatArray18 = new float[] { 4, 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer14, "Boolean", floatArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str13, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[4.0, 1.0]");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray26);
        java.lang.String str30 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray26, "org.apache");
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray26);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang" + "'", str30, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray31);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "String");
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) toStringStyle0, "java");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "Float");
        java.lang.StringBuffer stringBuffer9 = null;
        boolean[] booleanArray12 = new boolean[] { false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", booleanArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ToStringStyle.DefaultToStringStyle" + "'", str5, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false]");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.SubList", (short) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        float[] floatArray10 = new float[] { 3, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer6, "java", floatArray10, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[3.0, 0.0]");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "ClassUtils", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Class");
        java.lang.StringBuffer stringBuffer12 = null;
        short[] shortArray14 = new short[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", shortArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[]");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Class[]");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer7 = null;
        short[] shortArray15 = new short[] { (short) 100, (short) -1, (short) 1, (short) 100, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "stream", shortArray15, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[100, -1, 1, 100, 100, 0]");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Class[]");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ToStringStyle.DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        char[] charArray20 = new char[] { '#', '.', '.', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "Short", charArray20, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#.. a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#.. a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, ., .,  , a]");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        toStringStyle0.appendSuper(stringBuffer18, "builder");
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        toStringStyle0.appendToString(stringBuffer19, "Class[]");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer22, "Object", (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Float");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "List");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        toStringStyle0.appendToString(stringBuffer13, "AnnotatedElement[][]");
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "NoFieldNameToStringStyle", (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        boolean boolean9 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray8);
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        java.lang.Class<?>[] wildcardClassArray14 = null;
        boolean boolean15 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray12, wildcardClassArray14);
        java.lang.Class[] classArray17 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray18, false);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray21);
        java.lang.String str24 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray22, "lang");
        java.lang.Object[] objArray28 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.toClass(objArray28);
        java.lang.Class<?>[] wildcardClassArray30 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray29);
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray31);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray32);
        java.lang.Object[] objArray37 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass(objArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray38);
        java.lang.Class[] classArray41 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray42 = (java.lang.Class<?>[]) classArray41;
        boolean boolean43 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray39, wildcardClassArray42);
        java.lang.Object[] objArray47 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray48 = org.apache.commons.lang3.ClassUtils.toClass(objArray47);
        java.lang.Class<?>[] wildcardClassArray49 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray48);
        boolean boolean51 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray49, false);
        java.lang.Class[] classArray53 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray54 = (java.lang.Class<?>[]) classArray53;
        java.lang.Class<?>[] wildcardClassArray55 = null;
        boolean boolean56 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray53, wildcardClassArray55);
        java.lang.Class[] classArray58 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray59 = (java.lang.Class<?>[]) classArray58;
        boolean boolean61 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray55, wildcardClassArray59, false);
        boolean boolean62 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray42, wildcardClassArray59);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray63);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray33, wildcardClassArray64, false);
        boolean boolean67 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray33);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray33, false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang" + "'", str24, "java.lang");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(wildcardClassArray31);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(classArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(classArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        toStringStyle0.appendSuper(stringBuffer13, "ListIterator[]");
        java.lang.StringBuffer stringBuffer16 = null;
        toStringStyle0.appendSuper(stringBuffer16, "ArrayList");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "lang3", (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "commons");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "util");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        short[] shortArray19 = new short[] { (short) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "org", shortArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10, -1, -1, 0]");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
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
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray10);
        java.lang.Class<?>[] wildcardClassArray33 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray32);
        java.lang.String str35 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray33, "org.apache.commons.lang3");
        boolean boolean37 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray4, wildcardClassArray33, false);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray33);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang" + "'", str35, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray7);
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray7, "List");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Class[]" + "'", str11, "Class[]");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ClassUtils");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendSuper(stringBuffer13, "commons");
        java.lang.StringBuffer stringBuffer16 = null;
        boolean[] booleanArray22 = new boolean[] { false, true, false, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "util", booleanArray22, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, false, false]");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Object");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "builder", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.lang.String[] strArray4 = new java.lang.String[] { ".", "NoFieldNameToStringStyle", "ToStringStyle.NoFieldNameToStringStyle", "org.apache.commons.lang3.builder" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.List<java.lang.Class<?>> wildcardClassList7 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList5);
        boolean boolean9 = wildcardClassList7.equals((java.lang.Object) (-1.0f));
        java.lang.Object[] objArray10 = wildcardClassList7.toArray();
        boolean boolean11 = wildcardClassList7.isEmpty();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClassList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null, null, null, null]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        java.lang.Object[] objArray3 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.toClass(objArray3);
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray4);
        java.lang.String str9 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray7, "Class[]");
        java.lang.Class<?>[] wildcardClassArray10 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        java.lang.Class<?>[] wildcardClassArray14 = null;
        boolean boolean15 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray12, wildcardClassArray14);
        java.lang.Class[] classArray17 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        boolean boolean20 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray14, wildcardClassArray18, false);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray18);
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray22);
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
        boolean boolean52 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray22, wildcardClassArray28, false);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        java.lang.Object[] objArray57 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray58 = org.apache.commons.lang3.ClassUtils.toClass(objArray57);
        java.lang.Class<?>[] wildcardClassArray59 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray58);
        java.lang.Class<?> wildcardClass60 = null;
        java.lang.Class[] classArray62 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray63 = (java.lang.Class<?>[]) classArray62;
        wildcardClassArray63[0] = wildcardClass60;
        java.lang.Class[] classArray67 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray68 = (java.lang.Class<?>[]) classArray67;
        java.lang.Class<?>[] wildcardClassArray69 = null;
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray67, wildcardClassArray69);
        java.lang.Class[] classArray72 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        boolean boolean75 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray69, wildcardClassArray73, false);
        boolean boolean77 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray63, wildcardClassArray73, false);
        boolean boolean79 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray58, wildcardClassArray63, true);
        java.lang.Class<?>[] wildcardClassArray80 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray58);
        java.lang.Class<?>[] wildcardClassArray81 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray80);
        boolean boolean82 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray53, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray83 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray80);
        boolean boolean84 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray7, wildcardClassArray80);
        java.lang.Class<?>[] wildcardClassArray85 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        java.lang.Class<?>[] wildcardClassArray86 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray7);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray58);
        org.junit.Assert.assertNotNull(wildcardClassArray59);
        org.junit.Assert.assertNotNull(classArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertNotNull(wildcardClassArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(classArray72);
        org.junit.Assert.assertNotNull(wildcardClassArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray80);
        org.junit.Assert.assertNotNull(wildcardClassArray81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray85);
        org.junit.Assert.assertNotNull(wildcardClassArray86);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "List");
        java.lang.StringBuffer stringBuffer9 = null;
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer9, "ArrayList.SubList", byteArray13, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1]");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "DefaultToStringStyle");
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer13 = null;
        int[] intArray17 = new int[] { 12, 3 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, ".", intArray17, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[12, 3]");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Head");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ReferencePipeline.Head");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "builder", (short) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        java.lang.Class<?>[] wildcardClassArray31 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.String str33 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray30, "hi!");
        java.lang.Object[] objArray37 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.toClass(objArray37);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray38);
        java.lang.Class<?>[] wildcardClassArray40 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray38);
        java.lang.Class[] classArray42 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        java.lang.Class<?>[] wildcardClassArray44 = null;
        boolean boolean45 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray42, wildcardClassArray44);
        java.lang.Class[] classArray47 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray48 = (java.lang.Class<?>[]) classArray47;
        boolean boolean50 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray48, false);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray48);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray51);
        java.lang.String str54 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray52, "lang");
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray52);
        boolean boolean57 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray55, false);
        java.lang.Object[] objArray61 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.toClass(objArray61);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray62);
        java.lang.Class<?>[] wildcardClassArray64 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray63);
        java.lang.String str66 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray63, "ArrayList.Itr");
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray63);
        boolean boolean69 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray40, wildcardClassArray63, false);
        boolean boolean70 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray30, wildcardClassArray63);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang" + "'", str33, "java.lang");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertNotNull(wildcardClassArray40);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(wildcardClassArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.lang" + "'", str54, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertNotNull(wildcardClassArray64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "java.lang" + "'", str66, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ".");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "String");
        java.lang.StringBuffer stringBuffer12 = null;
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", byteArray17, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, 100, 10]");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
            toStringStyle0.append(stringBuffer18, "Object", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.lang3.builder" + "'", str11, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        java.lang.String str28 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) wildcardClassArray4, "Boolean");
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray4);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang" + "'", str28, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray29);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = null;
        boolean boolean10 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray7, wildcardClassArray9);
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        boolean boolean15 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray13, false);
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray13, false);
        java.lang.Object[] objArray21 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.toClass(objArray21);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray22);
        java.lang.Class<?>[] wildcardClassArray25 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray22);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray25);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray27);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "Class", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
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
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) wildcardClassArray11, "lang");
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray11);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray11);
        java.lang.Class<?>[] wildcardClassArray16 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray15);
        java.lang.Class<?> wildcardClass17 = null;
        java.lang.Class[] classArray19 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        wildcardClassArray20[0] = wildcardClass17;
        java.lang.Class[] classArray24 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray25 = (java.lang.Class<?>[]) classArray24;
        java.lang.Class<?>[] wildcardClassArray26 = null;
        boolean boolean27 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray24, wildcardClassArray26);
        java.lang.Class[] classArray29 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        boolean boolean32 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray26, wildcardClassArray30, false);
        boolean boolean34 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray20, wildcardClassArray30, false);
        java.lang.Class<?>[] wildcardClassArray35 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray36 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray38 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray30);
        java.lang.Class<?>[] wildcardClassArray39 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray30);
        boolean boolean41 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray15, wildcardClassArray39, true);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang" + "'", str13, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(wildcardClassArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArray36);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        java.lang.Object obj2 = null;
        toStringStyle0.appendStart(stringBuffer1, obj2);
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ListItr");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.ListItr", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Head");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ArrayList.SubList", (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        java.lang.Class<?> wildcardClass0 = null;
        java.lang.Class[] classArray2 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray3 = (java.lang.Class<?>[]) classArray2;
        wildcardClassArray3[0] = wildcardClass0;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class<?>[] wildcardClassArray9 = null;
        boolean boolean10 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray7, wildcardClassArray9);
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        boolean boolean15 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray13, false);
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray3, wildcardClassArray13, false);
        java.lang.Class<?>[] wildcardClassArray18 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray19 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray20 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        java.lang.Class<?>[] wildcardClassArray21 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Object");
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "lang", (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "ToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "Float");
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "Object[]", (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "hi!");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, ".");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "Head");
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.ShortPrefixToStringStyle", (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, ".");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Itr");
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", obj14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        java.lang.Class<?>[] wildcardClassArray0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray5 = org.apache.commons.lang3.ClassUtils.toClass(objArray4);
        java.lang.Class<?>[] wildcardClassArray6 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray5);
        java.lang.Class<?> wildcardClass7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray10 = (java.lang.Class<?>[]) classArray9;
        wildcardClassArray10[0] = wildcardClass7;
        java.lang.Class[] classArray14 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray15 = (java.lang.Class<?>[]) classArray14;
        java.lang.Class<?>[] wildcardClassArray16 = null;
        boolean boolean17 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray14, wildcardClassArray16);
        java.lang.Class[] classArray19 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray20 = (java.lang.Class<?>[]) classArray19;
        boolean boolean22 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray16, wildcardClassArray20, false);
        boolean boolean24 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray10, wildcardClassArray20, false);
        boolean boolean26 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray5, wildcardClassArray10, true);
        java.lang.Class<?>[] wildcardClassArray27 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray5);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray28);
        boolean boolean31 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray0, wildcardClassArray28, false);
        java.lang.Class<?>[] wildcardClassArray32 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray28);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertNotNull(wildcardClassArray10);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(wildcardClassArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray32);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "commons");
        java.lang.StringBuffer stringBuffer7 = null;
        float[] floatArray9 = new float[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "lang3", floatArray9, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        toStringStyle0.appendToString(stringBuffer15, ".");
        java.lang.StringBuffer stringBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer18, "ListItr", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ArrayList");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendToString(stringBuffer6, "ToStringStyle.DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendToString(stringBuffer9, "ToStringStyle");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "Long", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        java.lang.Object obj5 = null;
        toStringStyle0.appendStart(stringBuffer4, obj5);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.Object obj8 = null;
        toStringStyle0.appendStart(stringBuffer7, obj8);
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "java");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "Class[]");
        java.lang.StringBuffer stringBuffer16 = null;
        char[] charArray21 = new char[] { 'a', '.', '4' };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "java.lang", charArray21, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a.4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a.4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, ., 4]");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        toStringStyle0.appendToString(stringBuffer16, "AnnotatedElement[][]");
        java.lang.StringBuffer stringBuffer19 = null;
        toStringStyle0.appendToString(stringBuffer19, "Boolean");
        java.lang.StringBuffer stringBuffer22 = null;
        toStringStyle0.appendToString(stringBuffer22, "Object");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.NO_FIELD_NAMES_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "commons");
        java.lang.StringBuffer stringBuffer7 = null;
        boolean[] booleanArray9 = new boolean[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "ArrayList.ArrayListSpliterator", booleanArray9, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[]");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "org.apache.commons.lang3.builder");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendSuper(stringBuffer10, "apache");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "Double");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class");
        java.lang.StringBuffer stringBuffer13 = null;
        toStringStyle0.appendToString(stringBuffer13, "commons");
        java.lang.StringBuffer stringBuffer16 = null;
        double[] doubleArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer16, "org.apache.commons", doubleArray18, (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
            toStringStyle0.append(stringBuffer10, "org.apache.commons", (long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        toStringStyle0.appendSuper(stringBuffer13, "$");
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ".");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Boolean");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer15, "AnnotatedElement[][]", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        toStringStyle0.appendToString(stringBuffer22, "ArrayList.ListItr");
        java.lang.StringBuffer stringBuffer25 = null;
        toStringStyle0.appendSuper(stringBuffer25, "Long");
        java.lang.StringBuffer stringBuffer28 = null;
        toStringStyle0.appendToString(stringBuffer28, "lang");
        java.lang.StringBuffer stringBuffer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer31, "Boolean", '.');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
            toStringStyle0.append(stringBuffer19, "java", 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendSuper(stringBuffer3, "java.lang");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, "java.util.stream");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "ArrayList");
        java.lang.StringBuffer stringBuffer12 = null;
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
        java.lang.Class<?>[] wildcardClassArray41 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray40);
        java.lang.Class<?>[] wildcardClassArray42 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray41);
        java.lang.Class<?>[] wildcardClassArray43 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray44 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray42);
        java.lang.Class<?>[] wildcardClassArray45 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray44);
        java.lang.Object[] objArray49 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray50 = org.apache.commons.lang3.ClassUtils.toClass(objArray49);
        java.lang.Class<?>[] wildcardClassArray51 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray52 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray53 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray54 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray50);
        java.lang.Class<?>[] wildcardClassArray55 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray54);
        java.lang.Object[] objArray59 = new java.lang.Object[] { '.', ' ', 100.0f };
        java.lang.Class<?>[] wildcardClassArray60 = org.apache.commons.lang3.ClassUtils.toClass(objArray59);
        java.lang.Class<?>[] wildcardClassArray61 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray62 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray60);
        java.lang.Class<?>[] wildcardClassArray63 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray60);
        boolean boolean64 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray54, wildcardClassArray63);
        java.lang.Class<?>[] wildcardClassArray65 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray54);
        boolean boolean66 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray44, wildcardClassArray65);
        java.lang.Class<?>[] wildcardClassArray67 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) wildcardClassArray65);
        java.lang.String str69 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) wildcardClassArray65, "ArrayList.ArrayListSpliterator");
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "", (java.lang.Object) wildcardClassArray65, (java.lang.Boolean) true);
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
        org.junit.Assert.assertNotNull(wildcardClassArray41);
        org.junit.Assert.assertNotNull(wildcardClassArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertNotNull(wildcardClassArray44);
        org.junit.Assert.assertNotNull(wildcardClassArray45);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray50);
        org.junit.Assert.assertNotNull(wildcardClassArray51);
        org.junit.Assert.assertNotNull(wildcardClassArray52);
        org.junit.Assert.assertNotNull(wildcardClassArray53);
        org.junit.Assert.assertNotNull(wildcardClassArray54);
        org.junit.Assert.assertNotNull(wildcardClassArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[.,  , 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[.,  , 100.0]");
        org.junit.Assert.assertNotNull(wildcardClassArray60);
        org.junit.Assert.assertNotNull(wildcardClassArray61);
        org.junit.Assert.assertNotNull(wildcardClassArray62);
        org.junit.Assert.assertNotNull(wildcardClassArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Class[]" + "'", str69, "Class[]");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Object");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ArrayList.Itr");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "NoFieldNameToStringStyle");
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
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "DefaultToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        boolean[] booleanArray18 = new boolean[] { false, false, true, true, true, false };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "Class", booleanArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, true, false]");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendToString(stringBuffer1, "Object");
        java.lang.StringBuffer stringBuffer4 = null;
        short[] shortArray12 = new short[] { (short) 10, (short) 0, (short) 0, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer4, "apache", shortArray12, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[10, 0, 0, 100, 1, 10]");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "MultiLineToStringStyle", true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: MultiLineToStringStyle");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendSuper(stringBuffer7, "ArrayList.ArrayListSpliterator");
        java.lang.StringBuffer stringBuffer10 = null;
        long[] longArray16 = new long[] { 10, ' ', 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ListItr", longArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, 32, 0, 100]");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "Boolean");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "ToStringStyle.NoFieldNameToStringStyle");
        java.lang.StringBuffer stringBuffer10 = null;
        toStringStyle0.appendToString(stringBuffer10, "Class");
        java.lang.StringBuffer stringBuffer13 = null;
        boolean[] booleanArray16 = new boolean[] { true };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "ToStringStyle.ShortPrefixToStringStyle", booleanArray16, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true]");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "Integer");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendToString(stringBuffer4, "ArrayList");
        java.lang.StringBuffer stringBuffer7 = null;
        toStringStyle0.appendToString(stringBuffer7, "String");
        java.lang.StringBuffer stringBuffer10 = null;
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer10, "ToStringStyle.MultiLineToStringStyle", byteArray18, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 1, -1, 1, 100, 100]");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        float[] floatArray19 = new float[] { (short) 1, 0L, 10, 3 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer13, "$", floatArray19, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[1.0, 0.0, 10.0, 3.0]");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        toStringStyle0.appendSuper(stringBuffer16, "Boolean");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer19, "org.apache", (double) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        byte[] byteArray14 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer12, "ListItr", byteArray14, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ToStringStyle.MultiLineToStringStyle" + "'", str11, "ToStringStyle.MultiLineToStringStyle");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) toStringStyle0, ".");
        java.lang.StringBuffer stringBuffer3 = null;
        toStringStyle0.appendToString(stringBuffer3, "ListItr");
        java.lang.StringBuffer stringBuffer6 = null;
        toStringStyle0.appendSuper(stringBuffer6, ".");
        java.lang.StringBuffer stringBuffer9 = null;
        toStringStyle0.appendSuper(stringBuffer9, "Boolean");
        java.lang.StringBuffer stringBuffer12 = null;
        toStringStyle0.appendSuper(stringBuffer12, "");
        java.lang.StringBuffer stringBuffer15 = null;
        toStringStyle0.appendSuper(stringBuffer15, "lang");
        java.lang.StringBuffer stringBuffer18 = null;
        toStringStyle0.appendSuper(stringBuffer18, "Boolean");
        java.lang.StringBuffer stringBuffer21 = null;
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer21, "ShortPrefixToStringStyle", byteArray25, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.lang3.builder" + "'", str2, "org.apache.commons.lang3.builder");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 1]");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle0 = org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
        java.lang.StringBuffer stringBuffer1 = null;
        toStringStyle0.appendSuper(stringBuffer1, "lang");
        java.lang.StringBuffer stringBuffer4 = null;
        toStringStyle0.appendSuper(stringBuffer4, "$");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            toStringStyle0.append(stringBuffer7, "Float", (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(toStringStyle0);
    }
}

