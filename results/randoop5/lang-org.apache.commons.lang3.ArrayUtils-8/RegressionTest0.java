import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (-1), (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        float[] floatArray3 = new float[] { 100, 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, 100, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[100.0, 1.0, 1.0]");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = org.apache.commons.lang3.ArrayUtils.remove(charArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ,  , #, 4]");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        long[] longArray6 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray11 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (int) (byte) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100 };
        byte[][] byteArray9 = new byte[][] { byteArray2, byteArray5, byteArray8 };
        // The following exception was thrown during execution in test generation
        try {
            byte[][] byteArray11 = org.apache.commons.lang3.ArrayUtils.remove(byteArray9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100]");
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        char[] charArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.ArrayUtils.remove(intArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int0 = org.apache.commons.lang3.ArrayUtils.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.Double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 100);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) -1, (int) (byte) 1);
        java.lang.Character[] charArray17 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray18);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray11, (int) (byte) 100, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
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
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray2, (java.lang.Object) "hi!", (int) ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass11 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        long[] longArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) 0.0d, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0" + "'", str2, "0.0");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
        long[] longArray87 = new long[] { 1L };
        long[][] longArray88 = new long[][] { longArray87 };
        java.lang.Character[] charArray91 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray92 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray91);
        long[][] longArray93 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray88, (java.lang.Object) charArray91);
        boolean boolean94 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) annotatedElementArray85, (java.lang.Object[]) longArray88);
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
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[1]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int[] intArray0 = null;
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray5 = org.apache.commons.lang3.ArrayUtils.remove(longArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int[] intArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        boolean[] booleanArray5 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray11 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray17 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray23 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray29 = new boolean[] { true, false, false, false, true };
        boolean[][] booleanArray30 = new boolean[][] { booleanArray5, booleanArray11, booleanArray17, booleanArray23, booleanArray29 };
        boolean[] booleanArray36 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray42 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray48 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray54 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray60 = new boolean[] { true, false, false, false, true };
        boolean[][] booleanArray61 = new boolean[][] { booleanArray36, booleanArray42, booleanArray48, booleanArray54, booleanArray60 };
        boolean[] booleanArray67 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray73 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray79 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray85 = new boolean[] { true, false, false, false, true };
        boolean[] booleanArray91 = new boolean[] { true, false, false, false, true };
        boolean[][] booleanArray92 = new boolean[][] { booleanArray67, booleanArray73, booleanArray79, booleanArray85, booleanArray91 };
        boolean[][][] booleanArray93 = new boolean[][][] { booleanArray30, booleanArray61, booleanArray92 };
        boolean[] booleanArray94 = new boolean[] {};
        boolean[] booleanArray95 = new boolean[] {};
        boolean[] booleanArray96 = new boolean[] {};
        boolean[][] booleanArray97 = new boolean[][] { booleanArray94, booleanArray95, booleanArray96 };
        boolean[][] booleanArray98 = org.apache.commons.lang3.ArrayUtils.toArray(booleanArray97);
        boolean[][][] booleanArray99 = org.apache.commons.lang3.ArrayUtils.add(booleanArray93, booleanArray97);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray60), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray73), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray79), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray85), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray91), "[true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray92);
        org.junit.Assert.assertNotNull(booleanArray93);
        org.junit.Assert.assertNotNull(booleanArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray94), "[]");
        org.junit.Assert.assertNotNull(booleanArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray95), "[]");
        org.junit.Assert.assertNotNull(booleanArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray96), "[]");
        org.junit.Assert.assertNotNull(booleanArray97);
        org.junit.Assert.assertNotNull(booleanArray98);
        org.junit.Assert.assertNotNull(booleanArray99);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (-1.0f), (int) 'a');
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, 0.0f, 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.remove(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray0, '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        double[] doubleArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray0, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        double[] doubleArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 10, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 10L);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (double) 1);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) '#', (int) (short) 0, (double) 100L);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) 0L, (double) ' ');
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray7 = org.apache.commons.lang3.ArrayUtils.remove(longArray5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (int) '#', (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (int) (short) 0, (byte) 0);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.add(byteArray9, 1, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, -1, 1, -1, -1, 1]");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) 10L);
        java.lang.String str32 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) int30, "");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-1" + "'", str32, "-1");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray18, false);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray18, true, (int) (byte) 0);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        boolean[] booleanArray0 = new boolean[] {};
        boolean[] booleanArray1 = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        boolean[][] booleanArray3 = new boolean[][] { booleanArray0, booleanArray1, booleanArray2 };
        boolean[][] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toArray(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '[Z@2428e4ae', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, 100, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.Object[] objArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY;
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        double[] doubleArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = org.apache.commons.lang3.ArrayUtils.remove(intArray2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        long[] longArray10 = new long[] { 100L, 'a' };
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray10, (int) (short) 10, 100);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray13);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray13, (long) 0);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray16);
        java.io.Serializable[] serializableArray18 = org.apache.commons.lang3.ArrayUtils.removeElement((java.io.Serializable[]) byteArray4, (java.lang.Object) longArray17);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) longArray17);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        long[] longArray10 = new long[] { 100L, 'a' };
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray10, (int) (short) 10, 100);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray13);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray13, (long) 0);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray16);
        java.io.Serializable[] serializableArray18 = org.apache.commons.lang3.ArrayUtils.removeElement((java.io.Serializable[]) byteArray4, (java.lang.Object) longArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "{}", "", "0.0" };
        java.lang.String[] strArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray22);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray17, (java.lang.Object) strArray23);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.remove(floatArray14, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 2");
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
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, 1.0]");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap3 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '100.0', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, false);
        java.lang.Class<?> wildcardClass22 = booleanArray18.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int[] intArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) -1, (int) (byte) 1);
        java.lang.Character[] charArray17 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray18);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray21, (int) '#', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
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
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, 0.0d);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray0, (java.lang.Object) doubleArray5);
        float[] floatArray13 = new float[] { (-1L), (byte) 1 };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray13, (float) (byte) 10);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray13, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.clone(floatArray18);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray18, (int) '#', (int) 'a');
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray18);
        float[] floatArray26 = new float[] { (-1L), (byte) 1 };
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray26, (float) (byte) 10);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray26, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.clone(floatArray31);
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray31, (int) '#', (int) 'a');
        float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.remove(floatArray31, (int) (byte) 0);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray31, (int) (short) 0, (int) (byte) 0);
        int int43 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray31, (float) 10, 0);
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray31, (float) 'a');
        float[] floatArray46 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray23, floatArray31);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray5, (java.lang.Object) floatArray31);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[]");
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[-1.0, -1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray2 = new java.lang.Short[][] { shortArray0, shortArray1 };
        int[] intArray5 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(intArray5, (int) (short) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (int) (byte) -1, 1);
        java.lang.Short[][] shortArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (java.lang.Object) 1);
        java.lang.Short[] shortArray17 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray18, (short) 0);
        java.lang.Short[] shortArray24 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray24);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray18, shortArray25);
        java.lang.Short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short[][] shortArray28 = org.apache.commons.lang3.ArrayUtils.add(shortArray2, 5, shortArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray27);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '10.0', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = org.apache.commons.lang3.ArrayUtils.remove(charArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(charArray5, '#');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ,  , #, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray26, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.remove(shortArray29, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[10, 10]");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        java.lang.Character[] charArray13 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray7, (java.lang.Object) charArray14);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.subarray(charArray14, (int) (short) 10, 100);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray21, (int) (short) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[] classArray4 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray5 = (java.lang.Class<?>[]) classArray4;
        java.lang.Class[] classArray7 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray8 = (java.lang.Class<?>[]) classArray7;
        java.lang.Class[] classArray10 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        java.lang.Class[][] classArray13 = new java.lang.Class[4][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray14 = (java.lang.Class<?>[][]) classArray13;
        wildcardClassArray14[0] = classArray1;
        wildcardClassArray14[1] = wildcardClassArray5;
        wildcardClassArray14[2] = wildcardClassArray8;
        wildcardClassArray14[3] = classArray10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?>[][] wildcardClassArray24 = org.apache.commons.lang3.ArrayUtils.remove(wildcardClassArray14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) -1 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray5, (short) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        boolean[] booleanArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = org.apache.commons.lang3.ArrayUtils.remove(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0]");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray11 = org.apache.commons.lang3.ArrayUtils.remove(charArray9, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray7, (short) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, 10, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray7, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray18, (int) (byte) 1, (int) 'a');
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray30);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray31, (double) 1, (int) (short) -1, (double) '#');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.remove(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.Long[][] longArray0 = null;
        java.lang.Long[][] longArray1 = org.apache.commons.lang3.ArrayUtils.clone(longArray0);
        org.junit.Assert.assertNull(longArray1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Long[] longArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray4, (java.lang.Object) longArray6, (int) (short) 100);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        boolean[] booleanArray0 = new boolean[] {};
        boolean[] booleanArray1 = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        boolean[][] booleanArray3 = new boolean[][] { booleanArray0, booleanArray1, booleanArray2 };
        boolean[][] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toArray(booleanArray3);
        double[] doubleArray8 = new double[] { (short) 100, 1, (-1.0d) };
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 0.0f, (int) (short) 0);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, 0.0d, 10);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) (byte) 10);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) '4', (int) (short) 10);
        double[] doubleArray23 = new double[] { (short) 100, 1, (-1.0d) };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) 0.0f, (int) (short) 0);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, 0.0d, 10);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray23, (double) (byte) 10);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray8, doubleArray23);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray32, (int) '4', (int) (byte) 1);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, (double) (byte) 10);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) booleanArray3, (java.lang.Object) int37);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int[] intArray0 = null;
        java.lang.Integer[] intArray1 = org.apache.commons.lang3.ArrayUtils.toObject(intArray0);
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap4 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '#', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) boolean9, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        java.lang.Byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray5);
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
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        short[] shortArray0 = null;
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray8);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.Short[][][] shortArray0 = null;
        java.lang.Short[] shortArray2 = new java.lang.Short[] {};
        java.lang.Short[] shortArray3 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray4 = new java.lang.Short[][] { shortArray2, shortArray3 };
        int[] intArray7 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray8 = org.apache.commons.lang3.ArrayUtils.toObject(intArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, (int) (short) 1);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, (int) (byte) -1, 1);
        java.lang.Short[][] shortArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (java.lang.Object) 1);
        java.lang.Short[] shortArray15 = new java.lang.Short[] {};
        java.lang.Short[] shortArray16 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray17 = new java.lang.Short[][] { shortArray15, shortArray16 };
        int[] intArray20 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.toObject(intArray20);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(intArray20, (int) (short) 1);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, (int) (byte) -1, 1);
        java.lang.Short[][] shortArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray17, (java.lang.Object) 1);
        java.lang.Short[][] shortArray28 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Short[][][] shortArray29 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (int) '4', shortArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray28);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.ArrayUtils.add(charSequenceArray2, (java.lang.CharSequence) "");
        long[] longArray6 = new long[] { 1L };
        long[][] longArray7 = new long[][] { longArray6 };
        java.lang.Character[] charArray10 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        long[][] longArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (java.lang.Object) charArray10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, '#');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charSequenceArray4, (java.lang.Object) charArray14);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, 'a');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        double[] doubleArray0 = null;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        org.junit.Assert.assertNull(doubleArray1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        double[] doubleArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, 0.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY;
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) doubleArray0, "hi!");
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.remove(byteArray1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray3, (int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray3, 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        long[] longArray6 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) 0);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, 0L);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray30, (double) (byte) 10);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray30, (double) (-1));
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 1);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 1.0d, (int) '#');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray7);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = new float[] { (-1L), (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) '#', (int) 'a');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray21);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(floatArray13, (float) '#');
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray13);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) '#');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, (int) (byte) 1);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15, (byte) -1);
        java.lang.Byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray15);
        java.lang.Character[] charArray24 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray24);
        java.lang.Character[] charArray26 = org.apache.commons.lang3.ArrayUtils.toObject(charArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray18, (java.lang.Object) charArray25);
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.subarray(charArray25, (int) (short) 10, 100);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) (byte) 1, (java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        float[] floatArray0 = null;
        float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray0, (float) 5);
        org.junit.Assert.assertNull(floatArray2);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (short) -1, (int) (byte) 100);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.lang3.ArrayUtils.remove(charArray10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray6);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, -1, -1, 1, 100]");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, true, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray4);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(longArray4, (long) (short) 1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.Byte[] byteArray0 = null;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        float[] floatArray56 = new float[] { (-1L), (byte) 1 };
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray56, (float) (byte) 10);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.contains(floatArray56, (float) (-1L));
        float[] floatArray62 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray56, (float) 5);
        float[][] floatArray63 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, floatArray62);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap64 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) floatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '[F@1d7b657d', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray63);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        double[] doubleArray0 = null;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 100.0f, 2, (double) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        float[] floatArray2 = new float[] { (byte) -1, 100.0f };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.remove(floatArray2, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 10L);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, (double) 1);
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray12, (double) 5);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray14, 0.0d);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.ArrayUtils.add(charSequenceArray2, (java.lang.CharSequence) "");
        java.lang.CharSequence[] charSequenceArray7 = org.apache.commons.lang3.ArrayUtils.subarray(charSequenceArray2, (int) (byte) 10, (int) (short) 0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(objMap8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) -1 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 100);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray11, (byte) 1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray13);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, (int) (byte) 10, (double) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
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
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte[] byteArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) (short) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray6);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 1.0, -1.0]");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray12 = org.apache.commons.lang3.ArrayUtils.remove(longArray10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[10, 100, 35, 1]");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        boolean[] booleanArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.remove(shortArray1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        org.apache.commons.lang3.ArrayUtils.reverse(charArray22);
        java.lang.Character[] charArray24 = org.apache.commons.lang3.ArrayUtils.toObject(charArray22);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray26 = org.apache.commons.lang3.ArrayUtils.remove(charArray22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray24);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray9);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray9);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) '#');
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = org.apache.commons.lang3.ArrayUtils.remove(intArray7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean[] booleanArray24 = new boolean[] { false, true, true, false };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, true, 10);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray29);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray29, 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray32);
        boolean[] booleanArray39 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.add(booleanArray39, true);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.add(booleanArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray39);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.add(booleanArray18, 1, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray47, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[false, true, false, true, true, false, true]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray40 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray37, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 10");
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
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Map[] mapArray1 = new java.util.Map[0];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray2 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray1;
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        java.lang.Boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray4);
        java.util.Map<java.lang.Object, java.lang.Object> objMap9 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) booleanArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray10 = org.apache.commons.lang3.ArrayUtils.add(objMapArray2, 1, objMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mapArray1);
        org.junit.Assert.assertNotNull(objMapArray2);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertNotNull(objMap9);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 4);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray8);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 35]");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, true, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray30, (double) 10L);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray30, (int) (short) 1, 100);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, -1.0]");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray36);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int[] intArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray5 = new boolean[] { false, true, true, false };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true, 10);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (byte) -1, 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true, (int) (short) 1);
        boolean[] booleanArray15 = null;
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray15);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray15);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, true, true, false]");
        org.junit.Assert.assertNull(booleanArray17);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 100);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray0, (short) 10);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) (byte) -1);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, (short) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, 3, (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, -1]");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (int) (byte) 10, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 100]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        double[] doubleArray3 = new double[] { 1, ' ', (byte) 1 };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) (byte) 10);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) (byte) 100, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) 10L);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, 100.0d);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray9, (float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (int) '#', (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, 1.0]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        java.lang.CharSequence[][] charSequenceArray1 = org.apache.commons.lang3.ArrayUtils.clone(charSequenceArray0);
        org.junit.Assert.assertNull(charSequenceArray1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.remove(intArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = new float[] { (-1L), (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) '#', (int) 'a');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray21);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray29);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray29, (float) 10L, 0);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray29, (float) '#', 0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray4, (int) (short) -1, (int) '#');
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray10);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.add(booleanArray10, (int) (short) 1, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, true, true, true, false]");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEquals(obj0, (java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, true);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray7);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray7, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 100);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) (byte) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[]");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.add(shortArray3, (int) (short) 10, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100]");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (short) -1, (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, true);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray7, false, (int) (short) 1);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, -1.0, 1.0, 32.0]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Long[] longArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray4, (java.lang.Object) longArray6, (int) (short) 100);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray9, (long) (short) 0);
        long[] longArray13 = new long[] { ' ' };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray13);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.addAll(longArray13, longArray15);
        long[] longArray19 = new long[] { 100L, 'a' };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.subarray(longArray19, (int) (short) 10, 100);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray22);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray22, (long) 0);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray15, longArray22);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray11, longArray15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[32]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[32]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.subarray(longArray1, (int) (short) 1, (int) (byte) 100);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) (short) 1);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray10, 100L);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = org.apache.commons.lang3.ArrayUtils.remove(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray4, (int) (short) -1, (int) '#');
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray10);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.add(booleanArray10, true);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray15, false, (int) (byte) -1);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, 'a');
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray15, (byte) 0);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.add(byteArray15, (byte) 10);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray25 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray25, (byte) -1);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray27);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 100);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray30);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray15, byteArray30);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray15);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) int9, (java.lang.Object) boolean33);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (float) (short) 1);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray7 = new long[] { 100L, 'a' };
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray7, (int) (short) 10, 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray10);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray10, (long) 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray3, longArray10);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray10);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray10);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray10);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray24, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray19, '4');
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray6 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.toObject(intArray6);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray7, (int) 'a');
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray9);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.addAll(intArray2, intArray9);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str13 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray12);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray12);
        java.lang.Double[] doubleArray19 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray19);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray19, 0.0d);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray19);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray19, (double) 10L);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) intArray12, (java.lang.Object) doubleArray25);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray12);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray9, intArray12);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 0, 35, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{}" + "'", str13, "{}");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 0]");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean[] booleanArray24 = new boolean[] { false, true, true, false };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, true, 10);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray29);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray29, 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray32);
        boolean[] booleanArray39 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.add(booleanArray39, true);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.add(booleanArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray39);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray0, (int) ' ', 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        short[] shortArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray12 = new boolean[] { false, true, true, false };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray12, true, 10);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray12, false);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray18);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) -1, false);
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
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray2 = new java.lang.Short[][] { shortArray0, shortArray1 };
        int[] intArray5 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(intArray5, (int) (short) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (int) (byte) -1, 1);
        java.lang.Short[][] shortArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (java.lang.Object) 1);
        java.io.Serializable[][] serializableArray14 = org.apache.commons.lang3.ArrayUtils.remove((java.io.Serializable[][]) shortArray2, (int) (short) 0);
        java.lang.String[] strArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray18 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[][]) serializableArray14, 0, (java.lang.Object[]) strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: array element type mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(serializableArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 100);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray4);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, (float) 100L);
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
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        float[] floatArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, 'a');
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(charArray6, ' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (int) (short) 100, 100);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap7 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '10', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray6, "hi!");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "{35,0}" + "'", str8, "{35,0}");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        long[] longArray2 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toObject(longArray2);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray3, (long) 4);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (int) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 100]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray2);
        float[] floatArray9 = new float[] { (-1L), (byte) 1 };
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray9, (float) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.clone(floatArray14);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray14);
        float[] floatArray19 = new float[] { (-1L), (byte) 1 };
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray19, (float) (byte) 10);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.clone(floatArray24);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray24, (int) '#', (int) 'a');
        float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.remove(floatArray24, (int) (byte) 0);
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray24, (int) (short) 0, (int) (byte) 0);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray24, (float) 10, 0);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray24, (float) 'a');
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.remove(floatArray38, (int) (short) 1);
        float[] floatArray41 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray40);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray2, floatArray16);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray44 = org.apache.commons.lang3.ArrayUtils.remove(floatArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0, -1.0, 1.0]");
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
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[-1.0, -1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        long[] longArray2 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toObject(longArray2);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray3, (long) 4);
        java.lang.Long[] longArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray3);
        char[] charArray12 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.subarray(charArray13, (int) (short) -1, (int) (byte) 100);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray13);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray17, ' ');
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray6, (java.lang.Object) charArray17);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.subarray(charArray17, (int) 'a', 0);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray23);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.clone(charArray25);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray28 = org.apache.commons.lang3.ArrayUtils.remove(charArray26, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ,  , #, 4]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ,  , #, 4]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        java.lang.Short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY;
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) booleanArray0, (java.lang.Object[]) shortArray4);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String[][] strArray0 = new java.lang.String[][] {};
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(strArray0);
        boolean[] booleanArray6 = new boolean[] { false, true, true, false };
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true, 10);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.add(booleanArray6, false);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        java.lang.String str15 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray6, "");
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray0, (java.lang.Object) "");
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{false,true,true,false}" + "'", str15, "{false,true,true,false}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, 2, (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray27);
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
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, true);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray7);
        boolean[] booleanArray15 = new boolean[] { false, true, true, false };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, 10);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, false);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray20);
        boolean[] booleanArray27 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray27, true);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray20, booleanArray29);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray20);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray20);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 10L, 100L, 100L };
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 1L, 10L, 100L, 100L };
        java.lang.Long[][] longArray12 = new java.lang.Long[][] { longArray5, longArray11 };
        long[] longArray16 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray16);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray17, (long) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long[][] longArray20 = org.apache.commons.lang3.ArrayUtils.add(longArray12, (int) (short) -1, longArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[10, 100]");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        long[] longArray6 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(longArray6, (long) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray6, (long) '#', 1);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray3, (int) '#', (int) (short) 10);
        long[] longArray11 = null;
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray3, longArray12);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray7, 10.0f);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray11, (-1.0f));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, 100, (int) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray0);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) ' ', 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray0, (long) (byte) -1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray0);
        long[] longArray8 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(longArray8, (long) 0);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(longArray8, 0L);
        long[] longArray15 = new long[] { 100L, 'a' };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (short) 10, 100);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray18);
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray18, (long) 0);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.subarray(longArray21, (-1), 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray21);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray21, (int) (byte) 0, 100);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray21, (long) 1);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray21);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) shortArray1, (java.lang.Object) longArray21, 2);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[1, 100, 1, 100, 52, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = org.apache.commons.lang3.ArrayUtils.remove(charArray19, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.ArrayUtils.add(charSequenceArray2, (java.lang.CharSequence) "");
        long[] longArray6 = new long[] { 1L };
        long[][] longArray7 = new long[][] { longArray6 };
        java.lang.Character[] charArray10 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        long[][] longArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (java.lang.Object) charArray10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, '#');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charSequenceArray4, (java.lang.Object) charArray14);
        java.lang.Byte[] byteArray20 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray20, (byte) -1);
        java.lang.Byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
        java.lang.Character[] charArray29 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray29);
        java.lang.Character[] charArray31 = org.apache.commons.lang3.ArrayUtils.toObject(charArray30);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray23, (java.lang.Object) charArray30);
        char[] charArray33 = org.apache.commons.lang3.ArrayUtils.clone(charArray30);
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.addAll(charArray14, charArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray33);
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
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "##4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "##4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, #, 4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        java.lang.Character[] charArray86 = new java.lang.Character[] {};
        java.lang.Character[] charArray87 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray86);
        long[] longArray90 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray91 = org.apache.commons.lang3.ArrayUtils.toObject(longArray90);
        int int93 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray87, (java.lang.Object) longArray91, 1);
        long[] longArray94 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray91);
        long[] longArray96 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray91, 0L);
        boolean boolean98 = org.apache.commons.lang3.ArrayUtils.contains(longArray96, (long) 100);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray99 = org.apache.commons.lang3.ArrayUtils.removeElement(annotatedElementArray76, (java.lang.Object) boolean98);
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
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray90), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(longArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray94), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray96), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(annotatedElementArray99);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Double[] doubleArray7 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7, 0.0d);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray7, (double) 10L);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) intArray0, (java.lang.Object) doubleArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray15 = new boolean[] { false, true, true, false };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, 10);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray15, (int) (byte) -1, 1);
        java.lang.Boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray22);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray23, true);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, false);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.ArrayUtils.add(charSequenceArray2, (java.lang.CharSequence) "");
        long[] longArray6 = new long[] { 1L };
        long[][] longArray7 = new long[][] { longArray6 };
        java.lang.Character[] charArray10 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        long[][] longArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray7, (java.lang.Object) charArray10);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, '#');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charSequenceArray4, (java.lang.Object) charArray14);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charSequenceArray4);
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
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        char[] charArray1 = new char[] { '#' };
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.toObject(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNotNull(charArray2);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray9, 1);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray12);
        boolean[] booleanArray14 = null;
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray12, booleanArray14);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean[] booleanArray24 = new boolean[] { false, true, true, false };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, true, 10);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray29);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray29, 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray32);
        boolean[] booleanArray39 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.add(booleanArray39, true);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.add(booleanArray39, false);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray39);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.add(booleanArray18, 1, true);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.add(booleanArray48, (int) (byte) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray48, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[false, true, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[false, false, false, true, true, false, true]");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        float[] floatArray44 = new float[] { (-1L), (byte) 1 };
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray44, (float) (byte) 10);
        float[] floatArray49 = org.apache.commons.lang3.ArrayUtils.add(floatArray44, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.clone(floatArray49);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray49, (int) '#', (int) 'a');
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray49);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray30, floatArray54);
        int int58 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray54, (float) 4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray60 = org.apache.commons.lang3.ArrayUtils.remove(floatArray54, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[-1.0, -1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 100);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (int) (byte) 100, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        float[] floatArray44 = new float[] { (-1L), (byte) 1 };
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray44, (float) (byte) 10);
        float[] floatArray49 = org.apache.commons.lang3.ArrayUtils.add(floatArray44, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray50 = org.apache.commons.lang3.ArrayUtils.clone(floatArray49);
        float[] floatArray53 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray49, (int) '#', (int) 'a');
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray49);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray30, floatArray54);
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray30, (float) 10);
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
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray44), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray50), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray53), "[]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[-1.0, -1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray5, (short) (byte) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray5, (short) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Character[] charArray0 = null;
        char[] charArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        org.junit.Assert.assertNull(charArray1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray1, (short) 0, (int) (short) 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray1, (short) -1, (-1));
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray14 = new boolean[] { true, false, true, true, true, false };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.apache.commons.lang3.ArrayUtils.reverse(charArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray22, '4', (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (byte) 100, (double) (byte) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray4, (double) 8, (double) 5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        float[] floatArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 5);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.add(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35]");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 2, 1, 5, 8, 1 };
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 2, 1, 5, 8, 1 };
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 2, 1, 5, 8, 1 };
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 2, 1, 5, 8, 1 };
        java.lang.Integer[][] intArray28 = new java.lang.Integer[][] { intArray6, intArray13, intArray20, intArray27 };
        java.lang.Integer[] intArray29 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray30 = new java.lang.Integer[][] { intArray29 };
        java.lang.Integer[][] intArray31 = org.apache.commons.lang3.ArrayUtils.addAll(intArray28, intArray30);
        long[] longArray34 = new long[] { 100L, 'a' };
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.subarray(longArray34, (int) (short) 10, 100);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray37);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray37, (long) 0);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray40, (long) 4, (int) '4');
        long[] longArray47 = new long[] { 10L, 100L, '#' };
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray47);
        java.lang.Long[] longArray49 = org.apache.commons.lang3.ArrayUtils.toObject(longArray47);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray40, longArray47);
        java.lang.Long[] longArray51 = org.apache.commons.lang3.ArrayUtils.toObject(longArray47);
        long[] longArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray51);
        java.lang.Long[] longArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray51);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][] serializableArray54 = org.apache.commons.lang3.ArrayUtils.add((java.io.Serializable[][]) intArray30, (java.io.Serializable[]) longArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [Ljava.lang.Long;");
        } catch (java.lang.ArrayStoreException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray47), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray52), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray53);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, 2, (short) 100);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.add(shortArray9, 2, (short) (byte) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray9);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, 100, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[-1, 100, -1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        long[] longArray10 = new long[] { 100L, 'a' };
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.subarray(longArray10, (int) (short) 10, 100);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray13);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray13, (long) 0);
        java.lang.Long[] longArray17 = org.apache.commons.lang3.ArrayUtils.toObject(longArray16);
        java.io.Serializable[] serializableArray18 = org.apache.commons.lang3.ArrayUtils.removeElement((java.io.Serializable[]) byteArray4, (java.lang.Object) longArray17);
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray23);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray24, (double) 1);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) longArray17, (java.lang.Object) doubleArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray26, (double) 8, 2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray5);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 35]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (int) ' ', (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray15);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray23 = org.apache.commons.lang3.ArrayUtils.add(longArray20, (int) '4', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[32]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (byte) 100, (double) (byte) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray9 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray9);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, 0.0d);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 10.0f, 10.0d);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 100);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray3, 1, 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 0, (int) (byte) 100);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.remove(shortArray6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = new float[] { (-1L), (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) '#', (int) 'a');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray21);
        java.lang.Class<?> wildcardClass30 = floatArray29.getClass();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray7, true);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray7);
        boolean[] booleanArray15 = new boolean[] { false, true, true, false };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, 10);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, false);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray20);
        boolean[] booleanArray27 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray27, true);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray20, booleanArray29);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray20);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray20);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray10, true);
        java.lang.String str35 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{false,false,true,true,false,true}" + "'", str35, "{false,false,true,true,false,true}");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = new float[] { (-1L), (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) '#', (int) 'a');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray21);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray29);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray29, (float) 10L, 0);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray29, (float) (byte) -1, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        java.lang.Float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray12);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray13, (float) 3);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.add(floatArray15, 8, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 3");
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
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (-1), (int) ' ');
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray8, (float) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (short) -1, 5);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[32]");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray0);
        java.lang.Short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[]");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.Object obj0 = null;
        java.lang.Character[] charArray3 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4, ' ');
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray6, '#');
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, ' ', (int) (byte) 0);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.remove(charArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameType(obj0, (java.lang.Object) charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9, 0L);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray11);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) -1, (int) (byte) 1);
        java.lang.Character[] charArray17 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray18);
        java.lang.String str20 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean19);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "false" + "'", str20, "false");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 100);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray10);
        java.lang.String str12 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) byteArray10);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{1,-1,-1,1,100}" + "'", str12, "{1,-1,-1,1,100}");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean[] booleanArray24 = new boolean[] { false, true, true, false };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, true, 10);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray29);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray29, 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray32);
        boolean[] booleanArray34 = null;
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray34);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.add(booleanArray18, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.String str29 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean27, "{4}");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "false" + "'", str29, "false");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray5, (long) ' ');
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray5, (long) (short) 0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.Byte[] byteArray1 = new java.lang.Byte[] { (byte) -1 };
        java.lang.Byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray1, (byte) 1);
        java.lang.Byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray1);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 0);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray13 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray13, (byte) -1);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray15, (byte) 100);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray8, byteArray18);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray19, (byte) 0);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) byteArray7, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray24 = org.apache.commons.lang3.ArrayUtils.remove(longArray22, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (int) 'a', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.Object obj0 = null;
        java.lang.String str1 = org.apache.commons.lang3.ArrayUtils.toString(obj0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) '#');
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap9 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '#', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 100, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) 0, (int) ' ');
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray5, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) 5);
        float[] floatArray21 = new float[] { (-1L), (byte) 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray21, (float) (byte) 10);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(floatArray21, (float) (-1L));
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray21, (float) 5);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray27);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray27);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray29, 1.0f);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, -1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray10, 0);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray10, true, 0);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, false, false]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[][] intArray5 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4 };
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        int[][] intArray11 = new int[][] { intArray6, intArray7, intArray8, intArray9, intArray10 };
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        int[] intArray16 = new int[] {};
        int[][] intArray17 = new int[][] { intArray12, intArray13, intArray14, intArray15, intArray16 };
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        int[] intArray22 = new int[] {};
        int[][] intArray23 = new int[][] { intArray18, intArray19, intArray20, intArray21, intArray22 };
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        int[] intArray27 = new int[] {};
        int[] intArray28 = new int[] {};
        int[][] intArray29 = new int[][] { intArray24, intArray25, intArray26, intArray27, intArray28 };
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        int[][] intArray35 = new int[][] { intArray30, intArray31, intArray32, intArray33, intArray34 };
        int[][][] intArray36 = new int[][][] { intArray5, intArray11, intArray17, intArray23, intArray29, intArray35 };
        int[][][] intArray37 = org.apache.commons.lang3.ArrayUtils.clone(intArray36);
        // The following exception was thrown during execution in test generation
        try {
            int[][][] intArray39 = org.apache.commons.lang3.ArrayUtils.remove(intArray36, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        char[] charArray5 = new char[] { '4', ' ', ' ', '#', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (short) -1, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.clone(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray11, (int) 'a', '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4  #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4  #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  , #, 4]");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = new float[] { (-1L), (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) '#', (int) 'a');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray21);
        int[] intArray32 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray33 = org.apache.commons.lang3.ArrayUtils.toObject(intArray32);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) floatArray21, (java.lang.Object) intArray33);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray0);
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 0);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray8);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = org.apache.commons.lang3.ArrayUtils.clone(annotatedElementArray0);
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) annotatedElementArray0);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{}" + "'", str2, "{}");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray5, '#');
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, ' ');
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int[] intArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.Object obj0 = null;
        java.lang.Character[] charArray6 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameType(obj0, (java.lang.Object) charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.Character[] charArray0 = null;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, 'a');
        org.junit.Assert.assertNull(charArray2);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.Short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        int int57 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray40, (double) (short) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray59 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray40, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 3");
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) 10L);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray27, (double) 1.0f, (double) 1.0f);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, 0, (double) 0.0f);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        char[] charArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, 1.0f, 5);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray7, (float) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 'a');
        float[] floatArray12 = new float[] { (-1L), (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray12, (float) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray17);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) '#', (int) 'a');
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray17);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray17);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray17);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray7);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray30);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.subarray(longArray1, (int) (short) 100, (int) (byte) 0);
        java.lang.Long[] longArray5 = org.apache.commons.lang3.ArrayUtils.toObject(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) longArray1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        boolean[] booleanArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray0, false, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 10.0, -1.0, 10.0]");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.Byte[][] byteArray0 = new java.lang.Byte[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Byte[][] byteArray2 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray2);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(objArray0, (java.lang.Object) doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.add(doubleArray4, (int) (byte) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray21, true);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray10 = org.apache.commons.lang3.ArrayUtils.remove(shortArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 100]");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (-1), (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        long[] longArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(longArray0, (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, 100, (int) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray0);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) 4);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) '#');
        java.lang.Character[] charArray8 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray12 = org.apache.commons.lang3.ArrayUtils.remove(charArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(shortArray4, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass11 = longArray3.getClass();
        java.lang.Character[] charArray17 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray18);
        boolean[] booleanArray24 = new boolean[] { false, true, true, false };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, true, 10);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray24);
        java.lang.Object[] objArray31 = new java.lang.Object[] { charArray19, booleanArray24 };
        double[] doubleArray35 = new double[] { (short) 100, 1, (-1.0d) };
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, (double) 0.0f, (int) (short) 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, 0.0d, 10);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, (double) (byte) 10);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray35, (double) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass47 = doubleArray35.getClass();
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray19, (java.lang.Object) wildcardClass47, 0);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray50 = new java.lang.reflect.GenericDeclaration[] { wildcardClass11, wildcardClass47 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray51 = org.apache.commons.lang3.ArrayUtils.toArray(genericDeclarationArray50);
        java.lang.String str53 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) genericDeclarationArray50, "{false,true,true,false}");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[[4, a,  , a, 4], [false, true, true, false]]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(genericDeclarationArray50);
        org.junit.Assert.assertNotNull(genericDeclarationArray51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "{class [J,class [D}" + "'", str53, "{class [J,class [D}");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        org.apache.commons.lang3.ArrayUtils.reverse(charArray19);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray19);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray24);
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10, (short) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) -1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray12);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray16);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray16);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) (byte) 10, (int) ' ');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray15, shortArray16);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.remove(shortArray16, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass11 = longArray3.getClass();
        java.lang.Character[] charArray17 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        java.lang.Character[] charArray19 = org.apache.commons.lang3.ArrayUtils.toObject(charArray18);
        boolean[] booleanArray24 = new boolean[] { false, true, true, false };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, true, 10);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray24);
        java.lang.Object[] objArray31 = new java.lang.Object[] { charArray19, booleanArray24 };
        double[] doubleArray35 = new double[] { (short) 100, 1, (-1.0d) };
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, (double) 0.0f, (int) (short) 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, 0.0d, 10);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray35, (double) (byte) 10);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray35, (double) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass47 = doubleArray35.getClass();
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray19, (java.lang.Object) wildcardClass47, 0);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray50 = new java.lang.reflect.GenericDeclaration[] { wildcardClass11, wildcardClass47 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray51 = org.apache.commons.lang3.ArrayUtils.toArray(genericDeclarationArray50);
        java.lang.Double[] doubleArray56 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray57 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray56);
        java.lang.Long[] longArray58 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int60 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray56, (java.lang.Object) longArray58, (int) (short) 100);
        long[] longArray61 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray58);
        long[] longArray63 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray61, (long) (short) 0);
        long[] longArray66 = org.apache.commons.lang3.ArrayUtils.subarray(longArray61, 5, 10);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray67 = org.apache.commons.lang3.ArrayUtils.removeElement((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray50, (java.lang.Object) 5);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[[4, a,  , a, 4], [false, true, true, false]]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(genericDeclarationArray50);
        org.junit.Assert.assertNotNull(genericDeclarationArray51);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray61), "[]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[]");
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray66), "[]");
        org.junit.Assert.assertNotNull(annotatedElementArray67);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) (short) 10);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (long) (short) 10);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (int) (short) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 97]");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "", "hi!" };
        java.lang.CharSequence[] charSequenceArray4 = org.apache.commons.lang3.ArrayUtils.add(charSequenceArray2, (java.lang.CharSequence) "");
        boolean[] booleanArray9 = new boolean[] { false, true, true, false };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray9, true, 10);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray9, (int) (byte) -1, 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charSequenceArray4, (java.lang.Object) (byte) -1, 0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray1, (long) (byte) -1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32]");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray11 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray11, (byte) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray13);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.add(byteArray13, (byte) 100);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray6, byteArray16);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray17, (byte) 10);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.clone(byteArray17);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) intArray3, (java.lang.Object) byteArray20);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        java.lang.Character[] charArray13 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray7, (java.lang.Object) charArray14);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray14, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray14, (int) 'a', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a,  , a, 4, a]");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray4);
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, true);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[false, true, true, false, true]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (-1), 0);
        long[] longArray15 = new long[] { 10L, 100L, '#' };
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray15, (long) (short) 0, (-1));
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (short) 0, 100);
        long[] longArray24 = new long[] { ' ' };
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray24);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.addAll(longArray24, longArray26);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray27);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray22, longArray27);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray27, 1L);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.subarray(longArray31, (int) (byte) 10, 3);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray31);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray31, (long) 10, 3);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[32]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[32]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[32]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, 0.0d);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray0, (java.lang.Object) doubleArray5);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.lang.Comparable<java.lang.String>[]) strArray0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) 10L);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray27, (double) (short) 1);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) (short) -1, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = org.apache.commons.lang3.ArrayUtils.add(doubleArray27, (int) 'a', (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 6");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        double[] doubleArray3 = new double[] { 10.0f, (short) 10, 'a' };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (double) 100L);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray3);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, 0, 5);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (double) (byte) 0, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 100);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 10);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.clone(byteArray11);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray14, (byte) 0, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray5, (java.lang.Object) "{}");
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray5);
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) charArray5, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray7);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        double[] doubleArray0 = null;
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
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray19, (int) (byte) 1, (int) 'a');
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray31);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) (short) 100, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray5, (long) ' ');
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray5, (-1L), 5);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(floatArray2, (float) (-1L));
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (-1L));
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray2);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(floatArray9, (float) 100);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(floatArray9, (float) 2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Long[] longArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) doubleArray4, (java.lang.Object) longArray6, (int) (short) 100);
        java.lang.Object obj9 = null;
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray4, obj9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        java.lang.Short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray3);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray6);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray7);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray8);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.Boolean[] booleanArray0 = null;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        org.junit.Assert.assertNull(booleanArray2);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (int) (short) 100, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray2, (int) (short) 100, 0);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 0);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 100);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.remove(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        char[] charArray5 = new char[] { ' ', '#', '#', '#', 'a' };
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(charArray5, '#');
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, 'a', (int) 'a');
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray5, '4', (int) ' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ###a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ###a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, #, #, a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray18 = new double[] { 10.0f, (short) 10, 'a' };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.add(doubleArray18, (double) 100L);
        double[] doubleArray25 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray24);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray25, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 7");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, -1.0, 10.0, 10.0, 97.0, 100.0]");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int[][][][] intArray0 = null;
        int[][][][] intArray3 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (-1), (int) (byte) 0);
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, 0.0d);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 10L);
        java.lang.Double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.lang.Object[] objArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        long[] longArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(longArray0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(longArray3);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray3, (int) (short) 0, 100);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray10, (long) (short) 100);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) (short) 1);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[10, 100, 35]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 35]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray7);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray5, (long) '#', 1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        org.apache.commons.lang3.ArrayUtils.reverse(charArray19);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray19);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.clone(charArray19);
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[]");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) '4', (int) (short) 10);
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0, -1.0]");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.Short[] shortArray0 = new java.lang.Short[] {};
        java.lang.Short[] shortArray1 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray2 = new java.lang.Short[][] { shortArray0, shortArray1 };
        int[] intArray5 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(intArray5, (int) (short) 1);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, (int) (byte) -1, 1);
        java.lang.Short[][] shortArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray2, (java.lang.Object) 1);
        java.lang.Short[] shortArray13 = new java.lang.Short[] {};
        java.lang.Short[] shortArray14 = new java.lang.Short[] {};
        java.lang.Short[][] shortArray15 = new java.lang.Short[][] { shortArray13, shortArray14 };
        int[] intArray18 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray19 = org.apache.commons.lang3.ArrayUtils.toObject(intArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(intArray18, (int) (short) 1);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray18, (int) (byte) -1, 1);
        java.lang.Short[][] shortArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray15, (java.lang.Object) 1);
        java.lang.Short[][] shortArray26 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray2, shortArray25);
        java.lang.Class<?> wildcardClass27 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 5);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = org.apache.commons.lang3.ArrayUtils.remove(intArray4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[5]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[5, 100]");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.Object[] objArray0 = null;
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4, (short) (byte) 1);
        java.lang.Byte[] byteArray12 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray12, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray14);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray14, (byte) 100);
        java.lang.Byte[] byteArray22 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray22, (byte) -1);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray24);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.add(byteArray24, (byte) 100);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray14, byteArray24);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) shortArray4, (java.lang.Object) byteArray28);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(objArray0, (java.lang.Object) shortArray4, 1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, -1, -1, 1, 1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        long[] longArray2 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toObject(longArray2);
        long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray2, (int) (byte) 0, 0L);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, 10, 100]");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String str2 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) "{1,-1,-1,1,1,-1,-1,1}", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{1,-1,-1,1,1,-1,-1,1}" + "'", str2, "{1,-1,-1,1,1,-1,-1,1}");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray7);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) 100);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray10);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray11, (byte) 0);
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
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, ' ');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray5, (int) (short) 1, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.subarray(charArray5, 100, 1);
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray21, (byte) 100);
        java.lang.Short[] shortArray51 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray51);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray52, (short) 0);
        java.lang.Short[] shortArray58 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray58);
        short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray52, shortArray59);
        java.lang.Short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray52);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray52);
        int int64 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray52, (short) 0);
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) byteArray21, (java.lang.Object) (short) 0, 0);
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
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[-1, 100, 1, -1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        double[] doubleArray3 = new double[] { 10.0f, (short) 10, 'a' };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (double) 100L);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray3);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (-1.0f), 100, (double) (-1));
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, 1.0d, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        long[] longArray1 = new long[] { 1L };
        long[][] longArray2 = new long[][] { longArray1 };
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray5);
        long[][] longArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, (java.lang.Object) charArray5);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, '4');
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
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(longArray3, (long) 0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.apache.commons.lang3.ArrayUtils.reverse(charArray19);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray19);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray26 = org.apache.commons.lang3.ArrayUtils.remove(charArray24, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Integer[] intArray6 = new java.lang.Integer[] { 1, 2, 1, 5, 8, 1 };
        java.lang.Integer[] intArray13 = new java.lang.Integer[] { 1, 2, 1, 5, 8, 1 };
        java.lang.Integer[] intArray20 = new java.lang.Integer[] { 1, 2, 1, 5, 8, 1 };
        java.lang.Integer[] intArray27 = new java.lang.Integer[] { 1, 2, 1, 5, 8, 1 };
        java.lang.Integer[][] intArray28 = new java.lang.Integer[][] { intArray6, intArray13, intArray20, intArray27 };
        java.lang.Integer[] intArray29 = new java.lang.Integer[] {};
        java.lang.Integer[][] intArray30 = new java.lang.Integer[][] { intArray29 };
        java.lang.Integer[][] intArray31 = org.apache.commons.lang3.ArrayUtils.addAll(intArray28, intArray30);
        boolean[] booleanArray36 = new boolean[] { false, true, true, false };
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray36, true, 10);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray36, (int) (short) -1, (int) '#');
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray42, false);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray42);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.add(booleanArray42, true);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) intArray28, (java.lang.Object) booleanArray47);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(longArray2, (long) (short) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray2, (long) ' ', (-1));
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.Object[] objArray0 = null;
        java.util.Map<java.lang.Object, java.lang.Object> objMap1 = org.apache.commons.lang3.ArrayUtils.toMap(objArray0);
        org.junit.Assert.assertNull(objMap1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = new float[] { (-1L), (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) '#', (int) 'a');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray21);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(floatArray13, (float) '#');
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY;
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray13, floatArray32);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray13, (float) (byte) -1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray8);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[32]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 100);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray3, 1, 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 0, (int) (byte) 100);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 0);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.remove(shortArray13, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(floatArray2, (float) (-1L));
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray2, (float) 5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 2);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        char[] charArray1 = new char[] { '4' };
        char[] charArray3 = new char[] { '4' };
        char[] charArray5 = new char[] { '4' };
        char[] charArray7 = new char[] { '4' };
        char[] charArray9 = new char[] { '4' };
        char[][] charArray10 = new char[][] { charArray1, charArray3, charArray5, charArray7, charArray9 };
        char[] charArray12 = new char[] { '4' };
        char[] charArray14 = new char[] { '4' };
        char[] charArray16 = new char[] { '4' };
        char[] charArray18 = new char[] { '4' };
        char[] charArray20 = new char[] { '4' };
        char[][] charArray21 = new char[][] { charArray12, charArray14, charArray16, charArray18, charArray20 };
        char[] charArray23 = new char[] { '4' };
        char[] charArray25 = new char[] { '4' };
        char[] charArray27 = new char[] { '4' };
        char[] charArray29 = new char[] { '4' };
        char[] charArray31 = new char[] { '4' };
        char[][] charArray32 = new char[][] { charArray23, charArray25, charArray27, charArray29, charArray31 };
        char[][][] charArray33 = new char[][][] { charArray10, charArray21, charArray32 };
        char[][][] charArray34 = org.apache.commons.lang3.ArrayUtils.toArray(charArray33);
        java.util.Map<java.lang.Object, java.lang.Object> objMap35 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) charArray34);
        char[][] charArray38 = null;
        char[][][] charArray39 = org.apache.commons.lang3.ArrayUtils.add(charArray34, 0, charArray38);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[4]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(objMap35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(charArray39);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean[] booleanArray24 = new boolean[] { false, true, true, false };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, true, 10);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray29);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray29, 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray32);
        boolean[] booleanArray38 = new boolean[] { false, true, true, false };
        int int41 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray38, true, 10);
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray38, (int) (short) -1, (int) '#');
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray44, false);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray46, false);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray48, false);
        boolean[] booleanArray51 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray48);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray18, booleanArray51);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[true, true]");
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[true, true]");
        org.junit.Assert.assertNotNull(booleanArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray51), "[true, true]");
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[false, false, true, true, false, true, true, true]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.remove(floatArray2, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        float[] floatArray0 = null;
        java.lang.Float[] floatArray1 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray0);
        org.junit.Assert.assertNull(floatArray1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray25);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray25, (float) 2);
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
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray4, (int) (short) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false]");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        long[] longArray2 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toObject(longArray2);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, 10L);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray2, (long) 1, 0);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray2, (long) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray26, (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.remove(shortArray26, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[10, 10]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) booleanArray0);
        java.lang.Boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        java.lang.Boolean[] booleanArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray3);
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[]");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray18);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray20, true);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray22, true, 100);
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray22, 3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[false, false, true, false, true]");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.Integer[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray5, (byte) 10);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 10, 1);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray18, (byte) 0);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.add(byteArray18, (byte) 10);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        java.lang.Byte[] byteArray28 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray28, (byte) -1);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray30);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.add(byteArray30, (byte) 100);
        byte[] byteArray34 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray23, byteArray33);
        byte[] byteArray35 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray18, byteArray33);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.clone(byteArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray12, byteArray36);
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray36, (byte) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 1, 100, 100, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 1, 100, 100, 0, 1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 'a');
        float[] floatArray12 = new float[] { (-1L), (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray12, (float) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray17);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray17, (int) '#', (int) 'a');
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray17);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray17);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray7, floatArray17);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray17, 5, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        long[] longArray1 = new long[] { ' ' };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.addAll(longArray1, longArray3);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.subarray(longArray1, (int) (short) 1, (int) (byte) 100);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) (short) 1);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray10, (long) '4');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[32, 1]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[32, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray14 = new boolean[] { true, false, true, true, true, false };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray14);
        boolean[] booleanArray20 = new boolean[] { false, true, true, false };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray20, true, 10);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.add(booleanArray20, false);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray25);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray25, 1);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray14, booleanArray28);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.add(booleanArray29, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[true, false, true, true, true, false, false, true, false, false]");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) -1 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        float[] floatArray10 = new float[] { (-1L), (byte) 1 };
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray10, (float) (byte) 10);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.clone(floatArray15);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, (int) '#', (int) 'a');
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.remove(floatArray15, (int) (byte) 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray15, (float) 10);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray15);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray24, (float) 1L);
        java.lang.Float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray24);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) shortArray3, (java.lang.Object[]) floatArray27);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, -1]");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, 0.0d);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray0, (java.lang.Object) doubleArray5);
        int int11 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray0);
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15, (short) 1);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray15);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray15);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) strArray0, (java.lang.Object[]) shortArray19);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[10, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray5 = new boolean[] { false, true, true, false };
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true, 10);
        boolean[] booleanArray11 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (short) -1, (int) '#');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray11, false);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray11, false);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray15, (int) (short) 0);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray15);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(booleanArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray11), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, true, false]");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 100.0f, (double) 2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        short[] shortArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray0, (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.io.Serializable[] serializableArray5 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[]) doubleArray1, (int) '#', 1);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, (double) 'a');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(serializableArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        short[] shortArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(shortArray0, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) -1, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = org.apache.commons.lang3.ArrayUtils.remove(charArray11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, 0, (double) (byte) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.add(doubleArray9, 3, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double[] doubleArray3 = new double[] { 10.0f, (short) 10, 'a' };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (double) 100L);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray3);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, 0, 5);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray3, (double) (-1L));
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = wildcardClassArray2;
        java.lang.Class<?>[][] wildcardClassArray8 = org.apache.commons.lang3.ArrayUtils.toArray(wildcardClassArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration[][] genericDeclarationArray10 = org.apache.commons.lang3.ArrayUtils.remove((java.lang.reflect.GenericDeclaration[][]) wildcardClassArray5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 4, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray24, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, -1.0, 10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray3);
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        long[] longArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray0, (long) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(byteArray5, (byte) 10);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray5, 0, (int) (byte) 1);
        java.lang.Byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray27);
        byte[] byteArray31 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray27, (int) '4', 8);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '#');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray8);
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
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Float[] floatArray6 = new java.lang.Float[] { 100.0f, 10.0f, 1.0f, 10.0f, 1.0f, 10.0f };
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6, 100.0f);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray9);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, 1.0, 10.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0, 1.0, 10.0, 1.0, 10.0, 100.0]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        double[] doubleArray0 = null;
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 10, 8, (double) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray15 = new boolean[] { false, true, true, false };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray15, true, 10);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray15, (int) (byte) -1, 1);
        java.lang.Boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray22);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray23, true);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, false);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray23);
        boolean[] booleanArray33 = new boolean[] { false, true, true, false };
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray33, true, 10);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray33, (int) (short) -1, (int) '#');
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray39, false);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray41, false);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray43, false);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray43);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray10, booleanArray43);
        boolean[] booleanArray50 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray10, (int) (short) -1, 5);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[true, true]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, true]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[true, true]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(booleanArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray50), "[false, true, true, false, false]");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        long[] longArray0 = null;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toObject(longArray0);
        org.junit.Assert.assertNull(longArray1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray10, (long) (byte) 1, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        float[] floatArray56 = new float[] { (-1L), (byte) 1 };
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray56, (float) (byte) 10);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.contains(floatArray56, (float) (-1L));
        float[] floatArray62 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray56, (float) 5);
        float[][] floatArray63 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, floatArray62);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) floatArray63);
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
        org.junit.Assert.assertNotNull(floatArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray56), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.contains(charArray19, '4');
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.contains(byteArray0, (byte) 1);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 100);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, 7, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.add(shortArray0, (short) 100);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray3, 1, 1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 0, (int) (byte) 100);
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 0);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray11);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.remove(shortArray11, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[]");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        boolean[] booleanArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray5);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = org.apache.commons.lang3.ArrayUtils.remove(intArray4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0, 100]");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        org.apache.commons.lang3.ArrayUtils.reverse(intArray0);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) '#', (int) (short) 1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, 7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        org.apache.commons.lang3.ArrayUtils.reverse(charArray22);
        java.lang.String str24 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray22);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray26 = org.apache.commons.lang3.ArrayUtils.remove(charArray22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "{}" + "'", str24, "{}");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray4, (int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass11 = booleanArray10.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        java.lang.Integer[] intArray7 = org.apache.commons.lang3.ArrayUtils.toObject(intArray6);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray6, 2, (int) (short) 100);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray10);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = org.apache.commons.lang3.ArrayUtils.remove(intArray12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 0, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 0, 100]");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray6 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 2, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.Class[][] classArray4 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray5 = (java.lang.Class<?>[][]) classArray4;
        wildcardClassArray5[0] = wildcardClassArray2;
        java.lang.Class<?>[][] wildcardClassArray8 = org.apache.commons.lang3.ArrayUtils.toArray(wildcardClassArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap9 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) wildcardClassArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '[Ljava.lang.Class;@1f30a946', has a length less than 2");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray4);
        org.junit.Assert.assertNotNull(wildcardClassArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        long[] longArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String[] strArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.Double[] doubleArray5 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5, 0.0d);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray5);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray0, (java.lang.Object) doubleArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, 0.0d, 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (byte) 10);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, 10.0d);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (byte) 10, (int) '4', (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        java.io.Serializable[] serializableArray5 = org.apache.commons.lang3.ArrayUtils.subarray((java.io.Serializable[]) doubleArray1, (int) '#', 1);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray1, (double) 1L);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(serializableArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray18);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray20, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray22, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, true, false, true]");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        boolean[] booleanArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        boolean[] booleanArray0 = new boolean[] {};
        boolean[] booleanArray1 = new boolean[] {};
        boolean[] booleanArray2 = new boolean[] {};
        boolean[][] booleanArray3 = new boolean[][] { booleanArray0, booleanArray1, booleanArray2 };
        boolean[][] booleanArray4 = org.apache.commons.lang3.ArrayUtils.toArray(booleanArray3);
        java.lang.Object[] objArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[]");
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[[], [], []]");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, 4);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray8);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) -1, (int) (byte) 1);
        java.lang.Character[] charArray17 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray17);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray18);
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 'a');
        char[] charArray22 = null;
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray11, charArray22);
        boolean[] booleanArray29 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.add(booleanArray29, true);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.add(booleanArray29, false);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) charArray11, (java.lang.Object) booleanArray33);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray33, false);
        boolean[] booleanArray42 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.add(booleanArray42, true);
        boolean[] booleanArray45 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray42);
        boolean[] booleanArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray42);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray46, true);
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray33, booleanArray46);
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
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray46), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false, true, true, false, false, false, false, true, true, false]");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.remove(floatArray13, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 2");
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
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 1.0]");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.subarray(charArray0, 10, (int) (byte) 10);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.clone(charArray0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.Integer[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 5);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 3, (int) 'a');
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray5, (int) (byte) 0, 10);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray8, 4);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 4]");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray11, ' ');
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
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4]");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 3");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[-1.0, -1.0, 1.0]");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 100.0d };
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray1);
        boolean boolean3 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray8, (float) (byte) 100, (-1));
        java.lang.Float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray8);
        float[] floatArray15 = new float[] { (-1L), (byte) 1 };
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray15, (float) (byte) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray15);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray15, (int) (byte) 1, 1);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray15);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(floatArray15, (float) 'a');
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(floatArray15, (float) (byte) 10);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray3, (long) (short) 0, (-1));
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.subarray(longArray3, (int) '#', (int) (short) 10);
        long[] longArray13 = org.apache.commons.lang3.ArrayUtils.add(longArray3, (int) (short) 0, (long) 3);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(longArray13, (long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray18 = org.apache.commons.lang3.ArrayUtils.add(longArray13, 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[3, 10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.contains(shortArray4, (short) (byte) -1);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (-1), 0);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray8);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) (byte) 0, 100);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.clone(longArray15);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(longArray16, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray21 = org.apache.commons.lang3.ArrayUtils.add(longArray16, 5, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        byte[] byteArray0 = null;
        java.lang.Byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray0);
        org.junit.Assert.assertNull(booleanArray1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        short[] shortArray0 = null;
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray7);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, 100, 1]");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) '#');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray7);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.clone(intArray7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 35]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 35]");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.add(doubleArray0, (int) (byte) 10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 100);
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (short) 1, 0);
        int[] intArray12 = new int[] { (byte) 10, 1 };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray12, (int) (short) 100, 100);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray12);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray12, (int) 'a');
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = org.apache.commons.lang3.ArrayUtils.remove(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[35, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int[] intArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray0, (int) (byte) 10);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, (int) (byte) 10, 10);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 0, (int) ' ');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) ' ', (java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.Integer[] intArray0 = null;
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, (int) (short) 0);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray24);
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
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray19);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) byteArray19);
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
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        java.lang.Object[] objArray7 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Object[]) charArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(objArray7);
        double[] doubleArray12 = new double[] { (short) 100, 1, (-1.0d) };
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, (double) 0.0f, (int) (short) 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, 0.0d, 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, (double) (byte) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray12, (double) '4', (int) (short) 10);
        double[] doubleArray27 = new double[] { (short) 100, 1, (-1.0d) };
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) 0.0f, (int) (short) 0);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, 0.0d, 10);
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) (byte) 10);
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray12, doubleArray27);
        java.lang.Double[] doubleArray41 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray41);
        double[] doubleArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray41, 0.0d);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray41);
        double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray36, doubleArray45);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray46);
        int int49 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray47, (double) 1.0f);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(objArray7, (java.lang.Object) 1.0f, 7);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[#, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 1.0, -1.0, 100.0, 1.0, -1.0, 10.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        java.lang.Class<?> wildcardClass1 = arrayUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        byte[] byteArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 10, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (int) (short) 100, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray2, (int) (short) 100, 0);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray2, (int) (short) 1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) floatArray9);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray0);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray5 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray3, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int[] intArray6 = new int[] { (short) -1, (byte) 1, (short) 10, 4, 5, (short) 0 };
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 10, 4, 5, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 1, 10, 4, 5, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray1, (byte) -1, 5);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray1, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.add(byteArray1, (int) (short) 1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        long[] longArray6 = new long[] { (byte) 1, 8, ' ', (short) -1, (byte) -1, 2 };
        long[][] longArray7 = new long[][] { longArray6 };
        long[] longArray14 = new long[] { (byte) 1, 8, ' ', (short) -1, (byte) -1, 2 };
        long[][] longArray15 = new long[][] { longArray14 };
        long[] longArray22 = new long[] { (byte) 1, 8, ' ', (short) -1, (byte) -1, 2 };
        long[][] longArray23 = new long[][] { longArray22 };
        long[][][] longArray24 = new long[][][] { longArray7, longArray15, longArray23 };
        long[] longArray26 = new long[] { 1L };
        long[][] longArray27 = new long[][] { longArray26 };
        java.lang.Character[] charArray30 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray30);
        long[][] longArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray27, (java.lang.Object) charArray30);
        long[][] longArray35 = org.apache.commons.lang3.ArrayUtils.subarray(longArray27, 10, (int) ' ');
        long[][][] longArray36 = org.apache.commons.lang3.ArrayUtils.add(longArray24, longArray27);
        // The following exception was thrown during execution in test generation
        try {
            long[][][] longArray38 = org.apache.commons.lang3.ArrayUtils.remove(longArray36, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 8, 32, -1, -1, 2]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[1, 8, 32, -1, -1, 2]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[1, 8, 32, -1, -1, 2]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[1]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertNotNull(longArray36);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray27, (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray60 = org.apache.commons.lang3.ArrayUtils.remove(floatArray35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
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
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = org.apache.commons.lang3.ArrayUtils.remove(charArray5, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 8, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, #]");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10, (short) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) -1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray12);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray6, 0, (int) 'a');
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
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 100, 1]");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        float[] floatArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        java.lang.Character[] charArray12 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray12);
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.toObject(charArray13);
        boolean[] booleanArray19 = new boolean[] { false, true, true, false };
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray19, true, 10);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray19, false);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray19);
        java.lang.Object[] objArray26 = new java.lang.Object[] { charArray14, booleanArray19 };
        double[] doubleArray30 = new double[] { (short) 100, 1, (-1.0d) };
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray30, (double) 0.0f, (int) (short) 0);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray30, 0.0d, 10);
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray30, (double) (byte) 10);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray30, (double) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass42 = doubleArray30.getClass();
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray14, (java.lang.Object) wildcardClass42, 0);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) intArray6, (java.lang.Object[]) charArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap46 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '4', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[4, a,  , a, 4], [false, true, true, false]]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (int) (byte) -1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        char[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray0);
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray0);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray0, 'a');
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray5, '#');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        boolean[] booleanArray55 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray48, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray57 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray55, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(booleanArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray55), "[false, false, true, true, false, true]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray2, (float) (byte) -1, (int) '#');
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray2);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray2, 1, 4);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[1.0]");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.add(booleanArray4, false);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray9);
        boolean[] booleanArray16 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray16, true);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray9, booleanArray18);
        boolean[] booleanArray24 = new boolean[] { false, true, true, false };
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray24, true, 10);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray24, false);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray29);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray29, 1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray18, booleanArray32);
        java.lang.Boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        java.lang.Boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray34);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray34, false);
        boolean[] booleanArray42 = new boolean[] { false, true, true, false };
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray42, true, 10);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.add(booleanArray42, false);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray47);
        boolean[] booleanArray54 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.add(booleanArray54, true);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray47, booleanArray56);
        boolean[] booleanArray62 = new boolean[] { false, true, true, false };
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray62, true, 10);
        boolean[] booleanArray67 = org.apache.commons.lang3.ArrayUtils.add(booleanArray62, false);
        boolean[] booleanArray68 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray67);
        boolean[] booleanArray70 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray67, 1);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray56, booleanArray70);
        boolean[] booleanArray72 = null;
        boolean boolean73 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray56, booleanArray72);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray37, booleanArray56);
        boolean[] booleanArray76 = org.apache.commons.lang3.ArrayUtils.add(booleanArray56, false);
        boolean boolean77 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray32, booleanArray56);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray62), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(booleanArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray67), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray68), "[false, true, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray70), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(booleanArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray76), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray8, (short) (byte) -1, (int) '#');
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray0, shortArray8);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray8, (short) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        short[] shortArray0 = null;
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray5, (short) 0);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray0, shortArray7);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(shortArray9, (short) 10);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.clone(shortArray12);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.add(shortArray12, (short) 100);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray12, (short) 10);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.add(shortArray12, (short) (byte) -1);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (short) (byte) -1);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.clone(shortArray19);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray9, shortArray22);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray22, (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 100);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 1, 0);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(byteArray0, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray14 = new boolean[] { true, false, true, true, true, false };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[]");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray2 = org.apache.commons.lang3.ArrayUtils.remove(floatArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        long[] longArray2 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toObject(longArray2);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, 10L);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(longArray5, (long) 10);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray5, 0L);
        long[] longArray12 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray13 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray12, 10L);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(longArray15, (long) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray5, longArray15);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray20 = org.apache.commons.lang3.ArrayUtils.remove(longArray15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray2, (int) (short) 100, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray2, (int) 'a');
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, (int) ' ', (int) '#');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray4);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray4);
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
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        float[] floatArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) (byte) 100, (double) (byte) 1);
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray9 = new java.lang.Double[] { 10.0d, (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray9);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, 0.0d);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 10.0f, 10.0d);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray13);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray13, (double) 1.0f);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, 0.0d);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.add(doubleArray13, (int) '4', (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        double[] doubleArray3 = new double[] { (short) 100, 1, (-1.0d) };
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) 0.0f, (int) (short) 0);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) (byte) 10);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray3, (double) (-1), (int) (short) 100);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (-1.0d), (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        boolean[] booleanArray4 = new boolean[] { false, true, true, false };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray4, true, 10);
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray4, (int) (byte) -1, 1);
        java.lang.String str12 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) (byte) -1, "{1,-1,-1,1,1,-1,-1,1}");
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        double[] doubleArray3 = new double[] { 10.0f, (short) 10, 'a' };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.add(doubleArray3, (double) 100L);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray9, (double) (byte) 1, (double) 3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        char[] charArray0 = null;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray0, 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        int[] intArray97 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray89);
        int[] intArray99 = org.apache.commons.lang3.ArrayUtils.add(intArray97, (int) ' ');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray97), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray99), "[35, 0, 32]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.add(byteArray23, (int) ' ', (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(charArray8, '4');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray0);
        java.lang.Short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 0);
        java.lang.Short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
        org.junit.Assert.assertNotNull(shortArray5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) -1 };
        java.lang.Short[] shortArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray2);
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3, (short) 1);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.add(shortArray7, (short) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, -1, 0]");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray5, (byte) 0);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray5);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray8);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray9, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.remove(byteArray9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.Byte[] byteArray4 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray4, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray4);
        java.lang.Character[] charArray13 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13);
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray14);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) byteArray7, (java.lang.Object) charArray14);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray14);
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
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        java.lang.Short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray7);
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray8);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 100, 1]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, 100, 1]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        long[] longArray2 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toObject(longArray2);
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray2, 10L);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(longArray5, (long) 10);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray5, 0L);
        long[] longArray12 = new long[] { (byte) 10, (byte) 100 };
        java.lang.Long[] longArray13 = org.apache.commons.lang3.ArrayUtils.toObject(longArray12);
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray12, 10L);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(longArray15, (long) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray5, longArray15);
        java.lang.Long[] longArray19 = org.apache.commons.lang3.ArrayUtils.toObject(longArray5);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[10, 100]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(longArray19);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray20, (long) (-1));
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
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[10, 100, 35]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        float[] floatArray6 = new float[] { 4, 0L, 4, 1, 8, 'a' };
        float[] floatArray9 = new float[] { (-1L), (byte) 1 };
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray9, (float) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.clone(floatArray14);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) '#', (int) 'a');
        float[] floatArray20 = org.apache.commons.lang3.ArrayUtils.remove(floatArray14, (int) (byte) 0);
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) (short) 0, (int) (byte) 0);
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray23, (int) (byte) 1, 5);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.clone(floatArray26);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray6, floatArray26);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[4.0, 0.0, 4.0, 1.0, 8.0, 97.0]");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        long[] longArray0 = null;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, (int) '#', 0);
        org.junit.Assert.assertNull(longArray3);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray6, ' ');
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  , a, 4]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        long[] longArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray17, (long) 8);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray23 = org.apache.commons.lang3.ArrayUtils.remove(longArray17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[32, 1]");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray25);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        short[] shortArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.clone(shortArray0);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.remove(shortArray0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[]");
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[]");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        double[] doubleArray0 = null;
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
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray19, (int) (byte) 1, (int) 'a');
        double[] doubleArray32 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray31);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray31);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        char[][] charArray0 = new char[][] {};
        char[][] charArray1 = new char[][] {};
        char[][] charArray2 = new char[][] {};
        char[][] charArray3 = new char[][] {};
        char[][][] charArray4 = new char[][][] { charArray0, charArray1, charArray2, charArray3 };
        char[][] charArray5 = new char[][] {};
        char[][] charArray6 = new char[][] {};
        char[][] charArray7 = new char[][] {};
        char[][] charArray8 = new char[][] {};
        char[][][] charArray9 = new char[][][] { charArray5, charArray6, charArray7, charArray8 };
        char[][] charArray10 = new char[][] {};
        char[][] charArray11 = new char[][] {};
        char[][] charArray12 = new char[][] {};
        char[][] charArray13 = new char[][] {};
        char[][][] charArray14 = new char[][][] { charArray10, charArray11, charArray12, charArray13 };
        char[][] charArray15 = new char[][] {};
        char[][] charArray16 = new char[][] {};
        char[][] charArray17 = new char[][] {};
        char[][] charArray18 = new char[][] {};
        char[][][] charArray19 = new char[][][] { charArray15, charArray16, charArray17, charArray18 };
        char[][] charArray20 = new char[][] {};
        char[][] charArray21 = new char[][] {};
        char[][] charArray22 = new char[][] {};
        char[][] charArray23 = new char[][] {};
        char[][][] charArray24 = new char[][][] { charArray20, charArray21, charArray22, charArray23 };
        char[][] charArray25 = new char[][] {};
        char[][] charArray26 = new char[][] {};
        char[][] charArray27 = new char[][] {};
        char[][] charArray28 = new char[][] {};
        char[][][] charArray29 = new char[][][] { charArray25, charArray26, charArray27, charArray28 };
        char[][][][] charArray30 = new char[][][][] { charArray4, charArray9, charArray14, charArray19, charArray24, charArray29 };
        char[] charArray33 = new char[] { '4' };
        char[] charArray35 = new char[] { '4' };
        char[] charArray37 = new char[] { '4' };
        char[] charArray39 = new char[] { '4' };
        char[] charArray41 = new char[] { '4' };
        char[][] charArray42 = new char[][] { charArray33, charArray35, charArray37, charArray39, charArray41 };
        char[] charArray44 = new char[] { '4' };
        char[] charArray46 = new char[] { '4' };
        char[] charArray48 = new char[] { '4' };
        char[] charArray50 = new char[] { '4' };
        char[] charArray52 = new char[] { '4' };
        char[][] charArray53 = new char[][] { charArray44, charArray46, charArray48, charArray50, charArray52 };
        char[] charArray55 = new char[] { '4' };
        char[] charArray57 = new char[] { '4' };
        char[] charArray59 = new char[] { '4' };
        char[] charArray61 = new char[] { '4' };
        char[] charArray63 = new char[] { '4' };
        char[][] charArray64 = new char[][] { charArray55, charArray57, charArray59, charArray61, charArray63 };
        char[][][] charArray65 = new char[][][] { charArray42, charArray53, charArray64 };
        char[][][] charArray66 = org.apache.commons.lang3.ArrayUtils.toArray(charArray65);
        // The following exception was thrown during execution in test generation
        try {
            char[][][][] charArray67 = org.apache.commons.lang3.ArrayUtils.add(charArray30, (int) 'a', charArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[4]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[4]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[4]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[4]");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[4]");
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[4]");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[4]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4]");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[4]");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertNotNull(charArray66);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '4', 'a', ' ', 'a', '4' };
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        java.lang.Character[] charArray7 = org.apache.commons.lang3.ArrayUtils.toObject(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.subarray(charArray6, (int) (byte) -1, (int) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = org.apache.commons.lang3.ArrayUtils.remove(charArray11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Length: 1");
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
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.clone(shortArray19);
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
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 100, 1, -1, 100, 1]");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        long[] longArray3 = new long[] { 10L, 100L, '#' };
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray3);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray3, (long) 8);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray3, (long) '#', (int) ' ');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 100, 35]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        short[] shortArray0 = null;
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray7, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        double[] doubleArray44 = new double[] { (short) 100, 1, (-1.0d) };
        int int47 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray44, (double) 0.0f, (int) (short) 0);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray44, 0.0d, 10);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray44, (double) (byte) 10);
        int int55 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray44, (double) '4', (int) (short) 10);
        double[] doubleArray59 = new double[] { 10.0f, (short) 10, 'a' };
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray59, (-1.0d), (int) (byte) -1, (double) (-1.0f));
        double[] doubleArray65 = org.apache.commons.lang3.ArrayUtils.add(doubleArray59, (double) 100L);
        double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray44, doubleArray65);
        boolean boolean67 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray38, doubleArray44);
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray44, 1.0d, 0);
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
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 10.0, 97.0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 1.0, -1.0, 10.0, 10.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 10, (short) -1, (short) -1, (short) 1 };
        short[] shortArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, 1]");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.Long[] longArray0 = new java.lang.Long[] {};
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0, (long) (-1));
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.add(longArray2, 1L);
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray2, 0, (long) (short) 0);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        java.lang.Character[] charArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray1);
        char[] charArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1, ' ');
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray1);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(charArray5, '4');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int[] intArray2 = new int[] { '#', (short) 0 };
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.toObject(intArray2);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray3, (int) 'a');
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray3);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = org.apache.commons.lang3.ArrayUtils.add(intArray8, 7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 7, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[35, 0]");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        byte[] byteArray2 = org.apache.commons.lang3.ArrayUtils.clone(byteArray1);
        byte[] byteArray5 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray1, (int) ' ', (int) (short) -1);
        java.lang.Byte[] byteArray10 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray10, (byte) -1);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray12);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.add(byteArray12, (byte) 100);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray5, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.remove(byteArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, -1, -1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.subarray(longArray8, (int) (short) 10, 4);
        long[] longArray15 = new long[] { 100L, 'a' };
        long[] longArray18 = org.apache.commons.lang3.ArrayUtils.subarray(longArray15, (int) (short) 10, 100);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray18, (long) ' ');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray8, longArray18);
        java.lang.String str22 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) longArray8);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[100, 97]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{}" + "'", str22, "{}");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.Short[] shortArray3 = new java.lang.Short[] { (short) -1, (short) 100, (short) 1 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray3);
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) 0);
        java.lang.Short[] shortArray10 = new java.lang.Short[] { (short) 10, (short) 10, (short) 0 };
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray10, (short) 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) -1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray12);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY;
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray16);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray16);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) (byte) 10, (int) ' ');
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray15, shortArray16);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray16);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray16, (short) -1, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY;
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.subarray(longArray0, 100, (int) (byte) 1);
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 3, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 3, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.clone(byteArray27);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray51, (byte) 100, 0);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '#', '#' };
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, 'a');
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '#');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '#', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        short[] shortArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray13);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        byte[] byteArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray0);
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 100);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 1, 0);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 100);
        byte[] byteArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        float[] floatArray2 = new float[] { (-1L), (byte) 1 };
        int int4 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray2, (float) (byte) 10);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray2, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.clone(floatArray7);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray7, (int) '#', (int) 'a');
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.remove(floatArray7, (int) (byte) 0);
        float[] floatArray16 = new float[] { (-1L), (byte) 1 };
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray16, (float) (byte) 10);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray16, (int) (byte) 1, (float) (byte) -1);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.clone(floatArray21);
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray21, (int) '#', (int) 'a');
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.remove(floatArray21, 0);
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray13, floatArray21);
        java.lang.Float[] floatArray30 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray21);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray21);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[-1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[-1.0, 1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray29, (byte) 0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.contains(byteArray29, (byte) 100);
        byte[] byteArray36 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray29, 100, 0);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.contains(byteArray36, (byte) 0);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray23, byteArray36);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray36, (byte) 0);
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
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 1, 100, 100, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        double[] doubleArray0 = null;
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, (-1), 100);
        org.junit.Assert.assertNull(doubleArray3);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        long[] longArray2 = new long[] { 100L, 'a' };
        long[] longArray5 = org.apache.commons.lang3.ArrayUtils.subarray(longArray2, (int) (short) 10, 100);
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray5);
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray5, (long) 0);
        java.lang.Long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toObject(longArray8);
        long[] longArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9, 0L);
        long[] longArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9);
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray9, (long) (byte) 10);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) (-1), 5);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray0, (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        char[][][] charArray0 = new char[][][] {};
        char[][][] charArray1 = new char[][][] {};
        char[][][][] charArray2 = new char[][][][] { charArray0, charArray1 };
        char[][][] charArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            char[][][][] charArray5 = org.apache.commons.lang3.ArrayUtils.add(charArray2, 5, charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
    }
}

