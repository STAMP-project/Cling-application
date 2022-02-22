import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest55 {

    public static boolean debug = false;

    @Test
    public void test27501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27501");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) '#', 19, (double) 'a');
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) 100, (double) 3);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, -1.0, 10.0, 35.0]");
    }

    @Test
    public void test27502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27502");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, 100);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, (int) '#', 0);
        int[] intArray20 = new int[] { (-1), '4', (byte) 10, 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, (int) (short) 100, 100);
        int[] intArray24 = new int[] {};
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, (int) (short) 1);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.subarray(intArray24, (int) (short) 0, (int) (short) -1);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray20, intArray24);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.add(intArray20, 0);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, (int) 'a', 0);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.addAll(intArray8, intArray20);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.addAll(intArray7, intArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray7);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.subarray(intArray7, 14, (int) (byte) 1);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.subarray(intArray7, (int) (short) 0, 12);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray44);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray44);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test27503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27503");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1aaaaaaA11", "aa####10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27504");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray23 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, (-1));
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray23);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(shortArray23, (short) (byte) 1);
        java.lang.String str30 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) shortArray23);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{0,0,10,1,10,0}" + "'", str30, "{0,0,10,1,10,0}");
    }

    @Test
    public void test27505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27505");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("a#a444    ...", "{0,0,10,1,10,0,1}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hihih", "4!iha!iha!ih!ih4!ih4444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihih" + "'", str2, "hihih");
    }

    @Test
    public void test27507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27507");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        java.lang.Short[] shortArray14 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        java.lang.Short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray14);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertNotNull(shortArray15);
    }

    @Test
    public void test27508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "74");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("1000", 142);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1000" + "'", str2, "1000");
    }

    @Test
    public void test27510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27510");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray5, (double) 10L);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray5);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) (short) -1, (int) (byte) 0, (double) (short) 10);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (byte) 0);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 223, (double) 168);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test27511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27511");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, 2, (short) (byte) 0);
        short[] shortArray20 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) (byte) 0, (-1));
        short[] shortArray25 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) -1);
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.add(shortArray20, (short) (byte) 1);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray27, (short) (byte) 1, (int) ' ');
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.add(shortArray27, (short) 0);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray32);
        java.lang.Short[] shortArray36 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray38 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray36, (short) 1);
        short[] shortArray45 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray45, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray45);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray38, shortArray45);
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray38, (short) 10);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray13, shortArray38);
        java.lang.Short[] shortArray57 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray57, (short) (byte) 100);
        java.lang.Short[] shortArray62 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray62, (short) 1);
        short[] shortArray71 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int74 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray71, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray71);
        short[] shortArray76 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray64, shortArray71);
        java.lang.Short[] shortArray77 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray76);
        short[] shortArray79 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray77, (short) (byte) 0);
        short[] shortArray81 = org.apache.commons.lang3.ArrayUtils.add(shortArray79, (short) 0);
        short[] shortArray82 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray59, shortArray79);
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.contains(shortArray79, (short) -1);
        short[] shortArray85 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray38, shortArray79);
        short[] shortArray86 = org.apache.commons.lang3.ArrayUtils.clone(shortArray79);
        boolean boolean87 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray79);
        java.lang.Short[] shortArray88 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray79);
        short[] shortArray91 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray79, 67, 445);
        int int94 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray79, (short) -1, 61);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray76), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray81), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray82), "[1, 1, 10, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray85), "[-1, 10, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray86), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertNotNull(shortArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray91), "[]");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test27512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("101", "-1-110010110000-110010110001-11001011000100-110010110001");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27513");
        long[][] longArray0 = new long[][] {};
        long[] longArray3 = new long[] { 'a', (byte) 100 };
        long[] longArray6 = new long[] { 'a', (byte) 100 };
        long[] longArray9 = new long[] { 'a', (byte) 100 };
        long[] longArray12 = new long[] { 'a', (byte) 100 };
        long[] longArray15 = new long[] { 'a', (byte) 100 };
        long[] longArray18 = new long[] { 'a', (byte) 100 };
        long[][] longArray19 = new long[][] { longArray3, longArray6, longArray9, longArray12, longArray15, longArray18 };
        long[][] longArray20 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray19);
        float[] floatArray22 = new float[] { (byte) 10 };
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) (-1));
        float[] floatArray26 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) '4');
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray24);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.contains(floatArray24, (float) 99);
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) 516);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) longArray20, (java.lang.Object) floatArray31);
        // The following exception was thrown during execution in test generation
        try {
            long[][] longArray34 = org.apache.commons.lang3.ArrayUtils.remove(longArray20, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 38, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 100]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[10.0, -1.0, 516.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test27514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27514");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray3, (double) 0L);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, 100.0d);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) 100L);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10, 0.0d);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray10);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (double) 445);
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 244, 87);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test27515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("10.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA52.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA-1.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA100.044444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA1.0", "{27.0}", 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.0444444444444444444{27.0}AAAAAAAAAAAAAAAAAAA1.0" + "'", str3, "10.0444444444444444444{27.0}AAAAAAAAAAAAAAAAAAA1.0");
    }

    @Test
    public void test27516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("eslafeurteurteurteslafeslafeurteslafeslaf", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          0-11 AAAHIHI...                                                   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0HIHIH0H0aaa       10HIHIH0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27518");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa", (java.lang.CharSequence) "HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI-1a10a0a10a1a10a0a0HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                falsefalsetruetruefalsetrue44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27520");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, 26);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = org.apache.commons.lang3.ArrayUtils.remove(intArray5, 142);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 142, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test27521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27521");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        java.lang.Integer[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4, (int) (byte) 1);
        java.lang.Integer[] intArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9, 99);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = org.apache.commons.lang3.ArrayUtils.add(intArray11, 457, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 457, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
    }

    @Test
    public void test27522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27522");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("false      ", 136, "true44444444444444444444444444444 AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444 AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444 AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true44444444444444444444444444444 AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaafalse      " + "'", str3, "true44444444444444444444444444444 AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaafalse      ");
    }

    @Test
    public void test27523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27523");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray15, true);
        boolean[] booleanArray18 = null;
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray15, booleanArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray15, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test27524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27524");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        long[] longArray21 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.add(longArray21, (long) (short) 1);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray35 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.contains(longArray35, (long) ' ');
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.addAll(longArray31, longArray35);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.addAll(longArray21, longArray35);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray35);
        java.lang.Long[] longArray41 = org.apache.commons.lang3.ArrayUtils.toObject(longArray35);
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray41);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray42);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.clone(longArray42);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray44);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.subarray(longArray44, 39, 347);
        long[] longArray49 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray48);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[0, -1, -1, 1, 0, 100, 1, 0, 97, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[0, -1, -1]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[]");
    }

    @Test
    public void test27525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27525");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("-lsetruetruef-lsetrue44444444444444444444444444444444444444", "{true,true,true,f lse}  ", 91);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("{1.0}", 129, 226);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27527");
        char[] charArray5 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray6 = org.apache.commons.lang3.ArrayUtils.toObject(charArray5);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray5, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray5);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               HIHIH               ", charArray10);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray12, '#');
        java.lang.Character[] charArray15 = org.apache.commons.lang3.ArrayUtils.toObject(charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                 ", charArray12);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test27528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27528");
        java.lang.Long[][][][] longArray0 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray1 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray2 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray3 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray4 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray5 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][][] longArray6 = new java.lang.Long[][][][][] { longArray0, longArray1, longArray2, longArray3, longArray4, longArray5 };
        java.lang.Long[][][][] longArray7 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray8 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray9 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray10 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray11 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray12 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][][] longArray13 = new java.lang.Long[][][][][] { longArray7, longArray8, longArray9, longArray10, longArray11, longArray12 };
        java.lang.Long[][][][] longArray14 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray15 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray16 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray17 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray18 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray19 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][][] longArray20 = new java.lang.Long[][][][][] { longArray14, longArray15, longArray16, longArray17, longArray18, longArray19 };
        java.lang.Long[][][][] longArray21 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray22 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray23 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray24 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray25 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray26 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][][] longArray27 = new java.lang.Long[][][][][] { longArray21, longArray22, longArray23, longArray24, longArray25, longArray26 };
        java.lang.Long[][][][] longArray28 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray29 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray30 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray31 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray32 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray33 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][][] longArray34 = new java.lang.Long[][][][][] { longArray28, longArray29, longArray30, longArray31, longArray32, longArray33 };
        java.lang.Long[][][][] longArray35 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray36 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray37 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray38 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray39 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][] longArray40 = new java.lang.Long[][][][] {};
        java.lang.Long[][][][][] longArray41 = new java.lang.Long[][][][][] { longArray35, longArray36, longArray37, longArray38, longArray39, longArray40 };
        java.lang.Long[][][][][][] longArray42 = new java.lang.Long[][][][][][] { longArray6, longArray13, longArray20, longArray27, longArray34, longArray41 };
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray42);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test27529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27529");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 94);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray21);
        int[] intArray23 = new int[] {};
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray23, (int) (short) 1);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray23, 100);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray23, (int) '#', 0);
        int[] intArray35 = new int[] { (-1), '4', (byte) 10, 1 };
        int int38 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray35, (int) (short) 100, 100);
        int[] intArray39 = new int[] {};
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray39, (int) (short) 1);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.subarray(intArray39, (int) (short) 0, (int) (short) -1);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray35, intArray39);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.add(intArray35, 0);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray35, (int) 'a', 0);
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.addAll(intArray23, intArray35);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) strArray21, (java.lang.Object) intArray51);
        int int55 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray51, (int) ' ', (int) 'a');
        int[] intArray58 = org.apache.commons.lang3.ArrayUtils.add(intArray51, (int) (byte) 0, (int) (byte) -1);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray51);
        java.lang.Integer[] intArray60 = org.apache.commons.lang3.ArrayUtils.toObject(intArray51);
        java.lang.Integer[] intArray61 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray60);
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) intArray60, "a1A10A0A0");
        int[] intArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray60);
        int[] intArray66 = org.apache.commons.lang3.ArrayUtils.add(intArray64, 208);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 52, 10, 1, 94]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-1, -1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "-1a1A10A0A052a1A10A0A010a1A10A0A01" + "'", str63, "-1a1A10A0A052a1A10A0A010a1A10A0A01");
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[-1, 52, 10, 1, 208]");
    }

    @Test
    public void test27530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27530");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hihih", 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27531");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 3, (double) 1L);
        double[] doubleArray4 = new double[] {};
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) '4', (double) (byte) -1);
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray12);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 7);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (-1.0f));
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 36, (int) (short) 0);
        java.lang.Double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test27532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27532");
        java.lang.CharSequence charSequence0 = null;
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray12);
        char[] charArray20 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.add(charArray20, 'a');
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray20, ' ');
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(charArray20, 'a');
        char[] charArray28 = org.apache.commons.lang3.ArrayUtils.addAll(charArray12, charArray20);
        char[] charArray33 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray34 = org.apache.commons.lang3.ArrayUtils.toObject(charArray33);
        char[] charArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray33, '4');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.clone(charArray33);
        char[] charArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray37);
        int int39 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               HIHIH               ", charArray38);
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray38);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray40);
        char[] charArray42 = org.apache.commons.lang3.ArrayUtils.addAll(charArray28, charArray40);
        char[] charArray43 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray28);
        char[] charArray45 = org.apache.commons.lang3.ArrayUtils.remove(charArray28, 11);
        java.lang.String[] strArray49 = new java.lang.String[] { "              1110               ", "100", "                              HIHIH" };
        java.lang.String[][] strArray50 = new java.lang.String[][] { strArray49 };
        java.lang.String[] strArray54 = new java.lang.String[] { "              1110               ", "100", "                              HIHIH" };
        java.lang.String[][] strArray55 = new java.lang.String[][] { strArray54 };
        java.lang.String[][][] strArray56 = new java.lang.String[][][] { strArray50, strArray55 };
        java.lang.String[][][] strArray57 = org.apache.commons.lang3.ArrayUtils.clone(strArray56);
        java.lang.String[][][] strArray60 = org.apache.commons.lang3.ArrayUtils.subarray(strArray57, 27, (int) ' ');
        java.lang.String[][][] strArray61 = org.apache.commons.lang3.ArrayUtils.clone(strArray57);
        java.lang.String str65 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray61, "10               HIHIH               1", 7, 7);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) charArray45, (java.lang.Object) str65);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray45, '#');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "a#a444 4 aa44# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "a#a444 4 aa44# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4, 4, #,  ]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "a#a444 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a, #, a, 4, 4, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "a#a444 4 aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "a#a444 4 aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[a, #, a, 4, 4, 4,  , 4,  , a, a]");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test27533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27533");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Aaa444444444444444444444444444...", "aaaaaaaaaaaaaaaAaaaaaaaaa", 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27534");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("eslfiheurtiheurtiheurt", 165, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################eslfiheurtiheurtiheurt########################################################################" + "'", str3, "#######################################################################eslfiheurtiheurtiheurt########################################################################");
    }

    @Test
    public void test27535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27535");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1TRUE   HI", 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27536");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray15 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.clone(charArray15);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray17, '4');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray6, charArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray17);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray17);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray22);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , #, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , #, 4]");
    }

    @Test
    public void test27537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27537");
        char[] charArray2 = null;
        char[] charArray9 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 'a');
        java.lang.Character[] charArray18 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18, '4');
        java.lang.Character[] charArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray18);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray22);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray22);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.clone(charArray24);
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.addAll(charArray2, charArray25);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "trueaaahitrueaaahitrueaaahifalse", charArray26);
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.add(charArray26, ' ');
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.subarray(charArray26, 19, 8);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1     HIHIH", charArray26);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 aa4a444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 aa4a444a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 aa4a444a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, a, 4, a, 4, 4, 4, a, #, a,  ]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test27538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaa0.140.01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27539");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 28, (-1));
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 94, (int) (short) 1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = org.apache.commons.lang3.ArrayUtils.add(intArray5, (int) '#', 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test27540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27540");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 1, false);
        float[] floatArray21 = new float[] { (byte) 10 };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, (float) (-1));
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) '4');
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) booleanArray19, (java.lang.Object) '4');
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray19, false);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray19);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, false, false, false]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test27541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH" + "'", str2, "HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH");
    }

    @Test
    public void test27542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                       AAa                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "#####################AAa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                       AAa                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "                                                       AAa                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test27543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27543");
        boolean[] booleanArray6 = new boolean[] { false, false, false, false, true, true };
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray6, false);
        boolean[] booleanArray9 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray9, true, 111);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[false, false, false, true, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test27544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27544");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray16, (byte) 100, 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray16);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray16, (int) (short) 10, (int) (byte) 100);
        java.lang.Byte[] byteArray24 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray16);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray16, (byte) 100, 38);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test27545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27545");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray16);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray16);
        java.lang.Boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str17, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
    }

    @Test
    public void test27546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27546");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray9);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray12, 'a');
        java.lang.Character[] charArray15 = new java.lang.Character[] {};
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray15);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray15);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray17, '4');
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray12, charArray19);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray12, ' ');
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          ", charArray12);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, 4, a]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4, a]");
    }

    @Test
    public void test27547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27547");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27548");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17, (short) (byte) -1);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test27549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                 {0,10,1,1,0}                                                                 ", 133);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                        {0,10,1,1,0}                                                                 " + "'", str2, "                                                        {0,10,1,1,0}                                                                 ");
    }

    @Test
    public void test27550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27550");
        java.lang.Integer[][][][][][][][][] intArray0 = new java.lang.Integer[][][][][][][][][] {};
        java.lang.Integer[][][][][][][][][] intArray1 = new java.lang.Integer[][][][][][][][][] {};
        java.lang.Integer[][][][][][][][][][] intArray2 = new java.lang.Integer[][][][][][][][][][] { intArray0, intArray1 };
        java.lang.Integer[][][][][][][][][][] intArray3 = org.apache.commons.lang3.ArrayUtils.clone(intArray2);
        char[] charArray12 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray12, 'a');
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.add(charArray12, ' ');
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!HI", charArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray12, ' ');
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.subarray(charArray12, 94, 0);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                         0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", charArray12);
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) intArray3, (java.lang.Object) charArray12, 69);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test27551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27551");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray5, false);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray17);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray17, 0, 10);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray21);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray22, false);
        boolean[] booleanArray30 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray35 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray35, false);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray37);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray37);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray30, booleanArray37);
        java.lang.Boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray40);
        java.lang.String str42 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray41);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray41);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray43);
        boolean[] booleanArray47 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray43, 1, 28);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray43);
        boolean[] booleanArray49 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray22, booleanArray43);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, true, false, false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str42, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, true, true, true, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, true, true, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, true, true, true, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, true, false, false, false, true, true, true, false, false, true, false, false]");
    }

    @Test
    public void test27552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27552");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A                                                                AAA                                 0.0A", "aaahihi#..                                                                     4444444444444444444444444...   ", 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test27553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27553");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAAAAAAAA0.140.01AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", "4444444444444444444444444444444444                                 aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27554");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray0, 100);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(intArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, 4, 4);
        int[] intArray11 = new int[] {};
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray11, (int) (short) 1);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray11, 100);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray11, (int) '#', 0);
        int[] intArray23 = new int[] { (-1), '4', (byte) 10, 1 };
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray23, (int) (short) 100, 100);
        int[] intArray27 = new int[] {};
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray27, (int) (short) 1);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.subarray(intArray27, (int) (short) 0, (int) (short) -1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray23, intArray27);
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.add(intArray23, 0);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray23, (int) 'a', 0);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray23, (int) (byte) 0, 2);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.addAll(intArray11, intArray23);
        int[] intArray43 = org.apache.commons.lang3.ArrayUtils.clone(intArray42);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray43);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.add(intArray6, (int) (byte) 10);
        java.lang.Integer[] intArray47 = org.apache.commons.lang3.ArrayUtils.toObject(intArray46);
        java.lang.Integer[] intArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[52, 10]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNotNull(intArray48);
    }

    @Test
    public void test27555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi! hi!ahi!ahi!4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27556");
        char[] charArray3 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray3, '4');
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#,  ]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test27557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27557");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) -1);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.subarray(longArray5, 3, (-1));
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toObject(longArray29);
        java.lang.Long[] longArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray30);
        java.lang.Long[] longArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray31);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray31, (long) 'a');
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0, -1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[]");
    }

    @Test
    public void test27558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("{true,false,true,true,false,false}", "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27559");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray13);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray13);
        boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray13);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, true, true, false, true]");
    }

    @Test
    public void test27560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAtruetruetruet", "{100H1H-1H0H1H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAtruetruetruet" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAtruetruetruet");
    }

    @Test
    public void test27561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI" + "'", str2, "HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI-11001011000HI");
    }

    @Test
    public void test27562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27562");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 28);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.add(doubleArray7, 2, (double) 10.0f);
        double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (double) 106);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray12, (double) (short) 1, (double) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray12, (double) 69);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test27563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27563");
        double[][][] doubleArray0 = new double[][][] {};
        double[][][] doubleArray1 = new double[][][] {};
        double[][][] doubleArray2 = new double[][][] {};
        double[][][] doubleArray3 = new double[][][] {};
        double[][][] doubleArray4 = new double[][][] {};
        double[][][][] doubleArray5 = new double[][][][] { doubleArray0, doubleArray1, doubleArray2, doubleArray3, doubleArray4 };
        double[][][][] doubleArray8 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray5, 24, 14);
        double[] doubleArray13 = new double[] { 28, 0.0f, 1, 6 };
        double[] doubleArray18 = new double[] { 28, 0.0f, 1, 6 };
        double[] doubleArray23 = new double[] { 28, 0.0f, 1, 6 };
        double[][] doubleArray24 = new double[][] { doubleArray13, doubleArray18, doubleArray23 };
        double[] doubleArray29 = new double[] { 28, 0.0f, 1, 6 };
        double[] doubleArray34 = new double[] { 28, 0.0f, 1, 6 };
        double[] doubleArray39 = new double[] { 28, 0.0f, 1, 6 };
        double[][] doubleArray40 = new double[][] { doubleArray29, doubleArray34, doubleArray39 };
        double[] doubleArray45 = new double[] { 28, 0.0f, 1, 6 };
        double[] doubleArray50 = new double[] { 28, 0.0f, 1, 6 };
        double[] doubleArray55 = new double[] { 28, 0.0f, 1, 6 };
        double[][] doubleArray56 = new double[][] { doubleArray45, doubleArray50, doubleArray55 };
        double[] doubleArray61 = new double[] { 28, 0.0f, 1, 6 };
        double[] doubleArray66 = new double[] { 28, 0.0f, 1, 6 };
        double[] doubleArray71 = new double[] { 28, 0.0f, 1, 6 };
        double[][] doubleArray72 = new double[][] { doubleArray61, doubleArray66, doubleArray71 };
        double[][][] doubleArray73 = new double[][][] { doubleArray24, doubleArray40, doubleArray56, doubleArray72 };
        double[][][] doubleArray74 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray73);
        double[][][][] doubleArray75 = org.apache.commons.lang3.ArrayUtils.add(doubleArray8, doubleArray74);
        // The following exception was thrown during execution in test generation
        try {
            double[][][] doubleArray77 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray74, 798);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 798, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[28.0, 0.0, 1.0, 6.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertNotNull(doubleArray75);
    }

    @Test
    public void test27564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27564");
        java.lang.CharSequence charSequence0 = null;
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray12, '4');
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray12);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test27565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27565");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray16, (byte) 100, 0);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray16);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray7);
        byte[] byteArray23 = org.apache.commons.lang3.ArrayUtils.add(byteArray7, (byte) -1);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray7, (byte) 10, (int) 'a');
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray7, 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.add(byteArray29, 223, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 223, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1, -1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
    }

    @Test
    public void test27566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27566");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray5, 28);
        java.lang.Integer[] intArray9 = new java.lang.Integer[] {};
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray9, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray11);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.subarray(intArray11, 28, (int) ' ');
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.subarray(intArray11, (int) (byte) 10, (int) '#');
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray11);
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray11);
        int[] intArray23 = org.apache.commons.lang3.ArrayUtils.subarray(intArray5, 27, 139);
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.subarray(intArray5, (int) (byte) -1, 7);
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.subarray(intArray5, 43, 16);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray5);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.clone(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 10, 1, 1, 0]");
    }

    @Test
    public void test27567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27567");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        java.lang.Long[] longArray25 = org.apache.commons.lang3.ArrayUtils.toObject(longArray19);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.clone(longArray26);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray27, 0L);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (-1L));
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray31, (long) 21);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[-1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test27568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "AA                                ", (java.lang.CharSequence) "                      4!iha!iha!ih !ih4!ih                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27569");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) (byte) -1);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test27570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27570");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        java.lang.Double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray0);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray4);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 9);
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray4, (double) 1);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray10, (double) 28, 0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(objMap5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test27571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27571");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI..");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 969 + "'", int1 == 969);
    }

    @Test
    public void test27572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27572");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hihi...                 ", ". trueaaa       aAA       aAA       a...", 56, 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hihi. trueaaa       aAA       aAA       a..." + "'", str4, "hihi. trueaaa       aAA       aAA       a...");
    }

    @Test
    public void test27573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27573");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444                                                                AAA                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 466);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test27575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27575");
        java.util.Map[][] mapArray1 = new java.util.Map[0][];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray2 = (java.util.Map<java.lang.Object, java.lang.Object>[][]) mapArray1;
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray3 = null;
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray4);
        java.util.Map<java.lang.Object, java.lang.Object> objMap6 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray4);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray7);
        java.util.Map<java.lang.Object, java.lang.Object> objMap9 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray7);
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray10);
        java.util.Map<java.lang.Object, java.lang.Object> objMap12 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray10);
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray13);
        java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray13);
        java.util.Map[] mapArray17 = new java.util.Map[4];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray18 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray17;
        objMapArray18[0] = objMap6;
        objMapArray18[1] = objMap9;
        objMapArray18[2] = objMap12;
        objMapArray18[3] = objMap15;
        java.lang.Object obj27 = null;
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(objMapArray18, obj27);
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray29 = org.apache.commons.lang3.ArrayUtils.add(objMapArray3, objMapArray18);
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray30 = org.apache.commons.lang3.ArrayUtils.addAll(objMapArray2, objMapArray29);
        java.util.Map<java.lang.Object, java.lang.Object>[][] objMapArray31 = org.apache.commons.lang3.ArrayUtils.toArray(objMapArray29);
        java.lang.Object[][] objArray34 = org.apache.commons.lang3.ArrayUtils.subarray((java.lang.Object[][]) objMapArray31, 516, 203);
        org.junit.Assert.assertNotNull(mapArray1);
        org.junit.Assert.assertNotNull(objMapArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(objMap6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(objMap9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(objMap12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertNotNull(objMap15);
        org.junit.Assert.assertNotNull(mapArray17);
        org.junit.Assert.assertNotNull(objMapArray18);
        org.junit.Assert.assertNotNull(objMapArray28);
        org.junit.Assert.assertNotNull(objMapArray29);
        org.junit.Assert.assertNotNull(objMapArray30);
        org.junit.Assert.assertNotNull(objMapArray31);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test27576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27576");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.add(doubleArray1, (double) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) (byte) 1, 1);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray10, (double) 27);
        double[] doubleArray13 = new double[] {};
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 3, (double) 1L);
        double[] doubleArray17 = new double[] {};
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray17, (double) '4', (double) (byte) -1);
        double[] doubleArray25 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray17, doubleArray25);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray13, doubleArray25);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.add(doubleArray25, (double) 24);
        double[] doubleArray31 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray29, (int) (byte) 0);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray10, doubleArray31);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray10, 0, 24);
        double[] doubleArray36 = new double[] {};
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray36, (double) '4', (double) (byte) -1);
        double[] doubleArray44 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray36, doubleArray44);
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray36, (double) 10.0f, (int) '4');
        double[] doubleArray49 = new double[] {};
        int int52 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray49, (double) '4', (double) (byte) -1);
        double[] doubleArray57 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray49, doubleArray57);
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray49, (double) 10.0f, (int) '4');
        double[] doubleArray63 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray49, (double) (byte) -1);
        double[] doubleArray64 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray49);
        double[] doubleArray65 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray36, doubleArray64);
        int int68 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray65, (double) 139, 10);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray35, doubleArray65);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray35, (double) 8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, 10.0, 35.0, 24.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, 35.0, 24.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test27577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27577");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ESLAFIHAAAEURTIHAAAEURTIHAAAEURT", 58, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27578");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 35);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray7, "                              HIHIH                                                        aaa");
        java.lang.Float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        java.lang.Class<?> wildcardClass12 = floatArray11.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0                              HIHIH                                                        aaa0.0                              HIHIH                                                        aaa-1.0" + "'", str10, "100.0                              HIHIH                                                        aaa0.0                              HIHIH                                                        aaa-1.0");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test27579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27579");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray7);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.contains(byteArray8, (byte) 10);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray11, (byte) 10, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray11);
        byte[] byteArray17 = org.apache.commons.lang3.ArrayUtils.add(byteArray11, (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray17);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 10, 1]");
    }

    @Test
    public void test27580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                              ", "{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27581");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray16 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray23 = new boolean[] { false, false, true, true, false, true };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray16, booleanArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, false);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray23, false, (int) (short) 0);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray8, booleanArray23);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray30, false, 13);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.add(booleanArray30, true);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray35, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[true, true, true, false, false, false, true, true, false, true, true]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
    }

    @Test
    public void test27582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27582");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("{10,.,0,a,1,.,0}", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27583");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        boolean[] booleanArray22 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray29 = new boolean[] { false, false, true, true, false, true };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray29);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray29);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray29);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray6, booleanArray29);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray6, false);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray6, 0, 164);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[true, false, false, false, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[true, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, false, false, false, true, false]");
    }

    @Test
    public void test27584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27584");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, (double) (-1));
        double[] doubleArray13 = new double[] {};
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray13, (double) '4', (double) (byte) -1);
        double[] doubleArray21 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray13, doubleArray21);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 100, (double) 100);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray13, 0, 0);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray8, doubleArray13);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 8);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 14, 64, (-1.0d));
        double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray8);
        double[] doubleArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray36);
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray37, (double) 'a');
        double[] doubleArray42 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray39, 115, 1000);
        int int44 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray42, (double) 18);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test27585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27585");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray5);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 33, (double) 96);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test27586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27586");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("... AA-11001011000-11001011000-11001011000-11 AAAHIHI...", "{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0" + "'", str9, "100  10110010AA1  10110010AA-1  10110010AA0  10110010AA1  10110010AA0");
    }

    @Test
    public void test27587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27587");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 3);
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 48);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
    }

    @Test
    public void test27588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27588");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        int int17 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) 1L);
        double[] doubleArray18 = new double[] {};
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray18, (double) '4', (double) (byte) -1);
        double[] doubleArray26 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray18, doubleArray26);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray18, (double) 100, (double) 100);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray18);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (-1L));
        double[] doubleArray37 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray39 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray37, (double) 100);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray39, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray39);
        double[] doubleArray45 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray43, (double) 10.0f);
        double[] doubleArray47 = org.apache.commons.lang3.ArrayUtils.add(doubleArray45, 100.0d);
        int int50 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray47, (double) 35, (double) 99);
        double[] doubleArray52 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray47, (double) (short) 10);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray52, (double) 0.0f);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray33, doubleArray52);
        double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray33, 0, (int) (byte) 10);
        double[] doubleArray60 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray58, (double) 100);
        double[] doubleArray61 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray58);
        int int65 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray58, (double) 8, 21, (double) 799);
        double[] doubleArray66 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray58);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
    }

    @Test
    public void test27589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27589");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 10.0f, (int) '4');
        double[] doubleArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 1.0f };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray16);
        double[] doubleArray18 = new double[] {};
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray16, doubleArray18);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.add(doubleArray16, (double) (short) -1);
        double[] doubleArray22 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray16);
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.add(doubleArray16, (double) 3);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray24, 10, (int) (byte) 10);
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray24, (int) (byte) 1);
        double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray24);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray24, 28, 7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
    }

    @Test
    public void test27590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "10110010aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27591");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, 'a');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.add(charArray11, '#');
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1110", charArray13);
        char[] charArray22 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray24 = org.apache.commons.lang3.ArrayUtils.add(charArray22, 'a');
        char[] charArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray22, '#');
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.subarray(charArray22, (int) 'a', 35);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                aaa", charArray22);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray13, charArray22);
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray22);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray32);
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray32, 'a');
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##4a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##4a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, 4, a, #, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4, a,  , 4,  ]");
    }

    @Test
    public void test27592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27592");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 1, false);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) 'a', 0);
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray26, false);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray26);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test27593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27593");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray17, false);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray17, false, (int) ' ');
        boolean[] booleanArray28 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray33 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray33, false);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray35);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray35);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray28, booleanArray35);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray38);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.add(booleanArray38, 4, true);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray17, booleanArray38);
        boolean[] booleanArray49 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray54 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray56 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray54, false);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray56);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray56);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray49, booleanArray56);
        boolean[] booleanArray66 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray73 = new boolean[] { false, false, true, true, false, true };
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray66, booleanArray73);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray66);
        int int78 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray66, true, (int) '#');
        boolean boolean79 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray49, booleanArray66);
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray38, booleanArray66);
        boolean[] booleanArray86 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray91 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray93 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray91, false);
        boolean boolean94 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray93);
        boolean[] booleanArray95 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray93);
        boolean[] booleanArray96 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray86, booleanArray93);
        boolean[] booleanArray97 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray66, booleanArray93);
        int int99 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray97, false);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, true, false, true, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(booleanArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray49), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertNotNull(booleanArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray56), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray66), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray73), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(booleanArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray86), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray91);
        org.junit.Assert.assertNotNull(booleanArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray93), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(booleanArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray95), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray96), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray97);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray97), "[true, false, false, false, true, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 9 + "'", int99 == 9);
    }

    @Test
    public void test27594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("H                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h                      " + "'", str1, "h                      ");
    }

    @Test
    public void test27595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0", "...ihihaaa aa,aaaaaaaaaaa,aaaaaaaaaaa,aaaaaaaaaaa,");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0" + "'", str2, "                   0HIHIH0HIHIH10HIHIH1HIHIH10HIHIH0");
    }

    @Test
    public void test27596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27596");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.util.Map<java.lang.Object, java.lang.Object> objMap2 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray0);
        java.lang.Double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray3);
        java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray3);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray6);
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray6);
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray9);
        java.util.Map<java.lang.Object, java.lang.Object> objMap11 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) doubleArray9);
        java.util.Map[] mapArray13 = new java.util.Map[4];
        @SuppressWarnings("unchecked")
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray14 = (java.util.Map<java.lang.Object, java.lang.Object>[]) mapArray13;
        objMapArray14[0] = objMap2;
        objMapArray14[1] = objMap5;
        objMapArray14[2] = objMap8;
        objMapArray14[3] = objMap11;
        java.lang.Object obj23 = null;
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(objMapArray14, obj23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) objMapArray14, (java.lang.Object) "hIHIH######################");
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray27 = org.apache.commons.lang3.ArrayUtils.clone(objMapArray14);
        int[] intArray32 = new int[] { (-1), '4', (byte) 10, 1 };
        int int35 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, (int) (short) 100, 100);
        int[] intArray36 = new int[] {};
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray36, (int) (short) 1);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.subarray(intArray36, (int) (short) 0, (int) (short) -1);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray32, intArray36);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.add(intArray32, 0);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.add(intArray32, 94);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.contains(intArray32, (int) 'a');
        int[] intArray49 = new int[] {};
        int[] intArray51 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray49, (int) (short) 1);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray49, 100);
        int int56 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray49, (int) '#', 0);
        int[] intArray61 = new int[] { (-1), '4', (byte) 10, 1 };
        int int64 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray61, (int) (short) 100, 100);
        int[] intArray65 = new int[] {};
        int[] intArray67 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray65, (int) (short) 1);
        int[] intArray70 = org.apache.commons.lang3.ArrayUtils.subarray(intArray65, (int) (short) 0, (int) (short) -1);
        boolean boolean71 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray61, intArray65);
        int[] intArray73 = org.apache.commons.lang3.ArrayUtils.add(intArray61, 0);
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray61, (int) 'a', 0);
        int[] intArray77 = org.apache.commons.lang3.ArrayUtils.addAll(intArray49, intArray61);
        int[] intArray79 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray49, (int) '4');
        boolean boolean80 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray32, intArray79);
        int int82 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray32, 100);
        int[] intArray84 = org.apache.commons.lang3.ArrayUtils.add(intArray32, (int) (byte) 100);
        int[] intArray86 = org.apache.commons.lang3.ArrayUtils.add(intArray84, 33);
        java.lang.Integer[] intArray87 = org.apache.commons.lang3.ArrayUtils.toObject(intArray84);
        java.util.Map<java.lang.Object, java.lang.Object>[] objMapArray88 = org.apache.commons.lang3.ArrayUtils.removeElement(objMapArray14, (java.lang.Object) intArray87);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(objMap2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(objMap5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(objMap8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertNotNull(objMap11);
        org.junit.Assert.assertNotNull(mapArray13);
        org.junit.Assert.assertNotNull(objMapArray14);
        org.junit.Assert.assertNotNull(objMapArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objMapArray27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-1, 52, 10, 1, 94]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-1, 52, 10, 1, 100]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-1, 52, 10, 1, 100, 33]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertNotNull(objMapArray88);
    }

    @Test
    public void test27597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27597");
        org.apache.commons.lang3.ArrayUtils arrayUtils0 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray1 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils0 };
        org.apache.commons.lang3.ArrayUtils arrayUtils2 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray3 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils2 };
        org.apache.commons.lang3.ArrayUtils arrayUtils4 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray5 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils4 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray6 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray1, arrayUtilsArray3, arrayUtilsArray5 };
        org.apache.commons.lang3.ArrayUtils arrayUtils7 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray8 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils7 };
        org.apache.commons.lang3.ArrayUtils arrayUtils9 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray10 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils9 };
        org.apache.commons.lang3.ArrayUtils arrayUtils11 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray12 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils11 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray13 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray8, arrayUtilsArray10, arrayUtilsArray12 };
        org.apache.commons.lang3.ArrayUtils arrayUtils14 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray15 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils14 };
        org.apache.commons.lang3.ArrayUtils arrayUtils16 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray17 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils16 };
        org.apache.commons.lang3.ArrayUtils arrayUtils18 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray19 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils18 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray20 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray15, arrayUtilsArray17, arrayUtilsArray19 };
        org.apache.commons.lang3.ArrayUtils arrayUtils21 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray22 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils21 };
        org.apache.commons.lang3.ArrayUtils arrayUtils23 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray24 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils23 };
        org.apache.commons.lang3.ArrayUtils arrayUtils25 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray26 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils25 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray27 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray22, arrayUtilsArray24, arrayUtilsArray26 };
        org.apache.commons.lang3.ArrayUtils arrayUtils28 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray29 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils28 };
        org.apache.commons.lang3.ArrayUtils arrayUtils30 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray31 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils30 };
        org.apache.commons.lang3.ArrayUtils arrayUtils32 = new org.apache.commons.lang3.ArrayUtils();
        org.apache.commons.lang3.ArrayUtils[] arrayUtilsArray33 = new org.apache.commons.lang3.ArrayUtils[] { arrayUtils32 };
        org.apache.commons.lang3.ArrayUtils[][] arrayUtilsArray34 = new org.apache.commons.lang3.ArrayUtils[][] { arrayUtilsArray29, arrayUtilsArray31, arrayUtilsArray33 };
        org.apache.commons.lang3.ArrayUtils[][][] arrayUtilsArray35 = new org.apache.commons.lang3.ArrayUtils[][][] { arrayUtilsArray6, arrayUtilsArray13, arrayUtilsArray20, arrayUtilsArray27, arrayUtilsArray34 };
        org.apache.commons.lang3.ArrayUtils[][][] arrayUtilsArray38 = org.apache.commons.lang3.ArrayUtils.subarray(arrayUtilsArray35, 3, 21);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(arrayUtilsArray35);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(arrayUtilsArray35);
        org.junit.Assert.assertNotNull(arrayUtilsArray1);
        org.junit.Assert.assertNotNull(arrayUtilsArray3);
        org.junit.Assert.assertNotNull(arrayUtilsArray5);
        org.junit.Assert.assertNotNull(arrayUtilsArray6);
        org.junit.Assert.assertNotNull(arrayUtilsArray8);
        org.junit.Assert.assertNotNull(arrayUtilsArray10);
        org.junit.Assert.assertNotNull(arrayUtilsArray12);
        org.junit.Assert.assertNotNull(arrayUtilsArray13);
        org.junit.Assert.assertNotNull(arrayUtilsArray15);
        org.junit.Assert.assertNotNull(arrayUtilsArray17);
        org.junit.Assert.assertNotNull(arrayUtilsArray19);
        org.junit.Assert.assertNotNull(arrayUtilsArray20);
        org.junit.Assert.assertNotNull(arrayUtilsArray22);
        org.junit.Assert.assertNotNull(arrayUtilsArray24);
        org.junit.Assert.assertNotNull(arrayUtilsArray26);
        org.junit.Assert.assertNotNull(arrayUtilsArray27);
        org.junit.Assert.assertNotNull(arrayUtilsArray29);
        org.junit.Assert.assertNotNull(arrayUtilsArray31);
        org.junit.Assert.assertNotNull(arrayUtilsArray33);
        org.junit.Assert.assertNotNull(arrayUtilsArray34);
        org.junit.Assert.assertNotNull(arrayUtilsArray35);
        org.junit.Assert.assertNotNull(arrayUtilsArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test27598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27598");
        java.lang.Character[] charArray9 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, '4');
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray11);
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.toObject(charArray11);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH!ih", charArray11);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 3, 'a');
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       AAA", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " HIHIH10  ", charArray11);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a#aa444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a#aa444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, a, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test27599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27599");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray4, (short) (byte) 10);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray18);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray18, (short) (byte) -1);
        java.lang.Short[] shortArray25 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray25, (short) (byte) 100);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray27, (short) (byte) 1, 1);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray27, (short) -1);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray27);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray18, shortArray27);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray18);
        short[] shortArray36 = null;
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray18, shortArray36);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[-1]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[-1]");
    }

    @Test
    public void test27600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27600");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        int int7 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, (float) 2, 10);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, 1, (float) 1L);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 43);
        java.lang.Float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray1);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test27601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27602");
        java.lang.String[] strArray3 = new java.lang.String[] { "              1110               ", "100", "                              HIHIH" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray3 };
        java.lang.String[] strArray8 = new java.lang.String[] { "              1110               ", "100", "                              HIHIH" };
        java.lang.String[][] strArray9 = new java.lang.String[][] { strArray8 };
        java.lang.String[][][] strArray10 = new java.lang.String[][][] { strArray4, strArray9 };
        java.lang.String[][][] strArray11 = org.apache.commons.lang3.ArrayUtils.clone(strArray10);
        java.lang.String[][][] strArray14 = org.apache.commons.lang3.ArrayUtils.subarray(strArray11, 27, (int) ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test27603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27603");
        boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray0, false, (int) '4');
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray0, 35, 36);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[]");
    }

    @Test
    public void test27604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27604");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray7, (int) (byte) 0, 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray6, intArray7);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray6, (int) (byte) -1, 10);
        java.lang.Integer[] intArray16 = org.apache.commons.lang3.ArrayUtils.toObject(intArray6);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray6);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray6);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray6, 91, 18);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test27605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27605");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("           ...", 52, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "           ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27606");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 1, false);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, (int) 'a', 0);
        java.lang.Boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray24);
        boolean[] booleanArray26 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray26);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray26, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test27607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27607");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(".20101-10012");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".20101-1001" + "'", str1, ".20101-1001");
    }

    @Test
    public void test27608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27608");
        java.lang.Boolean[] booleanArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY;
        boolean[] booleanArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray0, true);
        boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[]");
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[]");
    }

    @Test
    public void test27609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27609");
        java.lang.Character[][] charArray0 = new java.lang.Character[][] {};
        java.lang.Character[] charArray2 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray4 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray6 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray8 = new java.lang.Character[] { ' ' };
        java.lang.Character[] charArray10 = new java.lang.Character[] { ' ' };
        java.lang.Character[][] charArray11 = new java.lang.Character[][] { charArray2, charArray4, charArray6, charArray8, charArray10 };
        java.lang.Character[][] charArray12 = org.apache.commons.lang3.ArrayUtils.addAll(charArray0, charArray11);
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) charArray13);
        java.lang.Character[][] charArray15 = org.apache.commons.lang3.ArrayUtils.add(charArray12, charArray13);
        java.lang.Character[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray16);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray17);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
    }

    @Test
    public void test27610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27610");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("100.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIlll-1.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIlll-1.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIlll10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIlll0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0lllIIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.01lllIIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.1-lllIIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.1-lllIIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.001" + "'", str1, "0.0lllIIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.01lllIIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.1-lllIIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.1-lllIIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.001");
    }

    @Test
    public void test27611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27611");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     HI      44444444444444444444444444444                                AAA44444444HI     HI      ", "hi!4hi! hi!ahi!ahi!4");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap3 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '     HI      44444444444444444444444444444                                AAA44444444HI     HI      ', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27612");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("{-1,0,1,100,1,0}", "         AAa                ", 26);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test27613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27613");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444444444444444444444A1A10AaaaaaaA", "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi.", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27614");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AaaaA                                                                                               AAAAAaEAAAHFALSE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa                                                                                               aaaaaaeaaahfalse" + "'", str1, "aaaaa                                                                                               aaaaaaeaaahfalse");
    }

    @Test
    public void test27616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("      AAAA1  ", "1.0100.010.010.0-1.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27617");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        boolean[] booleanArray12 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray19 = new boolean[] { false, false, true, true, false, true };
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray12, booleanArray19);
        boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray19);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray19);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray19, false);
        int int26 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) charArray4, (java.lang.Object) booleanArray19, 10);
        char[] charArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[]");
    }

    @Test
    public void test27618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27618");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                {10.0,1.0}                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaa", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27619");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) -1, (int) (byte) -1);
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15, (short) 1);
        short[] shortArray24 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray24, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray24);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray17, shortArray24);
        short[] shortArray36 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray36, (short) (byte) 0, (-1));
        short[] shortArray40 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray17, shortArray36);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray17);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray17);
        java.lang.Short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        java.lang.Short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray43);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray44, (short) (byte) -1);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray46, (short) 100, (int) (byte) 10);
        short[] shortArray56 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int59 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray56, (short) (byte) 0, (-1));
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.add(shortArray56, (short) (byte) -1);
        short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.add(shortArray56, (short) (byte) 1);
        int int66 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray63, (short) (byte) 1, (int) ' ');
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.add(shortArray63, (short) 0);
        int int71 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray68, (short) (byte) -1, 26);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray46, shortArray68);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.contains(shortArray46, (short) 1);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray46);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray40), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[0, 0, 10, 1, 10, 0, 0, 0, 10, 1, 10, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test27620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27620");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 35, (double) 99);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) (short) 10);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray18, (double) 0.0f);
        java.lang.Double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test27621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("{1  ,1,-1, ,1, ,97, ,1,1  , }", "false     Hi      false     Hi      true     Hi      false     Hi      false", "001-10101001-10101001-10101001-10101001-10101001-10                                 aAAAa                                                                                               aaaaaA1-10101001-10101001-10101001-10101001-10101001-10101001-1010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{100,1,-1,0,1,0,97,0,1,100,0}" + "'", str3, "{100,1,-1,0,1,0,97,0,1,100,0}");
    }

    @Test
    public void test27622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27622");
        char[] charArray2 = new char[] { ' ', '#' };
        char[] charArray5 = new char[] { ' ', '#' };
        char[] charArray8 = new char[] { ' ', '#' };
        char[] charArray11 = new char[] { ' ', '#' };
        char[][] charArray12 = new char[][] { charArray2, charArray5, charArray8, charArray11 };
        char[] charArray19 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 'a');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray19, ' ');
        char[] charArray30 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray30, 'a');
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray30, '#');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray34);
        char[][] charArray37 = org.apache.commons.lang3.ArrayUtils.add(charArray12, charArray34);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.add(charArray34, 'a');
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray39);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , #]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , 4,  , a, a, 4, a]");
    }

    @Test
    public void test27623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27623");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.Byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) byteArray5);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) byteArray5);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) byteArray5);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 100, 1, 0, -1]");
    }

    @Test
    public void test27624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27624");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                           AA...IHIHAAA...I                                           ", "aaaa10 aaaa10 aaaa10 a#######################ihaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27625");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray4);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 28, (-1));
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray5, 94, (int) (short) 1);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray5);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test27626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27626");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray9, 'a');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, '#');
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.add(charArray9, 2, '4');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "a#4a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "a#4a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, #, 4, a, 4, 4, 4]");
    }

    @Test
    public void test27627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                              aaa", 516, "...IAAHIAAHIAAHIAAH...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAH                                                                                              aaa...IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHI" + "'", str3, "...IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAH                                                                                              aaa...IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHIAAHIAAH......IAAHIAAHI");
    }

    @Test
    public void test27628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27628");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        java.lang.Byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray13);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray13, (byte) 10, 96);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray20, (byte) -1, (int) 'a');
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray20);
        byte[] byteArray25 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        byte[] byteArray26 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.add(byteArray20, (byte) 100);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray13, byteArray28);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1 };
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray32, (byte) -1, (int) 'a');
        byte[] byteArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray32, (byte) 10);
        byte[] byteArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray32);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray41, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray45 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray41);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray41);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray46);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.contains(byteArray47, (byte) 10);
        byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray47);
        byte[] byteArray51 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray32, byteArray50);
        java.lang.Byte[] byteArray52 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray50);
        byte[] byteArray53 = org.apache.commons.lang3.ArrayUtils.clone(byteArray50);
        java.lang.Byte[] byteArray54 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray53);
        java.lang.Byte[] byteArray55 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray53);
        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 1 };
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray58, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray62 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray58);
        byte[] byteArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray58);
        byte[] byteArray64 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray63);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 1 };
        int int70 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray67, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray71 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray67);
        byte[] byteArray72 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray67);
        int int75 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray72, (byte) 100, 0);
        byte[] byteArray76 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray63, byteArray72);
        byte[] byteArray79 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray72, (int) (short) 10, (int) (byte) 100);
        boolean boolean81 = org.apache.commons.lang3.ArrayUtils.contains(byteArray72, (byte) 0);
        byte[] byteArray82 = org.apache.commons.lang3.ArrayUtils.clone(byteArray72);
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray53, byteArray82);
        byte[] byteArray84 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray29, byteArray53);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 1, 100, 1, 10, 1, 100]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[-1, 1, 100, 1, 10, 1, 100, 10, 1]");
    }

    @Test
    public void test27629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27629");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) -1);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.subarray(longArray26, (int) (short) 0, 55);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray26, 100L);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray26, (long) 17, 223);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0, -1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0, -1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test27630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27630");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray13, false);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray13);
        java.lang.Boolean[] booleanArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) booleanArray21, "0");
        java.lang.Boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray21);
        boolean[] booleanArray25 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray21);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray25);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.add(booleanArray25, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "false0false0true0true0false0true" + "'", str23, "false0false0true0true0false0true");
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray25), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test27631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27631");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIHIh", "......aaahi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27632");
        char[] charArray3 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray3);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.subarray(charArray3, 8, (int) ' ');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.clone(charArray3);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.clone(charArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, '4');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #,  ]");
    }

    @Test
    public void test27633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27633");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        long[] longArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray0);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.add(longArray1, (long) 24);
        long[] longArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray1);
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray1, (long) ' ');
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[24]");
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test27634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27634");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        java.lang.Long[] longArray21 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray21);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray22);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray14);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(longArray14, 0L);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray14, (long) 42, 99);
        java.lang.Long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toObject(longArray14);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(longArray30);
    }

    @Test
    public void test27635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27635");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("41.0444444aaaaaa4444444444444444444444444444444441.04444444   ", "11001011000aa####10-aa####1011001011000aa####10-aa####1011001011000aa####10-aa####1011aa####10 aa####10aa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27636");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray25, (long) 0);
        double[] doubleArray29 = new double[] { 1.0f };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray29);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray29, (int) (short) 10, (int) ' ');
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray27, (java.lang.Object) doubleArray29);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.add(longArray27, 0L);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray36);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(longArray36, (long) 94);
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray36, (long) 19);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.add(longArray36, 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 1, 100, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 1, 100, 0, 0, 0]");
    }

    @Test
    public void test27637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0" + "'", str1, "aaa 1.0 aaa 100.0 aaa 10.0 aaa 10.0 aaa -1.0");
    }

    @Test
    public void test27638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27638");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        java.lang.Short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray6);
        java.lang.Short[] shortArray15 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray15, (short) 1);
        short[] shortArray24 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray24, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray24);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray17, shortArray24);
        java.lang.Short[] shortArray30 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray29);
        java.lang.Short[] shortArray31 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray30);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray31);
        short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.add(shortArray32, (short) 0);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray32);
        short[] shortArray36 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray6, shortArray32);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.add(shortArray32, (int) (byte) 1, (short) (byte) 1);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray32, (short) (byte) 100, 31);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray34), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 0, 10, 1, 10, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[-1, 1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test27639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27639");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, (int) ' ', 10);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.toObject(intArray8);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18, 35);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.subarray(intArray21, (int) (short) 100, (int) '4');
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.add(intArray21, (int) '#');
        java.lang.Integer[] intArray27 = org.apache.commons.lang3.ArrayUtils.toObject(intArray21);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, 35);
        java.lang.Integer[] intArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray27);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, (int) (short) 100);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, 50);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.subarray(intArray34, (int) '#', 311);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.add(intArray34, 25);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[35]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[25]");
    }

    @Test
    public void test27640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaHihihTRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRUETRaaa                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444hiaaaaaaaa", 18, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444hiaaaaaaaa" + "'", str3, "44444444hiaaaaaaaa");
    }

    @Test
    public void test27642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                              aaa", "... aaa", "...IIIIIIIIIIIIII...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test27643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27643");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        java.lang.Short[] shortArray18 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray18, (short) 1);
        short[] shortArray27 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray27, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray27);
        short[] shortArray32 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray20, shortArray27);
        java.lang.Short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray32);
        java.lang.Short[] shortArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray33);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray34);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.add(shortArray35, (short) 0);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray35);
        short[] shortArray39 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray15, shortArray35);
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.add(shortArray39, (int) (byte) 0, (short) (byte) 100);
        short[] shortArray49 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray49, (short) (byte) 0, (-1));
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.add(shortArray49, (short) (byte) -1);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.add(shortArray49, (short) (byte) 1);
        short[] shortArray58 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray56, (short) (byte) 1);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray39, shortArray56);
        java.lang.Short[] shortArray60 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray56);
        short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray60, (short) (byte) 0);
        short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray60, (short) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray32), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray39), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray62), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[0, 0, 10, 1, 10, 0, 1]");
    }

    @Test
    public void test27644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27644");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.remove(longArray23, (int) (short) 1);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray23);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.add(longArray23, (long) (short) 0);
        long[] longArray34 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.add(longArray34, (long) (short) 1);
        long[] longArray40 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.contains(longArray40, (long) ' ');
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.addAll(longArray36, longArray40);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray43);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray23, longArray43);
        java.lang.Long[] longArray46 = org.apache.commons.lang3.ArrayUtils.toObject(longArray43);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.add(longArray43, (long) 226);
        int int50 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray48, (long) 7);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[97, 0, 1, 100, 0, -1, -1, 0, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[0, -1, -1, 1, 0, 100, 1, 0, 97, 226]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test27645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27645");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1.0a0.0                              HIHIH                                                      ...", "{100,1,-1,0,1,0}");
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) booleanArray17, (java.lang.Object[]) strArray21);
        boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        java.lang.Boolean[] booleanArray28 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray28, false);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray30);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray30);
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray32);
        boolean[] booleanArray40 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray47 = new boolean[] { false, false, true, true, false, true };
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray40, booleanArray47);
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray47, false);
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray47, false, (int) (short) 0);
        boolean[] booleanArray54 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray32, booleanArray47);
        int int57 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray54, false, 13);
        boolean[] booleanArray58 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray54);
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray58, true, 17);
        boolean[] booleanArray68 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray75 = new boolean[] { false, false, true, true, false, true };
        boolean boolean76 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray68, booleanArray75);
        boolean[] booleanArray77 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray75);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray75);
        int int80 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray75, false);
        boolean[] booleanArray81 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray75);
        boolean[] booleanArray82 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray58, booleanArray81);
        boolean boolean83 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray23, booleanArray58);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(booleanArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray58), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(booleanArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray68), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray75), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(booleanArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray77), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 4 + "'", int80 == 4);
        org.junit.Assert.assertNotNull(booleanArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray81), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray82), "[true, true, true, false, false, false, true, true, false, true, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test27646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27646");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0.0       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test27647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("-1a-1011001a0aaaaiaaa0aaaiaaa0aaaiaaa0aaaaaaiaaa0aaai", "-1a10a0a10a1a10a0a0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27648");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        java.lang.Float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) floatArray8);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8, (float) 44);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray8);
        java.lang.Byte[] byteArray16 = new java.lang.Byte[] { (byte) 1, (byte) -1, (byte) 100 };
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16, (byte) 1);
        byte[] byteArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray16);
        java.lang.Byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray16);
        java.lang.Byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray20);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isSameLength((java.lang.Object[]) floatArray8, (java.lang.Object[]) byteArray20);
        java.lang.Float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray8);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2.052.0-1.0" + "'", str9, "2.052.0-1.0");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(floatArray23);
    }

    @Test
    public void test27649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27649");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27650");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE", "falseaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue444444444444444444444444,4,4,4}a,#,a{..aaaaaaaaaaaaaaaaaaaaafalsefalseaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue444444444444444444444444,4,4,4}a,#,a{..aaaaaaaaaaaaaaaaaaaaafalsetrueaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue444444444444444444444444,4,4,4}a,#,a{..aaaaaaaaaaaaaaaaaaaaafalsetrueaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue444444444444444444444444,4,4,4}a,#,a{..aaaaaaaaaaaaaaaaaaaaafalsefalseaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue444444444444444444444444,4,4,4}a,#,a{..aaaaaaaaaaaaaaaaaaaaafalsetrue");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27651");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        short[] shortArray11 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) -1);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, (short) (byte) 1);
        short[] shortArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray13, (short) (byte) 1);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.clone(shortArray15);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.add(shortArray15, (int) (short) 1, (short) 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray15);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test27652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaa" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaa");
    }

    @Test
    public void test27653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27653");
        char[] charArray4 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray5 = org.apache.commons.lang3.ArrayUtils.toObject(charArray4);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.clone(charArray4);
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, 8, (int) ' ');
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray4, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.subarray(charArray4, 74, 165);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray14, '#', 0);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("falsefalsetruetruefalsetrue44444444444444444444444444444444444444", charArray14);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test27654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaa                                                            aaaA", "hi!4hi! hi! hi! hi!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa                                                            aaaA" + "'", str2, "aaa                                                            aaaA");
    }

    @Test
    public void test27655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27655");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH10HIHIH", " aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aaaA1      aaaA101      aitrueaaah", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27656");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, (int) ' ', 10);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.toObject(intArray8);
        java.lang.Integer[] intArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray18);
        java.lang.Integer[] intArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray19);
        java.lang.Integer[] intArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray19);
        int[] intArray22 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray19);
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.subarray(intArray22, 209, 209);
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray25, 2);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.subarray(intArray25, 65, 8);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
    }

    @Test
    public void test27657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27657");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (short) 10, 10);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.clone(floatArray8);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 24, 1000);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.contains(floatArray21, (float) 28);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test27658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27658");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, (-1L), 100L, 10L, 1L, 1L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray7, 0L);
        long[] longArray10 = org.apache.commons.lang3.ArrayUtils.clone(longArray7);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, -1, 100, 10, 1, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[0, -1, 100, 10, 1, 1]");
    }

    @Test
    public void test27659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27659");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  aaaa10");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "aaaHIHIH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  aaaa10" + "'", str2, "  aaaa10");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test27660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27660");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 0.0d, 10.0d };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        java.lang.Double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Short[] shortArray7 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray7, (short) 1);
        short[] shortArray16 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray16, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray16);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray9, shortArray16);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.clone(shortArray9);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray22, (short) 0, 0);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains((java.lang.Object[]) doubleArray4, (java.lang.Object) shortArray22);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.contains(shortArray22, (short) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test27661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27661");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray4);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray9);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray10);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
    }

    @Test
    public void test27662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  aaahi  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaahi" + "'", str1, "aaahi");
    }

    @Test
    public void test27663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27663");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.contains(intArray4, (-1));
        int[] intArray21 = new int[] { (-1), '4', (byte) 10, 1 };
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray21, (int) (short) 100, 100);
        int[] intArray25 = new int[] {};
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray25, (int) (short) 1);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.subarray(intArray25, (int) (short) 0, (int) (short) -1);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray21, intArray25);
        int[] intArray33 = org.apache.commons.lang3.ArrayUtils.add(intArray21, 0);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray33);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.contains(intArray34, 0);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.add(intArray34, 100);
        int[] intArray39 = new int[] {};
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray39, (int) (short) 1);
        int[] intArray44 = org.apache.commons.lang3.ArrayUtils.subarray(intArray39, (int) (short) 0, (int) (short) -1);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.add(intArray39, (int) (byte) 100);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.clone(intArray46);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.addAll(intArray34, intArray46);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray34, 100, 32);
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray34, 0);
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray34);
        java.lang.Integer[] intArray55 = org.apache.commons.lang3.ArrayUtils.toObject(intArray34);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1, 52, 10, 1, -1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-1, 52, 10, 1, -1, 52, 10, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[100]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 52, 10, 1, -1, 52, 10, 1, 0, 100]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray55);
    }

    @Test
    public void test27664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27664");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray6, ' ');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, 'a', (int) (byte) 10);
        char[] charArray17 = org.apache.commons.lang3.ArrayUtils.add(charArray11, (int) (byte) 0, 'a');
        int int19 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray17, '#');
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray17);
        char[] charArray27 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray29 = org.apache.commons.lang3.ArrayUtils.add(charArray27, 'a');
        char[] charArray31 = org.apache.commons.lang3.ArrayUtils.add(charArray27, ' ');
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray27);
        char[] charArray36 = new char[] { '4', ' ', ' ' };
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.addAll(charArray27, charArray36);
        char[] charArray39 = org.apache.commons.lang3.ArrayUtils.add(charArray37, ' ');
        java.lang.Character[] charArray46 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray48 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray46, '4');
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray48);
        java.lang.Character[] charArray50 = org.apache.commons.lang3.ArrayUtils.toObject(charArray48);
        char[] charArray52 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray50, 'a');
        char[] charArray53 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray50);
        java.lang.Character[] charArray60 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray62 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray60, '4');
        java.lang.Character[] charArray63 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray60);
        char[] charArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray60);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray64);
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) charArray50, (java.lang.Object) charArray64, 94);
        char[] charArray68 = org.apache.commons.lang3.ArrayUtils.addAll(charArray39, charArray64);
        int int71 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray39, 'a', 0);
        char[] charArray72 = org.apache.commons.lang3.ArrayUtils.addAll(charArray20, charArray39);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "a 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "a 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a,  , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "a 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "a 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a,  , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), " 4 aa44  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ , 4,  , a, a, 4, 4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), " 4 aa44   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[ , 4,  , a, a, 4, 4,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), " 4 aa44   444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), " 4 aa44   444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[ , 4,  , a, a, 4, 4,  ,  ,  , 4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "a 4 aa4 4 aa44   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "a 4 aa4 4 aa44   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[a,  , 4,  , a, a, 4,  , 4,  , a, a, 4, 4,  ,  ,  ]");
    }

    @Test
    public void test27665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27665");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        float[] floatArray9 = new float[] { (byte) 10 };
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.add(floatArray9, (float) (-1));
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray9);
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray7, floatArray9);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.clone(floatArray9);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (int) (byte) 10, 164);
        float[] floatArray19 = new float[] { (byte) 10 };
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray19, (float) (-1));
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray19);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray19, (float) 2, 10);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(floatArray19, 10.0f);
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray19, (float) 13, 200);
        float[] floatArray32 = new float[] { (byte) 10 };
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.add(floatArray32, (float) (-1));
        float[] floatArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray32);
        float[] floatArray38 = org.apache.commons.lang3.ArrayUtils.add(floatArray35, (int) (short) 0, (float) (short) -1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray35);
        float[] floatArray41 = new float[] { (byte) 10 };
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray41, (float) (-1));
        float[] floatArray45 = org.apache.commons.lang3.ArrayUtils.add(floatArray43, (float) '4');
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray45);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.contains(floatArray45, (float) 10);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray45, 10.0f, (int) (byte) 10);
        int int54 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray45, (float) (short) 1, 0);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray35, floatArray45);
        java.lang.Float[] floatArray62 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray62, 1.0f);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray35, floatArray64);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray19, floatArray35);
        float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.clone(floatArray19);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray17, floatArray19);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[-1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray45), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test27666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA0Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA100Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1", 67, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA0Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA100Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1" + "'", str3, "-1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA0Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA100Aaa{0,10,10,0,0,-1,10,0,10,1,10,0,0}aaaA1");
    }

    @Test
    public void test27667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27667");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray8);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) charArray10);
        java.lang.Character[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray13, '4');
        java.lang.String str17 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) charArray15, "{-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      {-1,10,10,1,10,0,0}      ");
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.toObject(charArray15);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{4,4,4,a,#,a}" + "'", str17, "{4,4,4,a,#,a}");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, 4, 4, a, #, a]");
    }

    @Test
    public void test27668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27668");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray15);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray15, true);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, true);
        boolean[] booleanArray22 = org.apache.commons.lang3.ArrayUtils.remove(booleanArray18, 9);
        boolean[] booleanArray29 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray36 = new boolean[] { false, false, true, true, false, true };
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray29, booleanArray36);
        boolean[] booleanArray38 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray36);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.add(booleanArray36, false);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray40, true, 100);
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray40, true, 0);
        boolean boolean47 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray40);
        boolean[] booleanArray48 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray40);
        boolean boolean49 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray48);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, true, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray36), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(booleanArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray38), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(booleanArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray48), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test27669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27669");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "100.0                              HIHIH                                                        aaa0.0                              HIHIH                                                        aaa-1.0", (java.lang.CharSequence) "HIHIh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 196 + "'", int2 == 196);
    }

    @Test
    public void test27670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27670");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "aaa                                                                                               aaa", 97);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny(" HIHIH10     HIHIH0                                                                                 ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test27671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27671");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("true", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0" + "'", str4, "0.0----------------------------------------------------------------aaa---------------------------------1.0----------------------------------------------------------------aaa---------------------------------100.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa---------------------------------10.0----------------------------------------------------------------aaa----------------------------------1.0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
    }
}

