import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.subarray(intArray9, (int) (short) 0, 2);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.subarray(intArray9, 5, (int) (short) -1);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.subarray(intArray15, 0, 1);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.clone(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = org.apache.commons.lang3.ArrayUtils.add(intArray18, 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        java.lang.Character[] charArray47 = org.apache.commons.lang3.ArrayUtils.toObject(charArray42);
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
        org.junit.Assert.assertNotNull(charArray47);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        java.lang.String[] strArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        java.lang.Comparable<java.lang.String>[] strComparableArray22 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Comparable<java.lang.String>[]) strArray20, (java.lang.Comparable<java.lang.String>) "");
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strComparableArray22);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 5);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 3, (int) 'a');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray5, 4);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[4]");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, 2, (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray9);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray11);
        short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray11, (short) 100);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray14, 1, 1);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.clone(shortArray18);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) 100);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(shortArray18, (short) (byte) 0);
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) (byte) 1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray17, shortArray18);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray9, shortArray17);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.remove(shortArray9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1, 100, 100, -1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[100]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[100]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[1, 100, 100, -1]");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        java.lang.Character[] charArray52 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray52);
        char[] charArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray53, ' ');
        java.lang.Character[] charArray56 = org.apache.commons.lang3.ArrayUtils.toObject(charArray55);
        char[] charArray59 = org.apache.commons.lang3.ArrayUtils.add(charArray55, (int) (short) 1, 'a');
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray5, charArray55);
        boolean boolean61 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray55);
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
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#, #]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "#a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "#a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, a, #]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray7);
        boolean[] booleanArray43 = new boolean[] { false, true, true, false };
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray43, true, 10);
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray43, (int) (short) -1, (int) '#');
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray49, false);
        boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray49, false);
        boolean[] booleanArray59 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.add(booleanArray59, true);
        boolean[] booleanArray62 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray59);
        boolean[] booleanArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray59);
        boolean[] booleanArray65 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray63, true);
        boolean[] booleanArray66 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray49, booleanArray65);
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray7, (java.lang.Object) booleanArray65);
        boolean[] booleanArray68 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray65);
        boolean[] booleanArray71 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray68, 0, 8);
        int int73 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray71, true);
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
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray53), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray61), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray62), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray65), "[false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray66), "[false, true, true, false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray68), "[false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray71), "[false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        long[] longArray1 = new long[] { 1L };
        long[][] longArray2 = new long[][] { longArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        long[][] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
        java.lang.Byte[] byteArray14 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray14, (byte) -1);
        java.lang.Byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray14);
        java.lang.Character[] charArray23 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray23);
        java.lang.Character[] charArray25 = org.apache.commons.lang3.ArrayUtils.toObject(charArray24);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray17, (java.lang.Object) charArray24);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.subarray(charArray24, (int) (short) 10, 100);
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray29, '#');
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.clone(charArray29);
        java.lang.Byte[] byteArray37 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray37, (byte) -1);
        java.lang.Byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray37);
        java.lang.Character[] charArray46 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray46);
        java.lang.Character[] charArray48 = org.apache.commons.lang3.ArrayUtils.toObject(charArray47);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray40, (java.lang.Object) charArray47);
        char[] charArray52 = org.apache.commons.lang3.ArrayUtils.subarray(charArray47, (int) (short) 10, 100);
        char[] charArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray52, '#');
        char[] charArray55 = org.apache.commons.lang3.ArrayUtils.clone(charArray52);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray29, charArray52);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray52);
        char[] charArray60 = org.apache.commons.lang3.ArrayUtils.subarray(charArray52, 1, (int) ' ');
        char[] charArray61 = org.apache.commons.lang3.ArrayUtils.clone(charArray60);
        char[] charArray63 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray60, '4');
        char[] charArray65 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray63, '#');
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray9, charArray63);
        char[] charArray67 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
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
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[]");
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[]");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[]");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, #]");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 10, 1);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, 2);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, 8);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.String[] strArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray13);
        java.lang.String[] strArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.ArrayUtils.add(strArray14, "-1");
        java.lang.String[] strArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray14);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) int10, (java.lang.Object) strArray14);
        java.lang.Comparable<java.lang.String>[] strComparableArray22 = org.apache.commons.lang3.ArrayUtils.subarray((java.lang.Comparable<java.lang.String>[]) strArray14, 0, (int) '#');
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray14);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strComparableArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.lang.Float[] floatArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY;
        float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray0);
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 10L);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(intArray2, (int) (short) 1);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (int) (byte) -1, 1);
        int[] intArray11 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray12 = org.apache.commons.lang3.ArrayUtils.toObject(intArray11);
        int[] intArray15 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray16 = org.apache.commons.lang3.ArrayUtils.toObject(intArray15);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray16, (int) 'a');
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.clone(intArray18);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray18);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str22 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray21);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray21);
        java.lang.Double[] doubleArray28 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray28);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray28, 0.0d);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray28);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray28, (double) 10L);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) intArray21, (java.lang.Object) doubleArray34);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray21);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray18, intArray21);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.addAll(intArray2, intArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray38);
        int[] intArray40 = org.apache.commons.lang3.ArrayUtils.clone(intArray38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 0, 35, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 35, 0, 35]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 35, 0, 35]");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray4, (int) (byte) -1, 1);
        java.lang.Boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray4);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray11);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray11, true);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray11, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, true, true, false]");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray4);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        java.lang.Boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray7, (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(objMap5);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
        org.junit.Assert.assertNotNull(booleanArray8);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.clone(byteArray5);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (-1), (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (byte) 0);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1, (int) (byte) 100);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) 0);
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, -1, -1, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray10 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) -1);
        java.lang.Byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray10);
        java.lang.Character[] charArray19 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray19);
        java.lang.Character[] charArray21 = org.apache.commons.lang3.ArrayUtils.toObject(charArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray13, (java.lang.Object) charArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray5, (java.lang.Object[]) byteArray13);
        java.lang.Byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) shortArray3, (java.lang.Object[]) byteArray24);
        java.lang.Short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray26);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray7, (short) 1);
        java.lang.Short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray9, (short) (byte) 100, (int) '#');
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray9, (int) (byte) 0, 9);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[10, 10, 0]");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, 10.0f);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.clone(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.remove(floatArray2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[-1.0, 1.0]");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) '#');
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray9);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray9);
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.toObject(charArray9);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, 'a');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.addAll(charArray4, charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.add(charArray14, '#');
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
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, #]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#]");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 100, 0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray12, 8, 7);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.remove(byteArray12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (-1));
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray2, 0L, (int) (short) 10);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray4);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray4, (int) '4', 4);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[]");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        java.lang.Byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.Byte[] byteArray27 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray27, (byte) -1);
        java.lang.Byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        java.lang.Character[] charArray36 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray36);
        java.lang.Character[] charArray38 = org.apache.commons.lang3.ArrayUtils.toObject(charArray37);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray30, (java.lang.Object) charArray37);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) byteArray22, (java.lang.Object[]) byteArray30);
        java.lang.Byte[] byteArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray22);
        byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray41, (byte) -1);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray21, (java.lang.Object) byteArray41, (int) (byte) 100);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray41);
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
        org.junit.Assert.assertNotNull(byteArray22);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(intArray2, (int) (short) 1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(intArray2, (int) (short) 0);
        int[] intArray10 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.toObject(intArray10);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray11, (int) 'a');
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.clone(intArray13);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray14, (int) (short) 1, 0);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray14, 100);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.addAll(intArray2, intArray19);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[35, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 0, 35, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[35, 0]");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, 0.0d);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray0, (java.lang.Object) doubleArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray0);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) 2);
        java.lang.String[] strArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray20);
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
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) 5, (double) 100);
        double[] doubleArray8 = new double[] {};
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) (byte) 100, (double) (byte) 1);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray8);
        java.lang.Double[] doubleArray17 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray17);
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray17, 0.0d);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray17);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray21, (double) 10.0f, 10.0d);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray12, doubleArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray12);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray12);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) 100L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (int) (short) 0, (byte) 0);
        java.lang.Byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray9);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) 1);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) 100);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray14, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (-1), (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 1, -1, -1, 1, 100]");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray19 = new float[] { (-1L), (byte) 1 };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray19, (float) (byte) 10);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.clone(floatArray24);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray24, (int) '#', (int) 'a');
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.remove(floatArray24, (int) (byte) 0);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray24, (float) 10);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray16, floatArray24);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray16, 0, 8);
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
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        float[] floatArray42 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, 0, (float) 1);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.contains(floatArray8, (float) '#');
        float[] floatArray47 = new float[] { (-1L), (byte) 1 };
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray47, (float) (byte) 10);
        float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.add(floatArray47, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.clone(floatArray52);
        float[] floatArray56 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray52, (int) '#', (int) 'a');
        float[] floatArray58 = org.apache.commons.lang3.ArrayUtils.remove(floatArray52, (int) (byte) 0);
        float[] floatArray61 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray52, (int) (short) 0, (int) (byte) 0);
        float[] floatArray63 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray52, (float) 4);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray63);
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
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[1.0, -1.0, 1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[]");
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (-1), (int) (short) 100);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 100.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray4, (int) (short) -1, (int) '#');
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray10, false);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray10, false);
        boolean[] booleanArray20 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray20, true);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray24, true);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray10, booleanArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray27, false, 100);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray27, 3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, true, true, false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, true, true, false, false, true, false]");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(shortArray11, (short) 10);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, (short) (byte) 1);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray15);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray15);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 100, 1, 1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 100, 1]");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, 'a');
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, '4');
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, '4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, 0.0d);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray0, (java.lang.Object) doubleArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray0);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.ArrayUtils.add(charSequenceArray2, (java.lang.CharSequence) "");
        long[] longArray6 = new long[] { 1L };
        long[][] longArray7 = new long[][] { longArray6 };
        java.lang.Character[] charArray10 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        long[][] longArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (java.lang.Object) charArray10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, '#');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charSequenceArray4, (java.lang.Object) charArray14);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '4', (int) (byte) 1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray22, '#', 3);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.clone(charArray22);
        java.lang.Character[] charArray27 = org.apache.commons.lang3.ArrayUtils.toObject(charArray22);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray28);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.clone(charArray28);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) (short) 1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray6, 0.0f);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, (float) (short) -1, 10);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray8, (float) (byte) 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 1.0, 1.0]");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 5, 0, 2, 10, 4, 2 };
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        float[] floatArray10 = new float[] { (-1L), (byte) 1 };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray10, (float) (byte) 10);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray15);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, (int) '#', (int) 'a');
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.remove(floatArray15, (int) (byte) 0);
        float[] floatArray24 = new float[] { (-1L), (byte) 1 };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray24, (float) (byte) 10);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.clone(floatArray29);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray29, (int) '#', (int) 'a');
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray29);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.remove(floatArray29, 0);
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray21, floatArray29);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray21);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) intArray6, (java.lang.Object) floatArray21);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[-1.0, 1.0]");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, 10.0d, 4, 0.0d);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray8);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray14);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(shortArray15, (short) (byte) 10);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray15);
        short[] shortArray19 = null;
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray15, shortArray19);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray7);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8, (float) 4);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8);
        float[] floatArray14 = new float[] { (-1L), (byte) 1 };
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, (float) (byte) 10);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.add(floatArray14, (int) (byte) 1, (float) (byte) -1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, (float) 4, (int) (byte) 0);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) '4', (int) (byte) 100);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray25, (float) 10L, 100);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray11, floatArray25);
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
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.Object[] objArray0 = null;
        double[] doubleArray4 = new double[] { (short) 100, 1, (-1.0d) };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) 0.0f, (int) (short) 0);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, 0.0d, 10);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) (byte) 10);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray4, (double) '4', (int) (short) 10);
        double[] doubleArray19 = new double[] { (short) 100, 1, (-1.0d) };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) 0.0f, (int) (short) 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, 0.0d, 10);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) (byte) 10);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray4, doubleArray19);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray28, (int) '4', (int) (byte) 1);
        double[] doubleArray34 = org.apache.commons.lang3.ArrayUtils.add(doubleArray28, 0, (double) ' ');
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray34, (-1.0d), 0);
        double[] doubleArray41 = new double[] { (short) 100, 1, (-1.0d) };
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray41, (double) 0.0f, (int) (short) 0);
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray41, 0.0d, 10);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray41, (double) (byte) 10);
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray41, (double) '4', (int) (short) 10);
        double[] doubleArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray41, (double) ' ');
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray34, doubleArray41);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray41, (double) (short) 100, (int) '4');
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray0, (java.lang.Object) '4');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        short[] shortArray2 = new short[] { (short) 10, (byte) 0 };
        short[] shortArray5 = new short[] { (short) 10, (byte) 0 };
        short[] shortArray8 = new short[] { (short) 10, (byte) 0 };
        short[] shortArray11 = new short[] { (short) 10, (byte) 0 };
        short[] shortArray14 = new short[] { (short) 10, (byte) 0 };
        short[][] shortArray15 = new short[][] { shortArray2, shortArray5, shortArray8, shortArray11, shortArray14 };
        double[] doubleArray20 = new double[] { (byte) 1, (byte) 10, 4, (-1.0f) };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, (double) 1L, (double) (byte) -1);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray20, (double) 100.0f, (double) (byte) 10);
        short[][] shortArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray15, (java.lang.Object) boolean26);
        short[] shortArray28 = null;
        java.lang.Short[] shortArray32 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray32);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray33, (short) 0);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.clone(shortArray35);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray28, shortArray35);
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray28);
        short[][] shortArray39 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, shortArray38);
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.clone(shortArray38);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray40, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.remove(shortArray40, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[10, 0]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 10.0, 4.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[]");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap3 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray0);
        boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0);
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.lang.Boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(objMap3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[]");
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray6);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.io.Serializable[] serializableArray5 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[]) doubleArray1, (int) '#', 1);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) doubleArray1);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray7, 4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(serializableArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        long[] longArray1 = new long[] { 1L };
        long[][] longArray2 = new long[][] { longArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        long[][] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray5);
        long[][] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, 10, (int) ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray11);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        long[][] longArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray15);
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray17);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18, '4');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[]");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
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
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 100, 1, -1, 100, 1]");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray7);
        boolean[] booleanArray13 = new boolean[] { false, true, true, false };
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, true, 10);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray7, booleanArray13);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray13);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray13);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray21);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, true, false]");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) '#');
        int[] intArray10 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray11 = org.apache.commons.lang3.ArrayUtils.toObject(intArray10);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.clone(intArray10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray7, intArray12);
        int[] intArray14 = null;
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray12, intArray14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, 0]");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) '#');
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.subarray(intArray7, (int) 'a', (int) '#');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = wildcardClassArray2;
        java.lang.Class<?>[][] wildcardClassArray8 = org.apache.commons.lang3.ArrayUtils.toArray(wildcardClassArray5);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray10 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.reflect.AnnotatedElement[][]) wildcardClassArray5, 0);
        java.lang.Class[] classArray12 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        java.lang.Class[][] classArray15 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray16 = (java.lang.Class<?>[][]) classArray15;
        wildcardClassArray16[0] = wildcardClassArray13;
        java.lang.Class<?>[][] wildcardClassArray19 = org.apache.commons.lang3.ArrayUtils.toArray(wildcardClassArray16);
        java.lang.Double[] doubleArray24 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray24);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray24, 0.0d);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray24);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray24, (double) 10L);
        java.lang.Double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray24);
        java.lang.Double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray31);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) wildcardClassArray19, (java.lang.Object) doubleArray31);
        java.lang.Class<?>[][] wildcardClassArray34 = org.apache.commons.lang3.ArrayUtils.addAll(wildcardClassArray5, wildcardClassArray19);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray34);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(annotatedElementArray10);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertNotNull(wildcardClassArray19);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        double[] doubleArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray48, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray48, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) '#');
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray9, 'a');
        java.lang.Character[] charArray14 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray15);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.subarray(charArray16, (int) ' ', (int) '#');
        java.lang.Character[] charArray20 = org.apache.commons.lang3.ArrayUtils.toObject(charArray16);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray21);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray21);
        java.lang.Character[] charArray24 = org.apache.commons.lang3.ArrayUtils.toObject(charArray21);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray21, 'a');
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.addAll(charArray16, charArray26);
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.addAll(charArray9, charArray16);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray16);
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
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, #, #]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(shortArray11, (short) 10);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, (short) (byte) 1);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray15);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 100, 1, 1]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 100, 1, 100]");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, 3, (short) (byte) 100);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray11);
        java.lang.Short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray12);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[-1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[-1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, 1, 100]");
        org.junit.Assert.assertNotNull(shortArray13);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) (byte) -1, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray17, (double) 1);
        java.lang.String str26 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) doubleArray25);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.add(doubleArray25, 100.0d);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "{100.0,-1.0}" + "'", str26, "{100.0,-1.0}");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, -1.0, 100.0]");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray30);
        double[] doubleArray35 = new double[] { (short) 100, 1, (-1.0d) };
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, (double) 0.0f, (int) (short) 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, 0.0d, 10);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, (double) (byte) 10);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray35, (double) '4', (int) (short) 10);
        double[] doubleArray50 = new double[] { (short) 100, 1, (-1.0d) };
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray50, (double) 0.0f, (int) (short) 0);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray50, 0.0d, 10);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray50, (double) (byte) 10);
        double[] doubleArray59 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray35, doubleArray50);
        double[] doubleArray62 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray59, (int) '4', (int) (byte) 1);
        double[] doubleArray65 = org.apache.commons.lang3.ArrayUtils.add(doubleArray59, 0, (double) ' ');
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray65, (-1.0d), 0);
        int int71 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray65, (double) 0, (int) (short) 100);
        double[] doubleArray72 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray65);
        double[] doubleArray73 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray30, doubleArray72);
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray30, (double) 9, (double) (byte) 0);
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 1);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 4, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 100);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 1, 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 0, 3);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.clone(floatArray33);
        float[] floatArray38 = new float[] { (-1L), (byte) 1 };
        int int40 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray38, (float) (byte) 10);
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray38, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.clone(floatArray43);
        float[] floatArray47 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray43, (int) '#', (int) 'a');
        float[] floatArray49 = org.apache.commons.lang3.ArrayUtils.remove(floatArray43, (int) (byte) 0);
        int int51 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray43, (float) 10);
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray43, (int) '#', (int) (short) 1);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray54, (float) (short) -1, (int) '4');
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray35, floatArray54);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray54);
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
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray47), "[]");
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        long[] longArray1 = new long[] { 1L };
        long[][] longArray2 = new long[][] { longArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        long[][] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray5);
        long[][] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, 10, (int) ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray11);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        long[][] longArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray15);
        int[] intArray19 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray20 = org.apache.commons.lang3.ArrayUtils.toObject(intArray19);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray20, (int) 'a');
        java.lang.Integer[] intArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray20);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray20, 4);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.clone(intArray25);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.remove(intArray25, (int) (byte) 0);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray16, (java.lang.Object) intArray28);
        java.lang.Integer[] intArray30 = org.apache.commons.lang3.ArrayUtils.toObject(intArray28);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray28);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }
}

