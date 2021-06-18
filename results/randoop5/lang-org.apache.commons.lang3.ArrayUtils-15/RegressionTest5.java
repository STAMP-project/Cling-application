import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        long[] longArray2 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toObject(longArray2);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, 10L);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray7, (long) 100, 0);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray7);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100]");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.clone(longArray10);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray11);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) 1L);
        java.lang.Float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray16);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray16, (int) (short) -1, 4);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray22, (float) (short) -1, 5);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        java.lang.Short[] shortArray12 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray12, (short) 1);
        java.lang.Short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray12);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray17);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) booleanArray17);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray17);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21, false);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) shortArray16, (java.lang.Object) false);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) (byte) -1, (int) (byte) 10);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray8, shortArray16);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) 100);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 100);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1, 10, 100, 100]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 1, 10]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) '#');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray7);
        java.lang.Character[] charArray11 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray11);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.subarray(charArray13, (int) ' ', (int) '#');
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray18);
        java.lang.Character[] charArray21 = org.apache.commons.lang3.ArrayUtils.toObject(charArray18);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray18, 'a');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.addAll(charArray13, charArray23);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray23);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray7, '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray2);
        long[] longArray5 = new long[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray5);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray7);
        long[] longArray11 = new long[] { 100L, 'a' };
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.subarray(longArray11, (int) (short) 10, 100);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray14);
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray14, (long) 0);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray7, longArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray3, (java.lang.Object) longArray7);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray21 = org.apache.commons.lang3.ArrayUtils.remove(longArray7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[32]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[32]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray5, '#');
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray8, ' ', (int) (byte) 0);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.remove(charArray8, 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray13, 'a', (int) (byte) 10);
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
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray12 = new boolean[] { false, true, true, false };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true, 10);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, false);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray18);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray20, true, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.add(booleanArray20, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 100);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray3, 1, 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 0, (int) (byte) 100);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 0);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 100);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) (byte) 100, (int) 'a');
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) 10, (int) 'a');
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray4);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, false, 0);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray20 = new boolean[] { false, true, true, false };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray20, true, 10);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray20, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray20);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray15, booleanArray20);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, (int) (byte) -1);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, true, true, false, false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 10L);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (double) 1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray12, (double) 5);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray14, (double) '4', (-1));
        double[] doubleArray21 = new double[] { (short) 100, 1, (-1.0d) };
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray21, (double) 0.0f, (int) (short) 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray21, 0.0d, 10);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray21, (double) (byte) 10);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray21, (double) '4', (int) (short) 10);
        double[] doubleArray36 = new double[] { (short) 100, 1, (-1.0d) };
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray36, (double) 0.0f, (int) (short) 0);
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray36, 0.0d, 10);
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray36, (double) (byte) 10);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray21, doubleArray36);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray36);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray36, 10.0d, (-1));
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray14, doubleArray36);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        char[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray1, '#');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(floatArray2, (float) (-1L));
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (-1L));
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0, (float) 0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray20, (int) (byte) 0, (int) (byte) 1);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray25, (byte) 0);
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
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray33, (-1.0d), 0);
        double[] doubleArray40 = new double[] { (short) 100, 1, (-1.0d) };
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray40, (double) 0.0f, (int) (short) 0);
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray40, 0.0d, 10);
        int int48 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray40, (double) (byte) 10);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray40, (double) '4', (int) (short) 10);
        double[] doubleArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray40, (double) ' ');
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray33, doubleArray40);
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray40, (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Long[] longArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray4, (java.lang.Object) longArray6, (int) (short) 100);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int[] intArray12 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray13 = org.apache.commons.lang3.ArrayUtils.toObject(intArray12);
        int[] intArray16 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray17 = org.apache.commons.lang3.ArrayUtils.toObject(intArray16);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray17, (int) 'a');
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.clone(intArray19);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray19);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str23 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray22);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray22);
        java.lang.Double[] doubleArray29 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray29);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray29, 0.0d);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray29);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray29, (double) 10L);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) intArray22, (java.lang.Object) doubleArray35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray22);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray19, intArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray22);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray6, (java.lang.Object) intArray22);
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) (short) 1);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) '#');
        long[] longArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[35, 0, 35, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{}" + "'", str23, "{}");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[]");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.add(doubleArray12, (double) (-1L));
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
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int[] intArray0 = null;
        java.lang.Integer[] intArray7 = new java.lang.Integer[] { 5, 0, 2, 10, 4, 2 };
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray8, (int) (byte) 1);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray10);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[5, 0, 2, 10, 4, 2]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray4);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, true, true, false]");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.Class[][][] classArray1 = new java.lang.Class[0][][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][][] wildcardClassArray2 = (java.lang.Class<?>[][][]) classArray1;
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.clone(shortArray3);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray3, (short) 100);
        java.lang.Short[] shortArray11 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray11);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray12, (short) 0);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray12, shortArray19);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(shortArray19, (short) 10);
        short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.clone(shortArray19);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.add(shortArray23, (short) (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray7, shortArray25);
        java.lang.Class<?>[][][] wildcardClassArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(wildcardClassArray2, (java.lang.Object) shortArray7);
        java.io.Serializable[][][] serializableArray30 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[][][]) wildcardClassArray2, 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(serializableArray30);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 100);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
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
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, -1, -1, 1, 100]");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        long[] longArray10 = new long[] { 100L, 'a' };
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray10, (int) (short) 10, 100);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray10);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) doubleArray4, (java.lang.Object) longArray15);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[]");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[]");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (-1), (int) (short) 100);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (byte) 0, (int) (byte) 100);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (short) -1);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) intArray5);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray5, (int) (short) 1, 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray8);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) 0);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray15, (byte) 10);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray15, 10, 1);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray22);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 1, 100, 100, 0]");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        boolean[] booleanArray12 = new boolean[] { false, true, true, false };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true, 10);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, false);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        java.lang.Object[] objArray19 = new java.lang.Object[] { charArray7, booleanArray12 };
        double[] doubleArray23 = new double[] { (short) 100, 1, (-1.0d) };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) 0.0f, (int) (short) 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, 0.0d, 10);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) (byte) 10);
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray23, (double) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass35 = doubleArray23.getClass();
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray7, (java.lang.Object) wildcardClass35, 0);
        java.lang.Character[] charArray43 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray43);
        java.lang.Character[] charArray45 = org.apache.commons.lang3.ArrayUtils.toObject(charArray44);
        boolean[] booleanArray50 = new boolean[] { false, true, true, false };
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray50, true, 10);
        boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.add(booleanArray50, false);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray50);
        java.lang.Object[] objArray57 = new java.lang.Object[] { charArray45, booleanArray50 };
        double[] doubleArray61 = new double[] { (short) 100, 1, (-1.0d) };
        int int64 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray61, (double) 0.0f, (int) (short) 0);
        int int67 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray61, 0.0d, 10);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray61, (double) (byte) 10);
        int int72 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray61, (double) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass73 = doubleArray61.getClass();
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray45, (java.lang.Object) wildcardClass73, 0);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray76 = new java.lang.reflect.AnnotatedElement[] { wildcardClass35, wildcardClass73 };
        long[] longArray79 = new long[] { 100L, 'a' };
        long[] longArray82 = org.apache.commons.lang3.ArrayUtils.subarray(longArray79, (int) (short) 10, 100);
        int int84 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray82, (long) ' ');
        java.lang.reflect.AnnotatedElement[] annotatedElementArray85 = org.apache.commons.lang3.ArrayUtils.removeElement(annotatedElementArray76, (java.lang.Object) int84);
        int[] intArray88 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray89 = org.apache.commons.lang3.ArrayUtils.toObject(intArray88);
        int[] intArray91 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89, (int) 'a');
        int[] intArray93 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89, (int) '#');
        int[] intArray94 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray95 = org.apache.commons.lang3.ArrayUtils.removeElement(annotatedElementArray85, (java.lang.Object) intArray89);
        int[] intArray96 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89);
        java.lang.Integer[] intArray97 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray89);
        int[] intArray98 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[4, a,  , a, 4], [false, true, true, false]]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[[4, a,  , a, 4], [false, true, true, false]]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(annotatedElementArray76);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray82), "[]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(annotatedElementArray85);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[35, 0]");
        org.junit.Assert.assertNotNull(annotatedElementArray95);
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray97);
        org.junit.Assert.assertNotNull(intArray98);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray98), "[35, 0]");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (byte) 0, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray9);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(intArray9, (int) (short) -1);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray9, (int) (short) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray9, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray9);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) 1);
        java.lang.Byte[] byteArray11 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray11, (byte) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, (byte) 100);
        java.lang.Byte[] byteArray21 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray21, (byte) -1);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray23);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (byte) 100);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray13, byteArray23);
        int int28 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray3, (java.lang.Object) byteArray27);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray27, (byte) 10);
        java.lang.String str32 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray27, "{}");
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 1);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.clone(byteArray27);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, -1, -1, 1, 1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "{1,-1,-1,1,1,-1,-1,1}" + "'", str32, "{1,-1,-1,1,1,-1,-1,1}");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 7 + "'", int34 == 7);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, -1, -1, 1, 1, -1, -1, 1]");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray8);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray8, (byte) 0);
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
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, 1]");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 10L);
        double[] doubleArray17 = new double[] { (byte) 0, 100.0d, 1L, (short) 100, (-1), (byte) 1 };
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray10, doubleArray17);
        int int19 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) doubleArray10);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray10);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 100.0, 1.0, 100.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 10.0, 0.0, 0.0, 100.0, 1.0, 100.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray30, (double) '4', 0.0d);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray30);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray30);
        java.lang.Double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray30);
        java.lang.Double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray36);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray37);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (int) (short) 100, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray2, (int) 'a');
        int[] intArray11 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray12 = org.apache.commons.lang3.ArrayUtils.toObject(intArray11);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.clone(intArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray13);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray2, intArray13);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray15, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 1, 35, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }
}

