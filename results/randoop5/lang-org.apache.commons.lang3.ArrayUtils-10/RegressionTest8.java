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
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray1, annotatedElementArray2, annotatedElementArray3 };
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray7 = org.apache.commons.lang3.ArrayUtils.subarray(annotatedElementArray4, 0, (-1));
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray8 = org.apache.commons.lang3.ArrayUtils.add(annotatedElementArray0, annotatedElementArray4);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) annotatedElementArray4);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[[], [], []]");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9, 0L);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9, (long) 5);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, 0L);
        long[] longArray20 = new long[] { 100L, 'a' };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.subarray(longArray20, (int) (short) 10, 100);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray23);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray23, (long) 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray26, (long) 4, (int) '4');
        long[] longArray33 = new long[] { 10L, 100L, '#' };
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray33);
        java.lang.Long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toObject(longArray33);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray26, longArray33);
        java.lang.Long[] longArray37 = org.apache.commons.lang3.ArrayUtils.toObject(longArray33);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray37);
        java.lang.Long[] longArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray37);
        java.lang.Long[] longArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray39);
        java.lang.Long[] longArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray40);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray41, (long) '#');
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray43);
        long[] longArray47 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray48 = org.apache.commons.lang3.ArrayUtils.toObject(longArray47);
        long[] longArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray47, 10L);
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray47, (long) 1, 0);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray47);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.addAll(longArray43, longArray47);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray15, longArray55);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[100]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[10, 100, 35, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 10, 1);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, 2);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 4);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.remove(intArray8, (int) (byte) 0);
        java.lang.String str13 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray8, "0.0");
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(intArray8, 4);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        java.lang.Class<?> wildcardClass17 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{35,0}" + "'", str13, "{35,0}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (int) (short) 100, 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray2, 10);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, 9, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Character[] charArray14 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray8, (java.lang.Object) charArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray0, (java.lang.Object[]) byteArray8);
        int[] intArray21 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray22 = org.apache.commons.lang3.ArrayUtils.toObject(intArray21);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.clone(intArray21);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray23, intArray24);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray25);
        java.io.Serializable[] serializableArray27 = org.apache.commons.lang3.ArrayUtils.removeElement((java.io.Serializable[]) byteArray8, (java.lang.Object) intArray26);
        long[] longArray29 = new long[] { ' ' };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray29);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray31);
        long[] longArray35 = new long[] { 100L, 'a' };
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.subarray(longArray35, (int) (short) 10, 100);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray38);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray38, (long) 0);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray31, longArray38);
        java.lang.Long[] longArray43 = org.apache.commons.lang3.ArrayUtils.toObject(longArray38);
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.subarray(longArray38, (int) (byte) -1, 1);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.add(longArray46, 0, (long) 10);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray46, (long) (short) 0);
        long[] longArray54 = new long[] { 100L, 'a' };
        long[] longArray57 = org.apache.commons.lang3.ArrayUtils.subarray(longArray54, (int) (short) 10, 100);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray57);
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray57, (long) 0);
        java.lang.Long[] longArray61 = org.apache.commons.lang3.ArrayUtils.toObject(longArray60);
        long[] longArray63 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray61, 0L);
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray61);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray61, (long) (byte) 10);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray46, longArray66);
        long[] longArray68 = org.apache.commons.lang3.ArrayUtils.clone(longArray66);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) serializableArray27, (java.lang.Object) longArray68);
        int int71 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray68, (long) (short) 1);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray68);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray68, (long) 2, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35, 0]");
        org.junit.Assert.assertNotNull(serializableArray27);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[32]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[32]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray54), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray27, (int) '4', (int) (byte) 1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, 0, (double) ' ');
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray27);
        java.lang.Double[] doubleArray39 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray39);
        java.lang.Long[] longArray41 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray39, (java.lang.Object) longArray41, (int) (short) 100);
        java.lang.Double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray39);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray39);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray39, (double) 100.0f);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray34, doubleArray47);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray47, (double) (-1), (int) (short) 10);
        double[] doubleArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray47, (double) 5);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray53);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray7);
        double[] doubleArray17 = new double[] { (short) 100, 1, (-1.0d) };
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray17, (double) 0.0f, (int) (short) 0);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray17, (double) (byte) 10);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) boolean13, (java.lang.Object) doubleArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray17);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) 10L);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray17, (double) (-1L), (double) ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) (short) 0, (int) (byte) 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 10, 0);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray7, (float) 'a');
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, (int) (short) 1);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray21);
        java.lang.Float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray21);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray21, 10.0f, (int) (short) 100);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) 100);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 100);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray14, (byte) 0);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray14, (byte) 10);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray24 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray24, (byte) -1);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray26);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray26, (byte) 100);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray19, byteArray29);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray14, byteArray29);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.clone(byteArray31);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.add(byteArray32, (int) (short) 1, (byte) 0);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray32, (byte) 100);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray32);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains(byteArray32, (byte) 1);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray32, 0, (int) '#');
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray49, (byte) 0);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.add(byteArray49, (byte) 10);
        byte[] byteArray54 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray59 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray59, (byte) -1);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray61);
        byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.add(byteArray61, (byte) 100);
        byte[] byteArray65 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray54, byteArray64);
        byte[] byteArray66 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray49, byteArray64);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray49);
        byte[] byteArray68 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray69 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray68);
        boolean boolean70 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray68);
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray68, (byte) 0);
        java.lang.Byte[] byteArray73 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray68);
        byte[] byteArray74 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray49, byteArray68);
        byte[] byteArray76 = org.apache.commons.lang3.ArrayUtils.add(byteArray49, (byte) 100);
        int int78 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray76, (byte) 0);
        byte[] byteArray80 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray76, (byte) 10);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray43, byteArray76);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[-1, 1, 10, 0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[0, 1, 100, 100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 4 + "'", int78 == 4);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[0, 1, 100, 100, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) (byte) 1, (int) (byte) 10);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) 10);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 10, (int) (byte) 100);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 1);
        int[] intArray7 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray7);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray8, (int) 'a');
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.clone(intArray10);
        java.lang.Integer[] intArray12 = org.apache.commons.lang3.ArrayUtils.toObject(intArray11);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.add(intArray11, 2, (int) (short) 100);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray11);
        int[] intArray19 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray20 = org.apache.commons.lang3.ArrayUtils.toObject(intArray19);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray20, (int) 'a');
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.clone(intArray22);
        java.lang.Integer[] intArray24 = org.apache.commons.lang3.ArrayUtils.toObject(intArray23);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.add(intArray23, 2, (int) (short) 100);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray27);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray28);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray28, 0, 2);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray28);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 0, 100]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[35, 0, 35, 0, 100]");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ArrayUtils.toArray((java.lang.Object[]) intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        int[] intArray12 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray13 = org.apache.commons.lang3.ArrayUtils.toObject(intArray12);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray13, (int) 'a');
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray13, (int) '#');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray17);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.add(intArray17, (int) (byte) 0, 1);
        java.lang.Integer[] intArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray22, 5);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.subarray(intArray24, 3, (int) 'a');
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.add(intArray27, (int) (byte) 0, 10);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray27);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray17, intArray27);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, (int) (byte) 0);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray9, intArray17);
        java.lang.Integer[] intArray36 = org.apache.commons.lang3.ArrayUtils.toObject(intArray17);
        java.lang.Integer[] intArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[35, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0, 35]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        double[] doubleArray4 = new double[] { (byte) 1, (byte) 10, 4, (-1.0f) };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 1L, (double) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) 100.0f, (double) (byte) 10);
        double[] doubleArray14 = new double[] { (short) 100, 1, (-1.0d) };
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray14, (double) 0.0f, (int) (short) 0);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray14, 0.0d, 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray14, (double) (byte) 10);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray14, (double) '4', (int) (short) 10);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray14);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray26);
        double[] doubleArray31 = new double[] { 10.0f, (short) 10, 'a' };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.add(doubleArray31, (double) 100L);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray37);
        double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray37, (double) 100.0f);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray37);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray26, doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 10.0, 4.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        long[] longArray1 = new long[] { 1L };
        long[][] longArray2 = new long[][] { longArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        long[][] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, '#');
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a', (int) (byte) 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, 'a');
        java.lang.Byte[] byteArray19 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray19, (byte) -1);
        java.lang.Byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray19);
        java.lang.Character[] charArray28 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray28);
        java.lang.Character[] charArray30 = org.apache.commons.lang3.ArrayUtils.toObject(charArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray22, (java.lang.Object) charArray29);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.subarray(charArray29, (int) (short) 10, 100);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray34, '#');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.clone(charArray34);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.addAll(charArray9, charArray34);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray38);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, #]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, #]");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) (byte) 1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray15);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray16, (short) 10);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray12, shortArray16);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (short) (byte) -1);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(shortArray19, (short) 1);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.remove(shortArray19, 4);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 100, 1, -1, 100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1, 100, 1, -1, 1]");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        long[] longArray2 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toObject(longArray2);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, 10L);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray6, (long) (byte) -1, (-1));
        long[] longArray12 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray13 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray12, 10L);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray12);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray16, 1L);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray16);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[100]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[100, 10, 100]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[100, 10, 100]");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray3, (int) (short) 0, 100);
        long[] longArray12 = new long[] { ' ' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray12);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.addAll(longArray12, longArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray10, longArray15);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray15, 1L);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.subarray(longArray19, (int) (byte) 10, 3);
        long[] longArray29 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(longArray29, (long) 0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(longArray29, 0L);
        long[] longArray36 = new long[] { 100L, 'a' };
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.subarray(longArray36, (int) (short) 10, 100);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray39);
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray39, (long) 0);
        long[] longArray45 = org.apache.commons.lang3.ArrayUtils.subarray(longArray42, (-1), 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray42);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.subarray(longArray42, (int) (byte) 0, 100);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray42, (long) 1);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.addAll(longArray29, longArray42);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray22, longArray29);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray22);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.clone(longArray22);
        long[] longArray58 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray59 = org.apache.commons.lang3.ArrayUtils.toObject(longArray58);
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray58, 10L);
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray61);
        long[] longArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray61);
        long[] longArray64 = org.apache.commons.lang3.ArrayUtils.clone(longArray63);
        long[] longArray65 = org.apache.commons.lang3.ArrayUtils.addAll(longArray55, longArray63);
        long[] longArray68 = new long[] { 100L, 'a' };
        long[] longArray71 = org.apache.commons.lang3.ArrayUtils.subarray(longArray68, (int) (short) 10, 100);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray71);
        long[] longArray74 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray71, (long) 0);
        java.lang.Long[] longArray75 = org.apache.commons.lang3.ArrayUtils.toObject(longArray74);
        long[] longArray76 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray75);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray76);
        long[] longArray78 = org.apache.commons.lang3.ArrayUtils.addAll(longArray55, longArray76);
        int int80 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray78, (long) 6);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[32]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[32]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[]");
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[100]");
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[100]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[100]");
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray64), "[100]");
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray65), "[100]");
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray68), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray74), "[]");
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray76), "[]");
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray78), "[]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray12 = new boolean[] { false, true, true, false };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true, 10);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, false);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray18);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray21, true);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray21, true);
        boolean[] booleanArray30 = new boolean[] { false, true, true, false };
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray30, true, 10);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray30, (int) (short) -1, (int) '#');
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray30);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray21, booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray27);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) (byte) 100, (double) 0.0f);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray27);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray27, (double) (short) 100);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, 0, (double) (short) -1);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray38, (double) 10.0f, (double) 10.0f);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray38, 1.0d, 3, (double) ' ');
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray38, 10, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0, 100.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 1.0, 100.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray7 = new long[] { 100L, 'a' };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (short) 10, 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray10);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray10, (long) 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray3, longArray10);
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toObject(longArray10);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray10, (int) (byte) -1, 1);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.add(longArray18, 0, (long) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray18, (long) (short) 0);
        long[] longArray26 = new long[] { 100L, 'a' };
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.subarray(longArray26, (int) (short) 10, 100);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray29);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray29, (long) 0);
        java.lang.Long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toObject(longArray32);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33, 0L);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33, (long) (byte) 10);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray18, longArray38);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.clone(longArray38);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray40);
        long[] longArray45 = new long[] { 10L, 100L, '#' };
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray45);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray45, (long) (short) 0, (-1));
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.subarray(longArray45, (int) '#', (int) (short) 10);
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray41, longArray45);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[]");
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[10, 100, 35]");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.io.Serializable[] serializableArray5 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[]) doubleArray1, (int) '#', 1);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        float[] floatArray9 = new float[] { (-1L), (byte) 1 };
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray9, (float) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.clone(floatArray14);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) '#', (int) 'a');
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.remove(floatArray14, (int) (byte) 0);
        float[] floatArray23 = new float[] { (-1L), (byte) 1 };
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, (float) (byte) 10);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.clone(floatArray28);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray28, (int) '#', (int) 'a');
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray28);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.remove(floatArray28, 0);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray28);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray36);
        float[] floatArray40 = new float[] { (-1L), (byte) 1 };
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray40, (float) (byte) 10);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray40, (float) (byte) -1, (int) '#');
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray40);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray46, 0.0f, (int) (byte) -1);
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray36, floatArray46);
        java.lang.Float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray50);
        java.lang.Float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray51);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) doubleArray6, (java.lang.Object[]) floatArray51);
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray51);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(serializableArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[-1.0, 1.0, -1.0, -1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[-1.0, 1.0, -1.0, -1.0, 1.0, -1.0, 1.0]");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.lang.Double[][][] doubleArray0 = new java.lang.Double[][][] {};
        java.lang.Double[][][] doubleArray1 = new java.lang.Double[][][] {};
        java.lang.Double[][][] doubleArray2 = new java.lang.Double[][][] {};
        java.lang.Double[][][][] doubleArray3 = new java.lang.Double[][][][] { doubleArray0, doubleArray1, doubleArray2 };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray3);
        java.io.Serializable[][][] serializableArray7 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[][][]) doubleArray3, (int) '#', (int) (short) 100);
        java.lang.Character[] charArray13 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) serializableArray7, (java.lang.Object) charArray15, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(serializableArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, 'a');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray4);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, false, 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray4, false, (int) 'a');
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, false, (int) (short) 100);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, false, 8);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray12 = new boolean[] { false, true, true, false };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true, 10);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, false);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray18);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, true);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray21, true);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray21, true);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray25, true, (int) 'a');
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 7);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0]");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) (short) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray0);
        java.lang.Long[] longArray4 = org.apache.commons.lang3.ArrayUtils.toObject(longArray0);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, 0, (-1));
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 5);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 100);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (int) ' ');
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray4, (int) (short) 10);
        int[] intArray13 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray14 = org.apache.commons.lang3.ArrayUtils.toObject(intArray13);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray14, (int) 'a');
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.clone(intArray16);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.toObject(intArray17);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.add(intArray17, 2, (int) (short) 100);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray21);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray22, 0, 2);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray22);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[5]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[5, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[5, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[5, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[5, 100, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 0, 100]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[5, 100, 35, 0, 100]");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.toObject(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 2, (int) (short) 100);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, 100, (int) '4');
        int[] intArray16 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray17 = org.apache.commons.lang3.ArrayUtils.toObject(intArray16);
        int[] intArray20 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.toObject(intArray20);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray21, (int) 'a');
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.clone(intArray23);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray16, intArray23);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.addAll(intArray6, intArray23);
        int[] intArray29 = new int[] { (byte) 10, 1 };
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray29, (int) (short) 100, 100);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray29);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray29, (int) (short) 100, 0);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.add(intArray29, (int) (short) 1);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.addAll(intArray23, intArray38);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.clone(intArray38);
        java.lang.Integer[] intArray41 = org.apache.commons.lang3.ArrayUtils.toObject(intArray38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 0, 35, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35, 0, 35, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[35, 0, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray8);
        int[] intArray12 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray13 = org.apache.commons.lang3.ArrayUtils.toObject(intArray12);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray13, (int) 'a');
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.clone(intArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray16, (int) (short) 1, 0);
        int[] intArray22 = new int[] { (byte) 10, 1 };
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray22, (int) (short) 100, 100);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray22);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray22, (int) 'a');
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray16, intArray28);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.addAll(intArray8, intArray16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[35, 0, 35, 0]");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray8, (short) (byte) -1, (int) '#');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) -1);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray16, (int) (byte) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.remove(shortArray19, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1]");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) -1 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        java.lang.Object[] objArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) shortArray3);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, -1]");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (short) 1, (float) (short) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray8, (float) 6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, (float) ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.lang.Byte[] byteArray1 = new java.lang.Byte[] { (byte) -1 };
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1, (byte) 1);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) -1, (int) (byte) 1);
        java.lang.Character[] charArray17 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray18);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 'a');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = org.apache.commons.lang3.ArrayUtils.remove(charArray22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, a]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4]");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) (short) 0, (int) (short) -1, (double) '4');
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (double) 5);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 10.0f, 8, (double) 1.0f);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray27, (double) 1L, (double) 2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        long[] longArray1 = new long[] { 1L };
        long[][] longArray2 = new long[][] { longArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        long[][] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.subarray(charArray9, (int) ' ', (int) '#');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray3);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (-1L), (double) 8);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        java.lang.Byte[] byteArray24 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray24, (byte) -1);
        java.lang.Byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray24);
        long[] longArray30 = new long[] { 100L, 'a' };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.subarray(longArray30, (int) (short) 10, 100);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray33);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray33, (long) 0);
        java.lang.Long[] longArray37 = org.apache.commons.lang3.ArrayUtils.toObject(longArray36);
        java.io.Serializable[] serializableArray38 = org.apache.commons.lang3.ArrayUtils.removeElement((java.io.Serializable[]) byteArray24, (java.lang.Object) longArray37);
        java.lang.Double[] doubleArray43 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray43);
        double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray44, (double) 1);
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray37, (java.lang.Object) doubleArray46);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) doubleArray3, (java.lang.Object) longArray37);
        double[] doubleArray50 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 1.0, -1.0, 100.0]");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, (int) (short) 1);
        int[] intArray9 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray10 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10, (int) 'a');
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray13, (int) (short) 1, 0);
        int[] intArray19 = new int[] { (byte) 10, 1 };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray19, (int) (short) 100, 100);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray19);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray19, (int) 'a');
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray13, intArray25);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.subarray(intArray13, 3, (int) (short) -1);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.add(intArray13, 2);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.addAll(intArray6, intArray13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35, 0, 2]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35, 0]");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Long[] longArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray4, (java.lang.Object) longArray6, (int) (short) 100);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray9, (long) (short) 0);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray9, 5, 10);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray14, 0, (long) (short) -1);
        java.lang.Long[] longArray18 = new java.lang.Long[] {};
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray18);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.subarray(longArray19, (int) (short) 100, (int) (byte) 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, (long) (byte) 100, (int) (short) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray19);
        java.lang.Long[] longArray27 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray27);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray27, (long) 'a');
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray19, longArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray17, longArray30);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[-1]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) 4, (int) '4');
        long[] longArray15 = new long[] { 10L, 100L, '#' };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray15);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray15);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.clone(longArray15);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10, 100, 35]");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray5);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray24);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray24, (byte) 0);
        java.lang.Byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray24);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray24);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 100);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) -1);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 1, 100, 100, 0, 100]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray8, (float) (byte) 100, (-1));
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Character[] charArray14 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray8, (java.lang.Object) charArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray0, (java.lang.Object[]) byteArray8);
        int[] intArray21 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray22 = org.apache.commons.lang3.ArrayUtils.toObject(intArray21);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.clone(intArray21);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.addAll(intArray23, intArray24);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray25);
        java.io.Serializable[] serializableArray27 = org.apache.commons.lang3.ArrayUtils.removeElement((java.io.Serializable[]) byteArray8, (java.lang.Object) intArray26);
        boolean[] booleanArray32 = new boolean[] { false, true, true, false };
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray32, true, 10);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.add(booleanArray32, false);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray37);
        boolean[] booleanArray44 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.add(booleanArray44, true);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray37, booleanArray46);
        java.lang.Boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray46);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray48, true);
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray48);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray8, (java.lang.Object[]) booleanArray48);
        boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray48);
        boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray48);
        java.lang.Boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray48);
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray48);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35, 0]");
        org.junit.Assert.assertNotNull(serializableArray27);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[false, false, true, true, false, true]");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray9, (-1.0f));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 1);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, 10.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 3, 100, (double) (byte) 0);
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) 0.0f, (int) (short) 0);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray20, (double) (byte) 10);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray20);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.add(doubleArray26, 0, (double) (byte) 100);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.add(doubleArray26, 3, (-1.0d));
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray12, doubleArray32);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, (double) 100.0f);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (-1.0f));
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray12);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 1.0, -1.0, 10.0, 100.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray9);
        java.lang.Boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray9);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray11, true);
        java.lang.Boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray11);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray14, false);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17, true);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray17);
        byte[] byteArray23 = new byte[] { (byte) 10 };
        byte[] byteArray25 = new byte[] { (byte) 10 };
        byte[][] byteArray26 = new byte[][] { byteArray23, byteArray25 };
        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray32, (byte) 0);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.add(byteArray32, (byte) 10);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray32, (byte) 100);
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.clone(byteArray32);
        byte[][] byteArray40 = org.apache.commons.lang3.ArrayUtils.add(byteArray26, byteArray39);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.add(byteArray39, 5, (byte) 0);
        java.lang.Byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray49 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray49, (byte) -1);
        java.lang.Byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray49);
        java.lang.Character[] charArray58 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray58);
        java.lang.Character[] charArray60 = org.apache.commons.lang3.ArrayUtils.toObject(charArray59);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray52, (java.lang.Object) charArray59);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray44, (java.lang.Object[]) byteArray52);
        java.lang.Byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray44);
        byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray63);
        byte[] byteArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray63, (byte) -1);
        byte[] byteArray67 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray39, byteArray66);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray17, (java.lang.Object) byteArray66, 1);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 1, 100, 100, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[]");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        long[] longArray1 = new long[] { 1L };
        long[][] longArray2 = new long[][] { longArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        long[][] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, '#');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, '4');
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray16, (short) 0);
        java.lang.Short[] shortArray22 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray22);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray16, shortArray23);
        java.lang.Short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray25);
        java.lang.Short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray25);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray5, (java.lang.Object) shortArray25, (int) (short) 10);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[-1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '#');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{#,#}" + "'", str11, "{#,#}");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray4, 10L, (int) '#');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray7);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, false, (int) (byte) 0);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 5);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 3, (int) 'a');
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray5, (int) (byte) 0, 10);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray8, 4);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, 2, (short) 100);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, 2, (short) (byte) -1);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray12, (short) (byte) 1);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray14, (int) (short) 10, 0);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray17, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, -1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1, 100, -1, 100]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[]");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        java.lang.Character[] charArray13 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray7, (java.lang.Object) charArray14);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.subarray(charArray14, (int) (short) 10, 100);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, '#');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.clone(charArray19);
        java.lang.Byte[] byteArray27 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray27, (byte) -1);
        java.lang.Byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        java.lang.Character[] charArray36 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray36);
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.toObject(charArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray30, (java.lang.Object) charArray37);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.subarray(charArray37, (int) (short) 10, 100);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray42, '#');
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.clone(charArray42);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray42);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray42);
        char[] charArray50 = org.apache.commons.lang3.ArrayUtils.subarray(charArray42, 1, (int) ' ');
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.clone(charArray50);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray50, ' ', 100);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 100, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, 8, 7);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray27, (int) '4', (int) (byte) 1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, 0, (double) ' ');
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, (double) 10L);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) '4');
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        double[] doubleArray5 = new double[] { (short) 100, 1, (-1.0d) };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 0.0f, (int) (short) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, 0.0d, 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (byte) 10);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) '4', (int) (short) 10);
        double[] doubleArray20 = new double[] { (short) 100, 1, (-1.0d) };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) 0.0f, (int) (short) 0);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, 0.0d, 10);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) (byte) 10);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray5, doubleArray20);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray29, (int) '4', (int) (byte) 1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray1, doubleArray32);
        java.lang.Double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray32);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray32, (double) (short) -1);
        java.lang.Double[] doubleArray38 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray38);
        java.lang.Double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray39);
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray39);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray32, doubleArray41);
        double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray41);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0]");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 100);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray13, (byte) 0);
        java.lang.Byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray13);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, -1, -1, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1, 100, -1]");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) 4, (int) '4');
        long[] longArray15 = new long[] { 10L, 100L, '#' };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray15);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray15);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toObject(longArray15);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19);
        java.lang.Long[] longArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        java.lang.Long[] longArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray21);
        java.lang.Long[] longArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray22);
        int[] intArray26 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray27 = org.apache.commons.lang3.ArrayUtils.toObject(intArray26);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, (int) 'a');
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, (int) '#');
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27);
        java.lang.Short[] shortArray36 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray37, (short) 0);
        java.lang.Short[] shortArray43 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray43);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray37, shortArray44);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) intArray27, (java.lang.Object) shortArray44);
        int int47 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray23, (java.lang.Object) intArray27);
        boolean[] booleanArray52 = new boolean[] { false, true, true, false };
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray52, true, 10);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray52, (int) (short) -1, (int) '#');
        boolean[] booleanArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray58, false);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray58);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) intArray27, (java.lang.Object) booleanArray58);
        int[] intArray63 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.contains(intArray63, (int) (byte) 100);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray60), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, 3, (short) (byte) 100);
        short[] shortArray11 = null;
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray10, shortArray11);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.remove(shortArray12, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray14);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[100, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray13, (byte) 0);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(byteArray13, (byte) 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray7, (java.lang.Object) (byte) 0, (int) (byte) 0);
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        java.lang.Short[] shortArray24 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray24, (short) 1);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) byteArray7, (java.lang.Object) shortArray26);
        java.lang.Short[] shortArray31 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray32, (short) 0);
        java.lang.Short[] shortArray38 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray38);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray32, shortArray39);
        java.lang.String str42 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray32, "{35,0}");
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray26, shortArray32);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.add(shortArray32, (short) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "{-1,100,1}" + "'", str42, "{-1,100,1}");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[-1, 100, 1, 10]");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        boolean[] booleanArray8 = new boolean[] { false, true, true, false };
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray8, true, 10);
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.add(booleanArray8, false);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray13);
        boolean[] booleanArray20 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray20, true);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray13, booleanArray22);
        boolean[] booleanArray28 = new boolean[] { false, true, true, false };
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray28, true, 10);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.add(booleanArray28, false);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray33);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray33, 1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray36);
        boolean[] booleanArray38 = null;
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray38);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray3, booleanArray22);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray22);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray22);
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray22, false);
        java.lang.Boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray22);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(booleanArray45);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, (double) 1);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, (double) 10L);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, 0.0d, (int) 'a', (double) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(floatArray2, (float) (-1L));
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (-1L));
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(floatArray9, (float) 100);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray9, (int) (byte) 0, (int) (short) 10);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray14);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, (float) 5);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 1.0]");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) -1);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, 0, (byte) 0);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (short) -1, (int) (byte) 100);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.subarray(charArray9, (int) (short) 1, (int) 'a');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray12, '#', (int) '4');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ ,  , #, 4]");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) (short) 1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, 0.0f);
        float[] floatArray11 = new float[] { (-1L), (byte) 1 };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray11, (float) (byte) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.clone(floatArray16);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray16, (int) '#', (int) 'a');
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.remove(floatArray16, (int) (byte) 0);
        float[] floatArray25 = new float[] { (-1L), (byte) 1 };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray25, (float) (byte) 10);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.clone(floatArray30);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray30, (int) '#', (int) 'a');
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray30);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.remove(floatArray30, 0);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray22, floatArray30);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray30);
        float[] floatArray41 = org.apache.commons.lang3.ArrayUtils.add(floatArray30, (float) (byte) 1);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray30, (float) 3);
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.remove(floatArray43, 2);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.add(floatArray45, (float) 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[-1.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[-1.0, -1.0, 1.0, 3.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[-1.0, -1.0, 3.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[-1.0, -1.0, 3.0, 1.0]");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.io.Serializable[] serializableArray5 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[]) doubleArray1, (int) '#', 1);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) doubleArray1);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, 4, (int) (byte) -1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(serializableArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        int[] intArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        java.lang.Character[] charArray13 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray7, (java.lang.Object) charArray14);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, ' ', (int) (short) 10);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray14, '#');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray14, '4');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.add(charArray24, 'a');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a a44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a a44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a,  , a, 4, 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a a44a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a a44a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a,  , a, 4, 4, a]");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, (int) ' ', 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray7);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8, (float) 4);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8);
        long[] longArray13 = new long[] { 1L };
        long[][] longArray14 = new long[][] { longArray13 };
        java.lang.Character[] charArray17 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray17);
        long[][] longArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray14, (java.lang.Object) charArray17);
        long[][] longArray22 = org.apache.commons.lang3.ArrayUtils.subarray(longArray14, 10, (int) ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray23);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray23);
        java.lang.Character[] charArray26 = org.apache.commons.lang3.ArrayUtils.toObject(charArray23);
        java.lang.Character[] charArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray26);
        long[][] longArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray14, (java.lang.Object) charArray27);
        int[] intArray31 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray32 = org.apache.commons.lang3.ArrayUtils.toObject(intArray31);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray32, (int) 'a');
        java.lang.Integer[] intArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray32);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray32, 4);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.clone(intArray37);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.remove(intArray37, (int) (byte) 0);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray28, (java.lang.Object) intArray40);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.subarray(intArray40, 4, (int) 'a');
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray8, (java.lang.Object) 'a', 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[1]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte[] byteArray3 = new byte[] { (byte) 10 };
        byte[][] byteArray4 = new byte[][] { byteArray1, byteArray3 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray10, (byte) 0);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.add(byteArray10, (byte) 10);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray10, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.clone(byteArray10);
        byte[][] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray4, byteArray17);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray17, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) -1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray5);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10, 10, 0]");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) '#');
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (short) 0);
        java.lang.Short[] shortArray19 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray13, shortArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) intArray3, (java.lang.Object) shortArray20);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        java.lang.Integer[] intArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        java.lang.Integer[] intArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray24);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray25);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35, 0]");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.subarray(longArray5, (int) (short) -1, (int) 'a');
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray16 = new long[] { 10L, 100L, '#' };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray16, (long) (short) 0, (-1));
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray16, (long) (short) 0, (int) '#');
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray16, (long) (short) 0);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray16);
        long[] longArray28 = new long[] { ' ' };
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray28);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray28, (long) '#');
        long[] longArray34 = new long[] { 100L, 'a' };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.subarray(longArray34, (int) (short) 10, 100);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray37);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray37, (long) 0);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.subarray(longArray40, (-1), 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray40);
        long[] longArray47 = org.apache.commons.lang3.ArrayUtils.subarray(longArray40, (int) (byte) 0, 100);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray40);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray28, longArray40);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray26, (java.lang.Object) longArray40);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray12, longArray40);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[32]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[]");
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray5, '#');
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ', (int) (byte) 0);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.remove(charArray8, 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, 'a', (int) (byte) 10);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray13);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(charArray13, ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) '#');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, (int) (short) -1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 0);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) -1 };
        java.lang.Byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray13, (byte) 1);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray13);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray18, (byte) 10, (int) (byte) 10);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray18);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.clone(byteArray18);
        java.lang.Byte[] byteArray28 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28, (byte) -1);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray30);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.add(byteArray30, (byte) 100);
        java.lang.Byte[] byteArray38 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray38, (byte) -1);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray40);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.add(byteArray40, (byte) 100);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray30, byteArray40);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.add(byteArray44, (byte) 100);
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray44, (int) (short) 0, (int) (byte) 100);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray18, byteArray49);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        java.lang.Byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray18);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, -1, -1, 1, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, -1, -1, 1, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, -1, -1, 1, 1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteArray52);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray8);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray8, (short) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(shortArray8, (short) (byte) 10);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray8, (short) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, 100, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 100, 1, 100]");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 4);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        int[] intArray12 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray13 = org.apache.commons.lang3.ArrayUtils.toObject(intArray12);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.clone(intArray12);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.clone(intArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray9, intArray15);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) (short) 1);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (short) 0);
        float[] floatArray11 = new float[] { (-1L), (byte) 1 };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray11, (float) (byte) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.clone(floatArray16);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray16, (int) '#', (int) 'a');
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray16);
        float[] floatArray24 = new float[] { (-1L), (byte) 1 };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray24, (float) (byte) 10);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.clone(floatArray29);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray29, (int) '#', (int) 'a');
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.remove(floatArray29, (int) (byte) 0);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray29, (int) (short) 0, (int) (byte) 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray29, (float) 10, 0);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray29, (float) 'a');
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray21, floatArray29);
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray2, floatArray44);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) 100, (int) (byte) 0);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, 0.0f);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0, -1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[-1.0, 1.0, -1.0, -1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray9);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(intArray9, (int) (short) -1);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray9, (int) (short) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray9, (int) (byte) -1, 6);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][][][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray1, annotatedElementArray2, annotatedElementArray3 };
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray7 = org.apache.commons.lang3.ArrayUtils.subarray(annotatedElementArray4, 0, (-1));
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray8 = org.apache.commons.lang3.ArrayUtils.add(annotatedElementArray0, annotatedElementArray4);
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray11 = org.apache.commons.lang3.ArrayUtils.subarray(annotatedElementArray0, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        org.junit.Assert.assertNotNull(annotatedElementArray11);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray12 = new float[] { (-1L), (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray12, (float) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray17);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) '#', (int) 'a');
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.remove(floatArray17, (int) (byte) 0);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) (short) 0, (int) (byte) 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray17, (float) 10, 0);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray17, (float) 'a');
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.remove(floatArray31, (int) (short) 1);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray9, floatArray33);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray34, 10.0f);
        java.lang.Float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray34);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray34);
        float[] floatArray41 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray34, (int) (short) 10, 8);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.remove(floatArray41, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0, -1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[]");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray5, '#');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray8);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray8, ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#]");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 100);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(byteArray0, (byte) -1);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 10, 5);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        boolean[] booleanArray0 = new boolean[] {};
        boolean[] booleanArray1 = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        boolean[][] booleanArray3 = new boolean[][] { booleanArray0, booleanArray1, booleanArray2 };
        boolean[][] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toArray(booleanArray3);
        boolean[] booleanArray10 = new boolean[] { false, true, true, false };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray10, true, 10);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.add(booleanArray10, false);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray15);
        boolean[] booleanArray22 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray22, true);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray15, booleanArray24);
        boolean[] booleanArray30 = new boolean[] { false, true, true, false };
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray30, true, 10);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.add(booleanArray30, false);
        boolean[] booleanArray36 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray35);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray35, 1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray24, booleanArray38);
        boolean[] booleanArray45 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.add(booleanArray45, true);
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.add(booleanArray45, false);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray24, booleanArray45);
        boolean[][] booleanArray51 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, 3, booleanArray24);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[false, false, true, true, false, true]");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        java.lang.Object[] objArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 100, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 0, (int) ' ');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray5);
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, '#');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) charArray5);
        java.lang.Object[] objArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[4, a,  , a, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[4, a,  , a, 4]");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { 10.0f, (short) 10, 'a' };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.add(doubleArray18, (double) 100L);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray24);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray24, (double) 100.0f, 0, (double) (short) 1);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray24);
        java.lang.String str32 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) doubleArray30, "");
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray30, (double) 6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, -1.0, 10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{10.0,10.0,97.0,100.0}" + "'", str32, "{10.0,10.0,97.0,100.0}");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 10.0, 97.0, 100.0]");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        char[] charArray0 = null;
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, 3, 4);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray20);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.remove(byteArray5, 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray8, (short) 0, (int) (short) 100);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray8, (short) 10);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray8);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray8, shortArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray4, (java.lang.Object) shortArray15, 5);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray15, (short) 100);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray27, (int) '4', (int) (byte) 1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, 0, (double) ' ');
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray27);
        java.lang.Double[] doubleArray39 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray39);
        java.lang.Long[] longArray41 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray39, (java.lang.Object) longArray41, (int) (short) 100);
        java.lang.Double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray39);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray39);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray39, (double) 100.0f);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray34, doubleArray47);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray47, (double) (-1), (int) (short) 10);
        double[] doubleArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray47, (double) 5);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray53, (double) 1.0f, (double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray7 = new long[] { 100L, 'a' };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (short) 10, 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray10);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray10, (long) 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray3, longArray10);
        java.lang.Long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toObject(longArray10);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray10, (int) (byte) -1, 1);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.add(longArray18, 0, (long) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray18, (long) (short) 0);
        long[] longArray26 = new long[] { 100L, 'a' };
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.subarray(longArray26, (int) (short) 10, 100);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray29);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray29, (long) 0);
        java.lang.Long[] longArray33 = org.apache.commons.lang3.ArrayUtils.toObject(longArray32);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33, 0L);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray33, (long) (byte) 10);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray18, longArray38);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray18);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[]");
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray27, (int) '4', (int) (byte) 1);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, 0, (double) ' ');
        double[] doubleArray37 = new double[] { (short) 100, 1, (-1.0d) };
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray37, (double) 0.0f, (int) (short) 0);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray37, 0.0d, 10);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray37, (double) (byte) 10);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray37, (double) '4', (int) (short) 10);
        double[] doubleArray52 = new double[] { (short) 100, 1, (-1.0d) };
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray52, (double) 0.0f, (int) (short) 0);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray52, 0.0d, 10);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray52, (double) (byte) 10);
        double[] doubleArray61 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray37, doubleArray52);
        double[] doubleArray62 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray33, doubleArray37);
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray62, (double) (short) -1, (int) (byte) 1, (double) 100.0f);
        int int70 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray62, (double) 0L, (-1), (double) 1.0f);
        double[] doubleArray72 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray62, 100.0d);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray62, (double) 100, (double) 'a');
        double[] doubleArray76 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray62);
        double[] doubleArray78 = org.apache.commons.lang3.ArrayUtils.add(doubleArray76, (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[32.0, 1.0, -1.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 1.0]");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        long[] longArray6 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray6);
        java.lang.Long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toObject(longArray6);
        java.lang.Long[] longArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray10);
        java.lang.Object[] objArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) longArray10);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 52, 100, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 52, 100, 1, 100, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 52, 100, 1, 100, 1]");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (-1));
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '#');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray10);
        java.lang.Character[] charArray17 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.subarray(charArray19, (int) ' ', (int) '#');
        java.lang.Character[] charArray23 = org.apache.commons.lang3.ArrayUtils.toObject(charArray19);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.add(charArray19, ' ');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray10, charArray19);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray19, '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, #]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, #,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) (byte) 0, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        float[] floatArray6 = new float[] { (short) 0, 2, (short) 10, (short) 0, (-1L), ' ' };
        float[] floatArray13 = new float[] { (short) 0, 2, (short) 10, (short) 0, (-1L), ' ' };
        float[] floatArray20 = new float[] { (short) 0, 2, (short) 10, (short) 0, (-1L), ' ' };
        float[][] floatArray21 = new float[][] { floatArray6, floatArray13, floatArray20 };
        float[] floatArray27 = new float[] { 1.0f, 10L, (-1), (byte) 10, 1.0f };
        float[] floatArray33 = new float[] { 1.0f, 10L, (-1), (byte) 10, 1.0f };
        float[] floatArray39 = new float[] { 1.0f, 10L, (-1), (byte) 10, 1.0f };
        float[] floatArray45 = new float[] { 1.0f, 10L, (-1), (byte) 10, 1.0f };
        float[] floatArray51 = new float[] { 1.0f, 10L, (-1), (byte) 10, 1.0f };
        float[][] floatArray52 = new float[][] { floatArray27, floatArray33, floatArray39, floatArray45, floatArray51 };
        float[][] floatArray53 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray21, floatArray52);
        java.lang.Object[] objArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) floatArray52);
        float[] floatArray57 = new float[] { (-1L), (byte) 1 };
        int int59 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray57, (float) (byte) 10);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray57);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray57);
        int int63 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray57, (float) 10);
        java.lang.Float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray57);
        float[] floatArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray64, 100.0f);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray54, (java.lang.Object) floatArray66, (int) (byte) 100);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 2.0, 10.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[0.0, 2.0, 10.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 2.0, 10.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[1.0, 10.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[1.0, 10.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[1.0, 10.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[1.0, 10.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[1.0, 10.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[[1.0, 10.0, -1.0, 10.0, 1.0], [1.0, 10.0, -1.0, 10.0, 1.0], [1.0, 10.0, -1.0, 10.0, 1.0], [1.0, 10.0, -1.0, 10.0, 1.0], [1.0, 10.0, -1.0, 10.0, 1.0]]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray66), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        long[] longArray6 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, 0L);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        long[] longArray14 = new long[] { 100L, 'a' };
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.subarray(longArray14, (int) (short) 10, 100);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray17);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray17, (long) 0);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.subarray(longArray17, (int) (short) -1, (int) 'a');
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray17);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.addAll(longArray6, longArray17);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[1, 100, 1, 100, 52, 1]");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) -1);
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray7);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8, (short) (byte) 10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray11);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.io.Serializable[] serializableArray5 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[]) doubleArray1, (int) '#', 1);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        float[] floatArray9 = new float[] { (-1L), (byte) 1 };
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray9, (float) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.clone(floatArray14);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) '#', (int) 'a');
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.remove(floatArray14, (int) (byte) 0);
        float[] floatArray23 = new float[] { (-1L), (byte) 1 };
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray23, (float) (byte) 10);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.clone(floatArray28);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray28, (int) '#', (int) 'a');
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray28);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.remove(floatArray28, 0);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray20, floatArray28);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray36);
        float[] floatArray40 = new float[] { (-1L), (byte) 1 };
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray40, (float) (byte) 10);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray40, (float) (byte) -1, (int) '#');
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray40);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray46, 0.0f, (int) (byte) -1);
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray36, floatArray46);
        java.lang.Float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray50);
        java.lang.Float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray51);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) doubleArray6, (java.lang.Object[]) floatArray51);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) 100);
        java.lang.Byte[] byteArray56 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray61 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray61, (byte) -1);
        java.lang.Byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray61);
        java.lang.Character[] charArray70 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray71 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray70);
        java.lang.Character[] charArray72 = org.apache.commons.lang3.ArrayUtils.toObject(charArray71);
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray64, (java.lang.Object) charArray71);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray56, (java.lang.Object[]) byteArray64);
        java.lang.Byte[] byteArray75 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray56);
        byte[] byteArray76 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray75);
        int int78 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray6, (java.lang.Object) byteArray76, 5);
        java.lang.Object[] objArray79 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(serializableArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[-1.0, 1.0, -1.0, -1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[100.0]");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 100, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 0, (int) ' ');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray5);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray5);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, (int) (short) 0, 9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 1, 100, 100, 0]");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray3, (int) (short) 0, 100);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray10, (long) (short) 100);
        java.lang.Byte[] byteArray17 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray17, (byte) -1);
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray17);
        long[] longArray23 = new long[] { 100L, 'a' };
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.subarray(longArray23, (int) (short) 10, 100);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray26);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray26, (long) 0);
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toObject(longArray29);
        java.io.Serializable[] serializableArray31 = org.apache.commons.lang3.ArrayUtils.removeElement((java.io.Serializable[]) byteArray17, (java.lang.Object) longArray30);
        java.lang.Long[] longArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray30);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray30, (long) (short) 10);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.clone(longArray34);
        java.lang.String str37 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) longArray34, "{1,-1,-1,1,100}");
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray12, longArray34);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 35]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(serializableArray31);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "{}" + "'", str37, "{}");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray20);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 100, 3);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, 5, (byte) 1);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.remove(byteArray28, (int) (short) 1);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray28, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, -1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, -1, -1, 1, 100, 1]");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.add(byteArray1, (byte) -1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray1, (byte) 10, 0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (byte) 100, (double) (byte) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) 8, (double) 5);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray4, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        java.lang.Byte[] byteArray14 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray14, (byte) -1);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray16);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 100);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray16);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray16);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 0);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 10);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray37 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray37, (byte) -1);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray39);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.add(byteArray39, (byte) 100);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray32, byteArray42);
        byte[] byteArray44 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray27, byteArray42);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.contains(byteArray27, (byte) 10);
        byte[] byteArray49 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray27, 0, (int) (byte) 1);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray16, byteArray27);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray16, (byte) 100);
        byte[] byteArray55 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[1, -1, -1, 1, 0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, -1, -1, 1, 0]");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        java.lang.Double[] doubleArray32 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray32);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray32, 0.0d);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray32);
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray27, doubleArray36);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray36, 0.0d, (int) (short) 0, 0.0d);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray36);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray42, (double) (byte) 10, (int) (byte) 0, (double) 100.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray7 = null;
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.addAll(charArray5, charArray7);
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray5);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        java.lang.Byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray15);
        java.lang.Character[] charArray24 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray24);
        java.lang.Character[] charArray26 = org.apache.commons.lang3.ArrayUtils.toObject(charArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray18, (java.lang.Object) charArray25);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.subarray(charArray25, (int) (short) 10, 100);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray30, '#');
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.clone(charArray30);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray33);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray33, '4');
        java.lang.Character[] charArray39 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray40);
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.subarray(charArray41, (int) ' ', (int) '#');
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray36, charArray41);
        char[] charArray46 = org.apache.commons.lang3.ArrayUtils.addAll(charArray5, charArray41);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.add(charArray5, 2, '4');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray52 = org.apache.commons.lang3.ArrayUtils.add(charArray5, (int) (byte) 10, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4#  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4#  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #,  ,  , 4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "4#  4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "4#  4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4, #,  ,  , 4, #, #]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4#4  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4#4  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4, #, 4,  ,  , 4]");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.subarray(longArray1, (int) (short) 1, (int) (byte) 100);
        long[] longArray9 = new long[] { ' ' };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray9);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.addAll(longArray9, longArray11);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray9, (int) (short) 1, (int) (byte) 100);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (long) (short) 1);
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray17);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray17);
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.subarray(longArray19, (int) (short) 0, 5);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray22, (long) 7, 7);
        java.lang.Long[] longArray26 = org.apache.commons.lang3.ArrayUtils.toObject(longArray22);
        java.lang.Long[] longArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray26);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[32]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[32]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[32, 32, 1]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[32, 32, 1]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertNotNull(longArray27);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        java.lang.Double[] doubleArray32 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray32);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray32, 0.0d);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray32);
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray27, doubleArray36);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray27);
        double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (double) (byte) -1);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10, (short) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) -1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray12);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray16);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray15, shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray23 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray23);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray24, (short) 0);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.clone(shortArray26);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray27, (short) (byte) -1, (int) '#');
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray19, shortArray27);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray19);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray15, shortArray19);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.clone(shortArray19);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray35);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 100, 1, 10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[]");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray9, 3);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray9, (int) ' ', (-1));
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray9, 1);
        boolean[] booleanArray17 = new boolean[] { false, true, true, false };
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, true, 10);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray17, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray22);
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray22);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray12, booleanArray22);
        int[] intArray28 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray29 = org.apache.commons.lang3.ArrayUtils.toObject(intArray28);
        int[] intArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray29, (int) 'a');
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray29, (int) '#');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray33);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.add(intArray33, (int) (byte) 0, 1);
        int[] intArray40 = new int[] { 0, 0 };
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.addAll(intArray37, intArray40);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray37);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) booleanArray22, (java.lang.Object) intArray37);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray37);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, false, false, false, false, true, true, false]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[1, 0, 35]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[1, 0, 35, 0, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 0, 35]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray7);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray7, (int) (short) -1, (int) '4');
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray12);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray14);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.add(shortArray14, (short) 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray14, (short) 10);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray14, (short) (byte) -1);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.add(shortArray21, (short) (byte) -1);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.clone(shortArray21);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray24, (int) (short) 1, 7);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, (short) 0);
        short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.clone(shortArray27);
        short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray12, shortArray30);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[100]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, -1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[-1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[]");
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[]");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[10, 10, 0]");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        java.lang.Object[] objArray0 = null;
        int[] intArray3 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.toObject(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray3);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray6);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray8);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) intArray8, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 35]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray4);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray6, true);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray8, true, (int) 'a');
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(objMap5);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, 0, (double) (byte) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, 3, (-1.0d));
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray15, (double) (short) -1);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        float[] floatArray22 = new float[] { (-1L), (byte) 1 };
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray22, (float) (byte) 10);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.clone(floatArray27);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray27, (int) '#', (int) 'a');
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray27);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray27);
        double[] doubleArray37 = new double[] { (short) 100, 1, (-1.0d) };
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray37, (double) 0.0f, (int) (short) 0);
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray37, (double) (byte) 10);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) boolean33, (java.lang.Object) doubleArray37);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray37, (double) 1);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray37, 0.0d);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray19, doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray8, (long) 4, (int) '4');
        long[] longArray15 = new long[] { 10L, 100L, '#' };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray15);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray15);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toObject(longArray15);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray19);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray20, (long) (byte) 1);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray20, 0L, 100);
        java.lang.Long[] longArray26 = org.apache.commons.lang3.ArrayUtils.toObject(longArray20);
        java.lang.Long[] longArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray26);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray26, (long) (short) 1);
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray26);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray30);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray17);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.add(byteArray17, (byte) 100);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray10, byteArray20);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray5, byteArray20);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray28, (byte) 0);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(byteArray28, (byte) 100);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray28, 100, 0);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray28, (byte) 0, 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray28, (byte) 0, (int) ' ');
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray28);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray28);
        byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, -1, -1, 1, 100, 0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[1, -1, -1, 1, 100, 100]");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 0);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 100);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray8, 100, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 0, 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray8);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray1, byteArray8);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) 1);
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (byte) 100);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray24);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray24, (byte) -1, 2);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray24);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 1, 100, 100, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 0, (int) (short) 100);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 10);
        java.lang.Short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray1);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray1, shortArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) 0);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray1, 100, 10);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[]");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) -1);
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray7);
        java.lang.Short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray7);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray9, (short) -1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[10, 10, 0]");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (short) 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        double[] doubleArray5 = new double[] { 10.0f, (short) 10, 'a' };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.add(doubleArray5, (double) 100L);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray1, (java.lang.Object) doubleArray5, 3);
        double[] doubleArray17 = new double[] { (short) 100, 1, (-1.0d) };
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray17, (double) 0.0f, (int) (short) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray17, 0.0d, 10);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray17, (double) (byte) 10);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) '4', (int) (short) 10);
        double[] doubleArray32 = new double[] { (short) 100, 1, (-1.0d) };
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray32, (double) 0.0f, (int) (short) 0);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray32, 0.0d, 10);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray32, (double) (byte) 10);
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray17, doubleArray32);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray32, (int) (byte) 1, (int) 'a');
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray44);
        double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray5, doubleArray45);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray46, (double) 100.0f, (double) 1L);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 10.0, 97.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        java.lang.Byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Character[] charArray14 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray14);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray8, (java.lang.Object) charArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray0, (java.lang.Object[]) byteArray8);
        java.lang.Byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray0);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 1);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 1);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) booleanArray0);
        java.lang.Boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        long[] longArray9 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toObject(longArray9);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray10, (long) 4);
        java.lang.Long[] longArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray10);
        char[] charArray19 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.clone(charArray19);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.subarray(charArray20, (int) (short) -1, (int) (byte) 100);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray20);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray24, ' ');
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray13, (java.lang.Object) charArray24);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.subarray(charArray24, (int) 'a', 0);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray30);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray30);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.clone(charArray32);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray33);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray4, (java.lang.Object) charArray33);
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray33, '4');
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4,  ,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[]");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (short) -1, (int) (byte) 100);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        java.lang.Character[] charArray16 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray16);
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.toObject(charArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray17);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.subarray(charArray17, (int) (byte) -1, (int) (byte) 1);
        java.lang.Character[] charArray28 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray28);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray22, charArray29);
        java.lang.Character[] charArray31 = org.apache.commons.lang3.ArrayUtils.toObject(charArray22);
        long[] longArray33 = new long[] { 1L };
        long[][] longArray34 = new long[][] { longArray33 };
        java.lang.Character[] charArray37 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray37);
        long[][] longArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray34, (java.lang.Object) charArray37);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray37, '#');
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray41, 'a', (int) (byte) 0);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray41, 'a');
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray41);
        char[] charArray48 = org.apache.commons.lang3.ArrayUtils.addAll(charArray22, charArray41);
        char[] charArray49 = org.apache.commons.lang3.ArrayUtils.addAll(charArray6, charArray22);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray6);
        char[] charArray51 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray51);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[1]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4, #, #]");
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "4  #44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "4  #44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[4,  ,  , #, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[4,  ,  , #, 4]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6, (short) 0);
        java.lang.Short[] shortArray13 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray13);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray14, (short) 0);
        java.lang.Short[] shortArray20 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray20);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray14, shortArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(shortArray21, (short) 10);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.clone(shortArray21);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray25, (short) (byte) 1);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray9, shortArray27);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray29);
        java.lang.Short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray29);
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31, (short) 0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap34 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) shortArray31);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31, (short) -1);
        java.lang.Short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray36);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray27, shortArray36);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains(shortArray27, (short) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[]");
        org.junit.Assert.assertNotNull(objMap34);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[-1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) (short) 0, (int) (byte) 0);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 10, 0);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        java.lang.Double[] doubleArray25 = new java.lang.Double[] { 1.0d, (-1.0d), 10.0d, 1.0d };
        java.lang.Double[][] doubleArray26 = new java.lang.Double[][] { doubleArray25 };
        java.lang.Double[][][] doubleArray27 = new java.lang.Double[][][] { doubleArray26 };
        java.lang.Double[][][] doubleArray28 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) floatArray7, (java.lang.Object) doubleArray27);
        java.lang.Float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray7);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray30);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray30, (float) 9);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray10 = org.apache.commons.lang3.ArrayUtils.toObject(intArray9);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10, (-1));
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10, (int) (byte) -1);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(intArray15, 9);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray15);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 0]");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        boolean[] booleanArray0 = new boolean[] {};
        boolean[] booleanArray1 = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        boolean[][] booleanArray3 = new boolean[][] { booleanArray0, booleanArray1, booleanArray2 };
        boolean[][] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toArray(booleanArray3);
        boolean[] booleanArray9 = new boolean[] { false, true, true, false };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray9, true, 10);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray9, (int) (short) -1, (int) '#');
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray15, false);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray19, (int) (short) 0);
        boolean[][] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray3, booleanArray21);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray21, (int) ' ', (int) (byte) 10);
        boolean[] booleanArray31 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.add(booleanArray31, true);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray31);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray25, booleanArray31);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray25, false);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        boolean[] booleanArray7 = new boolean[] {};
        boolean[] booleanArray8 = new boolean[] {};
        boolean[] booleanArray9 = new boolean[] {};
        boolean[][] booleanArray10 = new boolean[][] { booleanArray7, booleanArray8, booleanArray9 };
        boolean[][] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toArray(booleanArray10);
        boolean[] booleanArray17 = new boolean[] { false, true, true, false };
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, true, 10);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray17, false);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray22);
        boolean[] booleanArray29 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.add(booleanArray29, true);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray31);
        boolean[] booleanArray37 = new boolean[] { false, true, true, false };
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray37, true, 10);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.add(booleanArray37, false);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray42);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray42, 1);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray31, booleanArray45);
        boolean[] booleanArray52 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.add(booleanArray52, true);
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.add(booleanArray52, false);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray31, booleanArray52);
        boolean[][] booleanArray58 = org.apache.commons.lang3.ArrayUtils.add(booleanArray11, 3, booleanArray31);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray6, (java.lang.Object) 3, 8);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.clone(shortArray61);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray62);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[false, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[0, 10, 10]");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray5, false);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray12, (int) 'a', (int) 'a');
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { (short) 100, 1, (-1.0d) };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) 0.0f, (int) (short) 0);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, 0.0d, 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray18);
        java.lang.Double[] doubleArray32 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray32);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray32, 0.0d);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray32);
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray27, doubleArray36);
        double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray37);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray38, (double) 1.0f);
        double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray38, (int) (short) 100, 10);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray38, (double) (-1), 7);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray38);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray47, (double) 8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 7 + "'", int46 == 7);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 10.0d);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (double) (short) -1);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray15, (double) 100L, (double) (-1.0f));
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 1.0, -1.0, -1.0, -1.0]");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) -1, (int) (byte) 1);
        java.lang.Character[] charArray17 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray18);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 'a');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(charArray11, 'a');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 0, '4');
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, '#', (int) (short) 10);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.subarray(charArray11, (int) (short) -1, (int) (short) 100);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray32, '4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, a]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, 4]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray13);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14, (short) 0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 100, 1]");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 5);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 3, (int) 'a');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 4);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        java.lang.Byte[] byteArray14 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray14, (byte) -1);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray16);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 100);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray16);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 0);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        java.lang.Byte[] byteArray28 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28, (byte) -1);
        java.lang.Byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray28);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray23, byteArray32);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.add(byteArray32, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, -1, -1, 1, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, -1, -1, 1, 1, -1, -1, 1, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, -1, -1, 1, 100]");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 10L);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (double) 1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray12, (double) 5);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray14, (double) '4', (-1));
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray14, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, -1.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, 10.0, 1.0]");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 100, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, 0);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.remove(byteArray5, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 100, 100, 0]");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(charArray0, 'a');
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, '#');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7, 0.0d);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7, (double) 10L);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) intArray0, (java.lang.Object) doubleArray13);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray13);
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.add(doubleArray13, (double) (byte) -1);
        java.lang.Double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray13);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.add(doubleArray13, 0, (double) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 10.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray3, (int) (short) 0, 100);
        long[] longArray12 = new long[] { ' ' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray12);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.addAll(longArray12, longArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray10, longArray15);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, 0, (int) (short) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray20, (long) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[32]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[32]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[32]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        java.lang.Object[] objArray0 = null;
        float[] floatArray3 = new float[] { (-1L), (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray3, (float) (byte) 10);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.clone(floatArray8);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) '#', (int) 'a');
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray8, (int) (byte) 0);
        float[] floatArray17 = new float[] { (-1L), (byte) 1 };
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray17, (float) (byte) 10);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.clone(floatArray22);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray22, (int) '#', (int) 'a');
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray22);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.remove(floatArray22, 0);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray14, floatArray22);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray30);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray30);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray30);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray30);
        java.lang.Float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray30);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray36, 100.0f);
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) floatArray36, 10);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[1.0, -1.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[1.0, -1.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9, 0L);
        java.lang.Long[] longArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray9);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray12, (long) (byte) 1);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray12);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray7);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, (short) 1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[10, 10, 0, 1]");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        float[] floatArray3 = new float[] { (byte) 0, 1.0f, (short) 10 };
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (int) (byte) 0, (float) 5);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, (int) ' ', (int) (short) 1);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 0, (float) 'a');
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray12, (float) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray14);
        float[] floatArray18 = new float[] { (-1L), (byte) 1 };
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray18, (float) (byte) 10);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray18, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.clone(floatArray23);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray23, (int) '#', (int) 'a');
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.remove(floatArray23, (int) (byte) 0);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray23, (int) (short) 0, (int) (byte) 0);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray32, (int) (byte) 1, 5);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray14, floatArray32);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[5.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[97.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[97.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (byte) 100, (double) (byte) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray9 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray9);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, 0.0d);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 10.0f, 10.0d);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray13);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 'a', 2, (double) (-1.0f));
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) 10.0f, (double) (short) 100);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray25, (double) (short) 1, 7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.subarray(longArray1, (int) (short) 100, (int) (byte) 0);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray1);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, (long) (short) 10);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        java.lang.Long[] longArray14 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray12, (java.lang.Object) longArray14, (int) (short) 100);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray14);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray17, (long) (short) 0);
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray19);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray21, (long) 4, 7);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray21, (long) 2);
        java.lang.String str28 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int26, "{}");
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1" + "'", str28, "-1");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) (short) 1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, 0.0f);
        float[] floatArray11 = new float[] { (-1L), (byte) 1 };
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray11, (float) (byte) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.clone(floatArray16);
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray16, (int) '#', (int) 'a');
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.remove(floatArray16, (int) (byte) 0);
        float[] floatArray25 = new float[] { (-1L), (byte) 1 };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray25, (float) (byte) 10);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.clone(floatArray30);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray30, (int) '#', (int) 'a');
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray30);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.remove(floatArray30, 0);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray22, floatArray30);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray30);
        float[] floatArray41 = org.apache.commons.lang3.ArrayUtils.add(floatArray30, (float) (byte) 1);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray30, (float) (-1L));
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray43);
        java.lang.Float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray43);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray43);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[-1.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) ' ', (int) (short) -1);
        byte[] byteArray6 = null;
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray1, byteArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray1, (byte) 10);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray1);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray1, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray12);
        java.lang.Byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray12);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Long[] longArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray4, (java.lang.Object) longArray6, (int) (short) 100);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray9, (long) 2, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) longArray9);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray9, (long) 8);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray9, (long) 3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[3]");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) '#');
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray12 = new int[] { (byte) 10, 1 };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, (int) (short) 100, 100);
        java.lang.Integer[] intArray16 = org.apache.commons.lang3.ArrayUtils.toObject(intArray12);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray16);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray16);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray9, intArray18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }
}

